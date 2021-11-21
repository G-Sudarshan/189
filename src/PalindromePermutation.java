import java.util.*;

public class PalindromePermutation {

    boolean isPermutationOfPalindrome(String phrase){
        int countOdd = 0;
        int[] table = new int[Character.getNumericValue('z')-Character.getNumericValue('a') + 1];
        for(char c: phrase.toCharArray()){
            int x = getCharNumber(c);
            if ( x != -1){
                table[x]++;
                if(table[x]%2 == 1){
                    countOdd++;
                }else{
                    countOdd--;
                }
            }
        }
        return countOdd<=1;

    }
}
