//two sum intput array is sorted
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[]a=new int[2];
        for(int i=0;i<numbers.length-1;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]+numbers[j]==target){
                    a[0]=i+1;
                    a[1]=j+1;
                    return a;
                }
                else{
                    continue;
                }
            }
            

        }
        return a;
    }
}

