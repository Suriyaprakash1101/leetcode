class Solution {
    public boolean isPowerOfTwo(int n) {
        int i=0;
        if(n%2==0||n==1){

        
            while(i<n){
                int ans=(int)Math.pow(2,i);
                if(ans==n){
                    return true;
                }
                else if(ans>n){
                    return false;
                }else{
                    i++;
                }
            }
        }
        return false;  
    }
}

