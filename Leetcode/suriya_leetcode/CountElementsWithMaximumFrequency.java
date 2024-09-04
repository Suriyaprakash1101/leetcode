//count elements with maximum frequency
class Solution {
    public int maxFrequencyElements(int[] nums) {
        ArrayList<Integer>l=new ArrayList<>();
        int max=0;
        ArrayList<Integer>l1=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int count=0;
            if(!l.contains(nums[i])){
                l.add(nums[i]);
                
                for(int j=0;j<nums.length;j++){
                    if(nums[j]==nums[i]){
                        count++;
                    }
                }
                if(max<count){
                    max=count;
                }
                l1.add(count);

                
            }
            
            
        }
        int add=0;
            if(max==1){
                return nums.length;
            }
            else{
                for(int i=0;i<l1.size();i++){
                    if(l1.get(i)==max){
                        add=add+l1.get(i);
                    }
                }
            }
            return add;
    }
}


