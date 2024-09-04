//valid parentheses
class Solution {
    public boolean isValid(String s) {
       char[]ch=s.toCharArray();
       Stack<Character>stack=new Stack<>();
       for(char c:ch){
           if(c=='('||c=='['||c=='{'){
               stack.push(c);
           }else{
               if(stack.isEmpty()){
                   return false;
               }
               char top=stack.peek();
               if(c==')'&&top=='('||c==']'&&top=='['||c=='}'&&top=='{'){
                   stack.pop();
               }else{
                   return false;
               }
           }
       }
       return stack.isEmpty();
    }
}

