//find words containing character
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer>l=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            boolean b=fun(words[i],x);
            if(b==true){
                l.add(i);
            }
        }
        return l;
    }
    public static boolean fun(String s,char c){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                return true;
            }
        }
        return false;
    }
}

