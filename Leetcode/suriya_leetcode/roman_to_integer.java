//roman to integer 
class Solution {
    public int romanToInt(String s) {
        int tot=0;
        for(int i=0;i<s.length();i++){
            int s1=val(s.charAt(i));
            if(i+1<s.length()){
                int s2=val(s.charAt(i+1));
                if(s1>=s2){
                    tot=tot+s1;
                }else{
                    tot=tot-s1;
                }
            }
            else{
                tot=tot+s1;
            }
            
        }
        return tot;
    }
    public int val(char r){
        if(r=='I'){
            return 1;
        }
        if(r=='V'){
            return 5;
        }
        if(r=='X'){
            return 10;
        }
        if(r=='L'){
            return 50;
        }
        if(r=='C'){
            return 100;
        }
        if(r=='D'){
            return 500;
        }
        if(r=='M'){
            return 1000;
            
        }
        return -1;

    }
}
