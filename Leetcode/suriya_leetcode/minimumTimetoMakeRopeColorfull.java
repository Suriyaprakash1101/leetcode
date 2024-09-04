//minimum time to make rope colour full
class Solution {
    public int minCost(String colors, int[] neededTime) {
        int sum=0;
        int max=neededTime[0];//first we can initilise max_val=neededTime[0]
        for(int i=1;i<colors.length();i++){
            char c=colors.charAt(i);
            char c1=colors.charAt(i-1);
            if(c==c1){
                sum=sum+Math.min(max,neededTime[i]);//compare two value which is minimum
                max=Math.max(max,neededTime[i]);//again initilize the max  compare with the maximum numbers of maxs and neededtime[i]
            }
            else{
                max=neededTime[i];//if the char are not equal we can initilize the value of max to current neededtime[i];
            }
        }
        return sum;
    }
}

