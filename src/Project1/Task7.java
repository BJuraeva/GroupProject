package Project1;

public class Task7 {
    /*
    Write a Java Program to print the first 10 numbers of
    Fibonacci series
     */
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int sum;
        while(a<=55){
            System.out.print(a+" ");
            sum=a+b;
            a=b;
            b=sum;
        }

    }
}
