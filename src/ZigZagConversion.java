class ZigZagConversion {
    public static String convert(String s, int numRows) {
        StringBuilder s1 = new StringBuilder("");
        int add = 2*numRows-2;
        for(int i = 0;i<numRows;i++){
            if(i==0||i==numRows-1){
                int m = i;
                while(m<s.length()){
                    s1.append(s.charAt(m));
                    m+=add;
                }
            }
            else{
                int m = i;
                while(m<s.length()){
                    s1.append(s.charAt(m));
                    m = m + (add-(2*i));
                    if(m<s.length()) {
                        s1.append(s.charAt(m));
                        m = m + i * 2;
                    }
                }
            }
        }
        return new String(s1);
    }

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3));
    }
}