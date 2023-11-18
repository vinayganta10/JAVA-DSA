import java.util.*;

public class FourSum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> s = new HashSet<>();
        Arrays.sort(nums);

        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                int l = j+1;
                int k = n-1;
                while(l<k){
                    long sum = nums[i];
                    sum += nums[j];
                    sum += nums[l];
                    sum += nums[k];

                    if(sum==target){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[l]);
                        temp.add(nums[k]);
                        s.add(temp);
                        l++;
                        k--;
                    }
                    else if(sum<target){
                        l++;
                    }
                    else{
                        k--;
                    }
                }
            }
        }
        ans.addAll(s);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(fourSum(new int[]{-1,0,0,1,2,-2},0));
    }
}
