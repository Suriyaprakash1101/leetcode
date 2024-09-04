//apple redistribution into boxes
class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int sum=sum(apple);
        int count=0;
        for(int i=capacity.length-1;i>=0;i--){
            sum=sum-capacity[i];
            count++;
            if(sum>0){
                continue;
            }else{
                break;
            }
        }
        return count;
    }
    static int sum(int[]a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        return sum;
    }
}



