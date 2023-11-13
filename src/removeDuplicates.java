public class removeDuplicates {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,2,2,2,3,4,4,4,4};
        int count = 0;
        for(int i = 0;i<nums.length;i++) {
            if(nums.length>i+1 && nums[i] == nums[i+1]){
                nums[count] = nums[i+1];
                count++;
            }
        }
    }
}
