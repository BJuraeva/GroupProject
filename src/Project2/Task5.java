package Project2;

import java.util.HashMap;
import java.util.Map;

/*
Find the First Non-Repeating Character in a String: Given a string,
find and return the first non-repeating character. For example, in the
string "abracadabra", the first non-repeating character is 'c'.
 */
public class Task5 {
    public static void main(String[] args) {
        String str = "abracadabra";

        for(int i=0; i<str.length();i++){
            boolean nonRepeat = true;
            for (int j = 0; j < str.length(); j++) {
                if(i!=j && str.charAt(i)==str.charAt(j)){
                    nonRepeat=false;
                    break;
                }
            }if(nonRepeat){
                System.out.println("the first non-repeating character is: "+str.charAt(i));
                break;
            }
        }
    }

}
