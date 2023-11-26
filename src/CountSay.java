import java.sql.SQLOutput;

public class CountSay {
    private static String helper(int i,int n,String s){
        StringBuilder s1 = new StringBuilder();
        if(i!=n){
            int count = 1;
            for(int j = 0;j<s.length();j++){
                if(j<s.length()-1 && s.charAt(j)==s.charAt(j+1)){
                    count++;
                    continue;
                }
                s1.append(count+""+s.charAt(j));
                count = 1;
            }
            i++;
            helper(i,n,new String(s1));
        }
        System.out.println(s);
        return s;
    }
    private static String countAndSay(int n) {
        if(n==1){
            return new String("1");
        }
        return helper(1,n,"1");
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }
}
