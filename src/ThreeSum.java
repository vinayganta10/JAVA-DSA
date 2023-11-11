import java.util.*;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> s = new HashSet();
        List<List<Integer>> output = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            int j = i + 1;
            int k = nums.length-1;
            while(j<k){
                if(nums[i]+nums[j]+nums[k]==0){
                    s.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }
                else if(nums[i]+nums[j]+nums[k]>0){
                    k--;
                }
                else{
                    j++;
                }
            }
        }
        output.addAll(s);
        return output;
    }

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{1, -1,-1,0,-4, 2, 3}));
    }
}
