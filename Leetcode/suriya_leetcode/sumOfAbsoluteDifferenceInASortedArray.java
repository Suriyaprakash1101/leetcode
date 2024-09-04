class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        
        int sum=0;
        for(int n:nums){
            sum+=n;
        }
        int []a=new int[nums.length];
        int left=0;
        int right=sum;
        for(int i=0;i<nums.length;i++){
            right-=nums[i];
            a[i]=nums[i]*i-left+right-nums[i]*(nums.length-i-1);
            left+=nums[i];
        }
        return a;
    }
    
}
