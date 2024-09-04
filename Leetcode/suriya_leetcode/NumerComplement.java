//number complement
class Solution {
    public int findComplement(int num) {
        String s=Integer.toBinaryString(num);
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<s.length();i++){
		    if(s.charAt(i)=='1'){
		        sb.append('0');
		    }
		    else{
		        sb.append('1');
		    }
		}
	    int ans=Integer.parseInt(sb.toString(),2);
        return ans;
    }
}

