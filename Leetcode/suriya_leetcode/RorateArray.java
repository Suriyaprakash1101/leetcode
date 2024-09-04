//rotate array
class Solution {
    public void rotate(int[] nums, int k) {
        int[]a=new int[nums.length];
        int times=0;
        if(k<=nums.length){
            times=k;
        }
        else{
            times=k%nums.length;
        }
        int repeat=nums.length-times;
        int j=0;
        for(int i=repeat;i<nums.length;i++){
            a[j]=nums[i];
            j++;
        }
        for(int i=0;i<repeat;i++){
            a[j]=nums[i];
            j++;
        }
        for(int i=0;i<a.length;i++){
            nums[i]=a[i];
        }
    }
}


