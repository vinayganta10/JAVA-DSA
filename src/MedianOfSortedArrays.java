import java.util.Arrays;

class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length+nums2.length];
        System.arraycopy(nums1,0,nums,0,nums1.length);
        System.arraycopy(nums2,0,nums,nums1.length,nums2.length);
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int a = nums.length;
        if(nums.length%2!=0){
            return nums[(a-1)/2];
        }
        else{
            return (double) (nums[a / 2] + nums[(a / 2) - 1]) /2;
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2};
        int[] b = {3,4};
        System.out.println(findMedianSortedArrays(a, b));
    }
}