/*
 nums = [1, 2, 4, 6, 8, 9, 14, 15] and target = 13
 return true if any two of the array elements sums to 13. else false.
 Note: Array is sorted and unique elements.
 Ans: I'm using two pointer technique here.
 */

public class SortedTwoSum {

    public static boolean isTwoSum(int[] a, int target){

        if(a.length ==1 && a[0] == target){
            return true;
        }

        int i  =0;
        int j =  a.length-1;
        int temp = 0;
        while( i < j ){
            temp = a[i] + a[j];
            if(temp > target){
                j--;
            }else if (temp < target){
                i++;
            }else {
                return true;
            }
        }

        return false;

    }

    public static void main(String[] args) {
      int[]  nums = {1, 2, 4, 6, 8, 9, 14, 15} ;int target = 13;
        System.out.println(isTwoSum(nums,target));

    }
}
