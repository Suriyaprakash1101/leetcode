//reverse  prefix of word
class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character>s=new Stack<>();
        if(word.indexOf(ch)==-1){
            return word;
        }
        
        int i;
        int count=0;
        for(i=0;i<word.length();i++){
            if(word.charAt(i)!=ch){
                s.push(word.charAt(i));
                count++;
            }
            else{
                s.push(word.charAt(i));
                break;
            }
        }
        
        StringBuilder sb=new StringBuilder();
        while(!s.isEmpty()){
            sb.append(s.pop());
        }
        for(int k=count+1;k<word.length();k++){
            sb.append(word.charAt(k));
        }
        return sb.toString();
    }
}
