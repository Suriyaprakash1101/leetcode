//find the target indeces after sorted
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer>l=new ArrayList<>();
        nums=sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                l.add(i);
            }else{
                continue;
            }
        }
        int[]a=new int[2];
        
        return l;
    }
    public static int[] sort(int[]nums){
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<nums.length;j++){
                if(nums[j-1]>nums[j]){
                    int tem=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=tem;
                }
            }
        }
        return nums;
    }
}

