//find the first and last position of the element in the sorted array
class Solution {
    public int[] searchRange(int[] nums, int target) {
        ArrayList<Integer>l=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                l.add(i);
            }else{
                continue;
            }
        }
        int[]a=new int[2];
        if(l.isEmpty()){
            a[0]=-1;
            a[1]=-1;
            return a;
        }
        a[0]=l.get(0);
        a[1]=l.get(l.size()-1);
        return a;
    }
}



