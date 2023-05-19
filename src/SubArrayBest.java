/*
   Example 4: Given an integer array nums and an integer k, find the sum of the subarray with the largest sum whose length is k.
   int n[] ={3,-1,,4,12,-8,5,6}, int k =4
 */
public class SubArrayBest {
    public static void main(String[] args) {
        int nums[] ={3,-1,4,12,-8,5,6}; int k =4;
        int curr = 0;
        for (int i = 0; i < k; i++) {
            curr += nums[i];
        }

        int ans = curr;
        for (int i = k; i < nums.length; i++) {
            curr += nums[i] - nums[i - k];
            ans = Math.max(ans, curr);
        }
        System.out.println(ans);
    }
}
