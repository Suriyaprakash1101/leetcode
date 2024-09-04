class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
           return false;
        }
        char[]c=s.toCharArray();
        char[]c1=t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c);
        int count=0;
        for(int i=0;i<c.length;i++){
            if(c[i]==c1[i]){
                count++;
            }else{
                continue;
            }
        }
        if(count==c1.length){
            return true;
        }
        return false;
    }
}
