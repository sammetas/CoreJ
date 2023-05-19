/*
  Given an array of positive integers nums and an integer k,
  find the length of the longest sub array whose sum is less than or equal to k.

 */
public class LongestSubArray {

    public  static int[] longestSubArray(int[] num, int sum){
        int currSum = 0;
        int i = 0;
        //int j = 0;
        int res[] = new int[2];
        int ans = 0;

        for(int j = 0; j<num.length; j++){
            currSum += num[j];

            while (currSum > sum){
                currSum -= num[i];
                i++;

            }

            if(ans < Math.max(ans,j - i +1)) {
                res[0] = i; res[1] = j;
                ans = Math.max(ans,j - i + 1);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int a[] ={3, 1, 2, 7, 4, 2, 1, 1, 5};int sum = 8;
        int[] res =  longestSubArray(a,sum);
        for(int i =res[0]; i < res[1]+1; i++){
            System.out.print(a[i]+", ");
        }
    }
}
