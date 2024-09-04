//calculate the money in leetcode bank
class Solution {
    public int totalMoney(int n) {
        
       int[]a=new int[]{1,2,3,4,5,6,7};
      int time=(n/7)+1;
      int sum=0;
      int count=0;
      for(int i=0;i<time;i++){
          for(int j=0;j<a.length;j++){
              count++;
              sum=sum+(a[j]+i);
              if(count==n){
                  return sum;
              }
          }
      }
      return sum;
    }
}
