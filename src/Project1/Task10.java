package Project1;

public class Task10 {
    /*
    Write a program to print out duplicate elements from
    an Array of Strings?
     */
    public static void main(String[] args) {
        String [] arr={"dog","cat","lion","dog","tiger","cat"};


        for (int i = 0; arr.length > i; i++) {
            for (int j =i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]) {

                    System.out.println(arr[j]);

                }

            }
        }

    }
}
