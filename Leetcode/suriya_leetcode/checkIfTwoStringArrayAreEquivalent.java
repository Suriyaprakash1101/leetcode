class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String d=null;
	    String e=null;
	    for(int i=0;i<word1.length;i++){
	        d=d+word1[i];
	        
	    }
        for(int i=0;i<word2.length;i++){
            e=e+word2[i];
        }
	    
	    boolean z=false;
        if(d.length()!=e.length()){
            return false;
        }
	    for(int i=0;i<d.length();i++){
	        char c=d.charAt(i);
	        char f=e.charAt(i);
	        if(c==f){
	            z=true;
	        }else{
	            z=false;
	        }
	    }
	    return z;
        
    }
}
