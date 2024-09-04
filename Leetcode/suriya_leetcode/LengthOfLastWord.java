//length of the last word in string
class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        char[]ch=s.toCharArray();
		int count=0;
        
		for(int i=ch.length-1;i>=0;i--){
		    if((int)ch[i]!=32){
		        count++;
		    }
		    else{
		        return count;
		    }
		}
        return count;
    }
}

