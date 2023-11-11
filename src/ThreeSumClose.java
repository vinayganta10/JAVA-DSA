import java.util.*;

public class ThreeSumClose {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum = nums[0]+nums[1]+nums[2];
        for(int i = 0;i<nums.length;i++){
            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                int sum1 =  nums[i]+nums[j]+nums[k];
                int temp = sum1-target;
                if(Math.abs(sum1-target)<Math.abs(sum-target)){
                    sum = sum1;
                }
                if(temp>0){
                    k--;
                }
                else{
                    j++;
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(threeSumClosest(new int[]{-1, 0, 1, 2}, 1));
    }
}
