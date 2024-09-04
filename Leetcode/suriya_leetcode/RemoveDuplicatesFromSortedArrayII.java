//remove duplicates from sorted array-II
class Solution {
    public int removeDuplicates(int[] nums) {
       ArrayList<Integer>l=new ArrayList<>();
       for(int i:nums){
        if(!l.contains(i)){
            l.add(i);
        }
       }
       int[]b=new int[nums.length];
       for(int i=0;i<nums.length;i++){
        b[i]=nums[i];
       }
       int k=0;
       for(int i=0;i<l.size();i++){
            int val=l.get(i);
            int count=getcount(nums,val);
            if(count>2){
                count=2;
            }
            for(int j=0;j<count;j++){
                nums[k]=val;
                k++;
            }

       }
       return k;

        
    }
    public static int getcount(int[]a,int val){
        int count=0;
        for(int i=0;i<a.length;i++){
            if(val==a[i]){
                count++;
            }
        }
        return count;
    }
}


