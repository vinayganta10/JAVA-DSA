import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String s) {
        int result = 0;
        Map<Character,Integer> m = new HashMap<>();
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);
        for(int i = 0;i<s.length();i++){
            if(i<s.length()-1 && m.get(s.charAt(i))<m.get(s.charAt(i+1))){
                result -= m.get(s.charAt(i));
            }
            else{
                result += m.get(s.charAt(i));
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMVII"));
        String[] s = {"flower","flow","flight"};
        Arrays.sort(s);
        System.out.println(Arrays.toString(s));
    }
}
