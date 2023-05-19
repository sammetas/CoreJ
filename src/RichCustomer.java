/*
 a two dim array is given with customers as row and banks as columns with balance as elements.
 need to find the richest customer , means sum of all bank account balanace
 array: mxn
 m= arr.length
 n = arr[i].length
 */
public class RichCustomer {

    public static int findRich(int[][] a){

        int n = a.length;
        int max = Integer.MIN_VALUE;
        for(int i=0; i < n; i++){
            int m= a[i].length;
            int sum = 0;
            for( int j=0; j < m; j++){
                sum += a[i][j];
            }
            max = Math.max(sum,max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] a= {{7,1,3},{2,8,7},{1,9,5}};
        System.out.println(findRich(a));
    }
}
