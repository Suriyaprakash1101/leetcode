//count bits
class Solution {
    public int[] countBits(int n) {
        
        int[]a=new int[n+1];
        int k=0;
        for(int i=0;i<=n;i++){
            int count=0;
            String bin=Integer.toBinaryString(i);
            for(int j=0;j<bin.length();j++){
                if(bin.charAt(j)=='1'){
                    count++;
                }
            }
            a[k]=count;
            k++;
        }
        return a;
    }
}

