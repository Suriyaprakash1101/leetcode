//count of matches in tournament
class Solution {
    public int numberOfMatches(int n) {
        int sum=0;
        int match=0;
        while(n>1){
            if(n%2==0){
                match=n/2;
                n=match;
                sum=sum+match;
            }else{
                match=(n-1)/2;
                n=((n-1)/2)+1;
                sum=sum+match;
            }
        }
        return sum;
    }
}
