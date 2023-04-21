package Project1;

public class Task2 {
    /*
     Create an array of integer values. After the array is
     created, calculate the sum of all stored elements in
     that array.
     */
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int i = 0; i <= 4; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);

    }
}
