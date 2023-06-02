package Project2;

/*
We have to calculate the average of marks obtained in three subjects
by student A and by student B. Create class 'Marks' with an abstract
method 'getPercentage' that will be returning the average percentage
of marks. Provide implementation of abstract method in classes 'A'
and 'B'. The constructor of student A takes the marks in three
subjects as its parameters and the marks in four subjects as its
parameters for student B. Test your code
 */
public abstract class Task7Marks {
    double subject1;
    double subject2;
    double subject3;

    Task7Marks(double subject1, double subject2, double subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    abstract double getPercentage();
}

class A extends Task7Marks {

    A(double subject1, double subject2, double subject3) {
        super(subject1, subject2, subject3);
    }

    @Override
    double getPercentage() {
        double sum = subject1 + subject2 + subject3;
        double average = sum / 3;
        return average;
    }
}

class B extends Task7Marks {
    double subject4;
    B(double subject1, double subject2, double subject3, double subject4) {
        super(subject1, subject2, subject3);
        this.subject4 = subject4;
    }

    @Override
    double getPercentage() {
        double sum = subject1 + subject2 + subject3 + subject4;
        double average = sum / 4;
        return average;
    }
}
class Tester {
    public static void main(String[] args) {
        Task7Marks[] obj = {new A(60.0,70.5,90.5), new B(50.0,65.0,75.0,80.0)};
        for (Task7Marks x:obj){
            System.out.println(x.getPercentage());
        }

    }
}
