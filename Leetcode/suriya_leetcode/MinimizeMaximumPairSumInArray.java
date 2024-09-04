//minimum maximum pair sum in arrays
class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        ArrayList<Integer>l=new ArrayList<>();
        int j=nums.length-1;
        for(int i=0;i<nums.length/2;i++){
            sum=nums[i]+nums[j];
            j--;
            l.add(sum);
        }
        int max=0;
        for(int i=0;i<l.size();i++){
            if(max<l.get(i)){
                max=l.get(i);
            }else{
                continue;
            }
        }
        return max;
    }
}
