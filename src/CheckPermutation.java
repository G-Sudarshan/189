/*

Given two strings write a method to decide if one is permutation of the other

 */
import java.util.*;

public class CheckPermutation {
    public static void main(String[] args) {
        String s1 = "GeeksForGeeks";
        String s2 = "ForGeeksGeeks";

        boolean res = permutation(s1, s2);

        System.out.println(res);
    }

    public static String sort(String s){
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

    public static boolean permutation(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }

        return sort(s1).equals(sort(s2));
    }
}
