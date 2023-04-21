package Project1;

public class Task6 {
    /*
    Write a java program to check whether a given
    number is prime or not?
     */
    public static void main(String[] args) {
        int num = 11;
        boolean primeNumber = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                primeNumber = false;
                break;
            }

        }
        if (primeNumber) {
            System.out.println(num + " is prime number");
        } else {

            System.out.println(num + " is composite number");
        }

    }
}
