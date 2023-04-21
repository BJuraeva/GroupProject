package Project1;

public class Task5 {
    /*
   Write a program to swap 2 numbers without a
   temporary variable? (logical operator)
    */
    public static void main(String[] args) {
        int x=20;
        int y=15;
        System.out.println("Before swap x="+x+" and y="+y);

        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After swap x="+x+" and y="+y);
    }
}
