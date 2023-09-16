public class ShortestPalindrome {
    static int maxLength = 0,start = 0;
    public static String shortestPalindrome(String s) {
        char[] st = s.toCharArray();
        if(st.length<2){
            return s;
        }
        for(int i = 0;i < st.length-1;i++){
            expand(st,i,i);
            expand(st,i,i+1);
        }
        String sub = s.substring(start,st.length);
        StringBuilder sub1 = new StringBuilder(sub);
        return sub1.reverse()+s;
    }
    public static void expand(char[] st,int i,int j){
        while(i >= 0 && j < st.length && st[i] == st[j]) {
            i--;
            j++;
        }
        if(maxLength < j - i - 1 && i==-1) {
            maxLength = j - i - 1;
            start = j;
        }
    }

    public static void main(String[] args) {
        System.out.println(shortestPalindrome("bb"));
    }
}
