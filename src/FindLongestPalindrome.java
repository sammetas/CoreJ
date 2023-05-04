public class FindLongestPalindrome {
    public static void main(String[] args) {
        String str = "abcmalayalamops";
        String palindrom = findPalindrom(str);
        System.out.println(palindrom);

    }

    private static String findPalindrom(String str) {
        String longestPal = "";
        for(int i=0;i<str.length();i++){
             String pal = getPalindrom(str,i,i);
            longestPal = (pal.length() > longestPal.length())?pal:longestPal;

        }
        return longestPal;
    }

    private static String getPalindrom(String str, int start, int end) {

        while (start >=0 && end < str.length() && str.charAt(start) == str.charAt(end)){
            start--;
            end++;
        }
        return str.substring(start+1,end);
    }
}
