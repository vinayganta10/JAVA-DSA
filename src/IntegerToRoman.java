public class IntegerToRoman {
    public static String intToRoman(int num) {
        String roman = "";
        Object[][] storeIntRoman = {{1000, "M"}, {900, "CM"}, {500, "D"}, {400, "CD"}, {100, "C"}, {90, "XC"}, {50, "L"}, {40, "XL"}, {10, "X"}, {9, "IX"}, {5, "V"}, {4, "IV"}, {1, "I"}};
        for(int i = 0;i<storeIntRoman.length;i++){
            while(num>=(int)storeIntRoman[i][0]){
                roman += (String)storeIntRoman[i][1];
                num -= (int)storeIntRoman[i][0];
            }
        }
        return roman;
    }
    public static void main(String[] args) {
        System.out.println(intToRoman(1023));
    }
}
