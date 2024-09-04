//robot return to origin
class Solution {
    public boolean judgeCircle(String moves) {
        int up=0;
        int down=0;
        int lef=0;
        int rig=0;
        for(int i=0;i<moves.length();i++){
            char c=moves.charAt(i);
            if(c=='L'){
                lef++;
            }else if(c=='U'){
                up++;
            }else if(c=='D'){
                down++;
            }else if(c=='R'){
                rig++;
            }
        }
        for(int i=1;i<=2;i++){
            if(rig==lef&&up==down){
                return true;
            }
        }
        return false;
    }
}
