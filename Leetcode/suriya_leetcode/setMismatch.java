//set mismatch
class Solution {
    public int[] findErrorNums(int[] nums) {
        int[]a=new int[2];
        int[]arr=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]=arr[nums[i]]+1;
        }
        analyse(arr,a);
        

        return a;
    }static void analyse(int[]arr,int[]a){
        for(int i=1;i<arr.length;i++){
            if(arr[i]==2){
                a[0]=i;
            }else if(arr[i]==0){
                a[1]=i;
            }
        }
    }
}

