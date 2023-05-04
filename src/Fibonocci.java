import java.util.Scanner;

public class Fibonocci {
    //0+1+1+2+3+5+8+13
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int m[]= new int[n];
        m[0] = 0;
        m[1] = 1;
        System.out.println( findFebonocci(m,n-1) );

    }

    private static int findFebonocci(int[] m, int n) {
        if( n==0 ) return 0;
        if( n==1 ) return 1;
        if(m[n] != 0){
            return m[n];
        }
         m[n] = findFebonocci(m,n-1) + findFebonocci(m,n-2);
         return m[n];
    }
}
