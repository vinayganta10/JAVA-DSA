import java.util.Arrays;

public class reverseArray {
    public static void reverse(int[] arr,int i){
        int n = arr.length;
        if(i>=n/2)
            return;
        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;
        reverse(arr,i+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        reverse(arr,0);
        System.out.println(Arrays.toString(arr));
    }
}
