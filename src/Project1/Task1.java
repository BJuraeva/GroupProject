package Project1;

public class Task1 {
    /*
    Create a program that uses an array to store a list of
    temperatures for a week, and then uses a loop to find
    the highest and lowest temperature for the week.
     */
    public static void main(String[] args) {
        int[] temp = {65, 61, 61, 63, 59, 58, 70};
        int low = temp[0];
        int high = temp[0];
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > high) {
                high = temp[i];
            } else if (temp[i] < low) {
                low = temp[i];
            }
        }
        System.out.println("The highest temperature for the week is " + high+" degree");
        System.out.println("The lowest temperature for the week " + low+" degree");
    }
}
