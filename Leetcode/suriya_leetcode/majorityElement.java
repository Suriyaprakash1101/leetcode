//majority element
class Solution {
    public int majorityElement(int[] nums) {
        int e=0;
        if(nums.length==1){
            return nums[0];
        }
        int n=nums.length/2;
        for(int i=0;i<nums.length-1;i++){
            int count=1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }else{
                    continue;
                }
            }
            if(count>n){
                e=nums[i];
                return e;
            }
        }
        return -1;
    }
}
//another efficient method
class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int ans=0;
        for(int num:nums){
            if(count==0){
                ans=num;
            }
            count+=num==ans?1:-1;
        }
        return ans;
    }
}
