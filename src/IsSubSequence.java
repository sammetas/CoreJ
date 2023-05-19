/*

Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters
 without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 */
public class IsSubSequence {

    public static boolean isSubSequence(String str, String subString){

        int i = 0;
        int j = 0;

        while(i < str.length() && j < subString.length()){

            if(subString.charAt(j) == str.charAt(i)){
                i++; j++;
            }else {
                i++;
            }

        }
        return j == subString.length();

    }
    public static void main(String[] args) {

        System.out.println(isSubSequence("abcde","ace"));

    }
}
