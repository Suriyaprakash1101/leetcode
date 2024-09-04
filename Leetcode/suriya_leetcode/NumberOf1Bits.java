//Number of 1's in given bit
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        //int tem=n;
        int count=0;
		while(n!=0){
		   count+=n&1;
		   n>>>=1;
		}
        return count;
    }
}
