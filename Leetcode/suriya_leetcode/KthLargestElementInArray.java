//find the kth largest element in the array
class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        Arrays.sort(nums);
        int a=nums[nums.length-k];

        return a;
    }
    
}
