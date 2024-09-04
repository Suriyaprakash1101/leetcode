//maximum product difference between two pairs
class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int a=nums[0];
        int b=nums[1];
        int c=nums[nums.length-1];
        int d=nums[nums.length-2];
        int mul=(c*d)-(a*b);
        return mul;
    }
}
