//square of a sorted array
class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int sq=nums[i]*nums[i];
            nums[i]=sq;
        }
        Arrays.sort(nums);
        return nums;
    }
}

