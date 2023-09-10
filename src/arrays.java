import java.util.Arrays;

public class arrays {
    public static class cl{
        int no;
        String name;
        cl(int no,String name){
            this.no=no;
            this.name=name;
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[5];
        int[] arr1 = {1,2,3,4};
        arr[0] = 1;
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
        System.out.println(arr1.length);
        for(int i:arr1){
            System.out.println(i);
        }
        cl[] students = new cl[]{new cl(1,"vinay"),new cl(2,"vinay1"),new cl(3,"vinay2"),new cl(4,"vinay3"),new cl(5,"vinay4")};
        for(cl i:students){
            System.out.println(i.no+" "+i.name);
        }
        System.out.println(arr.getClass().getSuperclass());
    }
}
