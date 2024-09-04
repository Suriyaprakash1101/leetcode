//number of distinct averages
class Solution {
    public int distinctAverages(int[] nums) {
        ArrayList<Float>l=new ArrayList<>();
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        while(i<j){
            float avg=(float)(nums[i]+nums[j])/2.0f;
            if(!l.contains(avg)){
                l.add(avg);
                i++;
                j--;
            }
            else{
                i++;
                j--;
            }
        }
        return l.size();
    }
}


