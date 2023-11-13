class divideAlgo{
    public static int divide(int dividend, int divisor) {
        int count = 1;
        boolean flag = false;
        if((dividend<0 && divisor>0) || (dividend>0 && divisor<0)){
            flag = true;
        }
        if(dividend<0){
            dividend=(-1)*dividend;
        }
        divisor = Math.abs(divisor);
        while(true){
            int temp = count *divisor;
            if(temp>dividend){
                if(flag==false){
                    return count-1;
                }
                return (count-1)*(-1);
            }
            count++;
        }
    }

    public static void main(String[] args) {
        System.out.println(divide(-2147483648, -1));
    }
}