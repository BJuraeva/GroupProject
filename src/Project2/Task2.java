package Project2;

import java.util.Scanner;

/*
Check if a String is Palindrome: Determine whether a given string is
a palindrome, which means it reads the same forwards and
backward. For example, "madam" is a palindrome.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In: ");
        String givenString = inp.nextLine();
        //write your code below

        String reverse = "";
        boolean palindrome = true;
        boolean notPalindrome = false;
        for (int i = givenString.length() - 1; i >= 0; i--) {
            reverse += givenString.charAt(i);
        }
        if (reverse.equals(givenString)) {
            System.out.println(palindrome);
        } else {
            System.out.println(notPalindrome);
        }
    }
}
