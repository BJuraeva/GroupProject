package Project2;
/*
Reverse a String: Write a function to reverse a given string. For
example, given the input "Hello", the output should be "olleH"
 */
public class Task1 {
    public static String reverseString(String str) {
        int length = str.length();
        StringBuilder reversed = new StringBuilder();

        for (int i = length - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        String input = "Hello";
        String reversed = reverseString(input);
        System.out.println("Original string: " + input);
        System.out.println("Reversed string: " + reversed);
    }
}


