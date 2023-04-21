package Project1;

public class Task4 {
    /*
    Create a 2D array of integers. Develop a program
     which will calculate the sum of even and odd numbers
      for that array.
     */
    public static void main(String[] args) {
        int[][] arr = {
                {5, 8, 4, 9},
                {1, 6, 7, 12},
                {10, 2, 11, 3}
        };
        int evenSum = 0;
        int oddNum = 0;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                int element = arr[row][col];
                if (element % 2 == 0) {
                    evenSum = evenSum + element;
                } else {
                    oddNum = oddNum + element;
                }
            }
        }
        System.out.println(evenSum);
        System.out.println(oddNum);
    }

}

