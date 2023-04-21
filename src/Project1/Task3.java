package Project1;

public class Task3 {
    /*
    Create a 2D array or integer type where you will store
    odd and even numbers. Develop a program which will
    identify/print the even numbers only.
     */
    public static void main(String[] args) {
        int[][] arr = {
                {5, 8, 4, 9},
                {1, 6, 7, 12},
                {10, 2, 11, 3}
        };
        for (int row = 0; row < arr.length; row++)
            for (int col = 0; col < arr[row].length; col++) {
                int element = arr[row][col];
                if (element % 2 == 0) {

                    System.out.print(element + " ");

                }

            }

    }
}
