/*

Given two strings write a method to decide if one is permutation of the other

 */
import java.util.*;

public class CheckPermutationV2 {
    public static void main(String[] args) {
        String s1 = "GeeksForGeeks";
        String s2 = "ForGeeksGeeks";

        boolean res = permutation(s1, s2);

        System.out.println(res);
    }

    public static boolean permutation(String s1, String s2){
        if(s1.length() != s2.length()){
            return false; // permutation must have same length
        }

        int[] letters = new int[128]; // assuming ASCII set

        for(int i=0; i < s1.length() ; i++){
            letters[s1.charAt(i)]++;
        }

        for (int i=0; i < s2.length() ; i++){
            letters[s2.charAt(i)]--;
            if(letters[s2.charAt(i)] < 0){
                return false;
            }
        }

        return true; // letter has no negative value and therefore no positive value either
    }
}
