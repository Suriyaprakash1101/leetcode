class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        int[]a=new int[n];
        for(int i=0;i<nums.length;i++){
            int index=nums[i]%n;
            a[index]=a[index]+n;
        }
        for(int i=0;i<a.length;i++){
            if(a[i]/n>=2){
                return i;
            }
        }
        return -1;
    }
}

