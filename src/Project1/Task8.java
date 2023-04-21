package Project1;

public class Task8 {
    /*
    Maximum and minimum number in the array?
     */
    public static void main(String[] args) {
        int[] arr = {10, 15, 30, 60, 10, 9};
        int minNum = arr[0];
        int maxNum = arr[0];
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i];
            } else if (arr[i] < minNum) {
                minNum = arr[i];
            }
        }
        System.out.println("Maximum number is "+maxNum);
        System.out.println("Minimum number is "+minNum);

    }
}
