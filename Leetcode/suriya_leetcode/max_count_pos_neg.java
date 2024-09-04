//maximum count of positive and negative number in the given array
class Solution {
    public int maximumCount(int[] nums) {
        int pos_count=0;
        int neg_count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                pos_count++;
            }else if(nums[i]<0){
                neg_count++;
            }
        }
        int c=Math.max(pos_count,neg_count);
        return c;
    }
}
