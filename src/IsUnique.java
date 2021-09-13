/*

Is Unique: Implement an algorithm to determine if a string has all unique characters.
What if you cannot use additional data structures?

*/

import java.util.Scanner;

public class IsUnique {
    public static boolean isUnique(String s){
        if (s.length() > 128) return false;

        boolean[] char_set = new boolean[128];

        for (int i=0 ; i < s.length() ; i++){
            int val = s.charAt(i);
            if(char_set[val]){
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }
    public static void main(String[] args) {
        String s;
        System.out.println("Enter the string");
        Scanner in = new Scanner(System.in);
        s = in.nextLine();
        boolean isStringUnique = false;
        isStringUnique = isUnique(s);
        if(isStringUnique){
            System.out.println("The string has all unique characters");
        }else{
            System.out.println("The string contains duplicate variables");
        }
    }


}
