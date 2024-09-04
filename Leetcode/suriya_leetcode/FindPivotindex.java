//find pivot index of the array
class Solution {
    public int pivotIndex(int[] nums) {
        int leftsum=0;
        int rightsum=0;
        
        int i=0;
        boolean b=false;
        for(int j=1;j<nums.length;j++){
            leftsum+=nums[j];
        }
        while(i+1<nums.length){
            if(rightsum==leftsum){
                b=true;
                return i;
            }
            else{
                rightsum+=nums[i];
                leftsum-=nums[i+1];
                i++;
            }
        }
        if(b==false){
            if(leftsum==rightsum){
                return i;
            }
        }
        return -1;
        

        
    }
}

