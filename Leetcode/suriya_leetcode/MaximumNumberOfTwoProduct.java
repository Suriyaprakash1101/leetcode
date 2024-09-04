//maximum product of two element in the array.
class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int prd=(nums[n-1]-1)*(nums[n-2]-1);
        return prd;
    }
}
