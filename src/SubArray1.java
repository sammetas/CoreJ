/*
Example 2: You are given a binary substring s (a string containing only "0" and "1"). An operation involves flipping a "0" into a "1". What is the length of the longest substring containing only "1" after performing at most one operation?

For example, given s = "1101100111", the answer is 5. If you perform the operation at index 2, the string becomes 1111100111.
 */
public class SubArray1 {

    public static int findLongSubArray(String str){

        int curr = 0;
        int j = 0;
        int max =Integer.MIN_VALUE;
        for(int i=0; i< str.length();i++) {

            if (str.charAt(i) == '0') {
                curr++;
            }
            while (curr > 1) {
                if (str.charAt(j) == '0') {
                    curr--;
                }
                j++;
                max = Math.max(max, i - j + 1);


            }
        }
        return max;

    }
    public static void main(String[] args) {
            System.out.println(findLongSubArray("1101100111"));
    }
}
