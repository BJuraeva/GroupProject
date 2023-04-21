package Project1;

public class Task9 {
    /*
    Write a java program to find the second largest
    number in the array?
     */
    public static void main(String[] args) {
        int[] arr={5,6,8,23,80};
        int largestNum=0;
        int secondLargestNum=0;
        for (int i = 0; i < arr.length; i++) {
            boolean b = i != largestNum;
            if(arr[i]>largestNum){
                secondLargestNum=largestNum;
                largestNum=arr[i];
            }else if(arr[i]>secondLargestNum && arr[i] !=largestNum){
                secondLargestNum=arr[i];
            }
        }
        System.out.println( secondLargestNum);

    }
}
