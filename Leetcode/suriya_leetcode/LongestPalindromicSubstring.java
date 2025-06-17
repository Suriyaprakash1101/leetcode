/*
5. Longest Palindromic Substring
Solved
Medium
Topics
premium lock icon
Companies
Hint
Given a string s, return the longest palindromic substring in s.

 

Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd"
Output: "bb"
 

Constraints:

1 <= s.length <= 1000
s consist of only digits and English letters.
*/
class Solution {
    public String longestPalindrome(String s) {
        ArrayList<String>l=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            l.add(palindrome(s,i,i));//even length palindrome
            l.add(palindrome(s,i,i+1));//odd length palindrome
        }
        int index=0;
        for(int i=1;i<l.size();i++){
            if(l.get(index).length()<l.get(i).length()){
                index=i;
            }
        }
        return l.get(index);
    }
    public static String palindrome(String s,int left,int right){
        String str="";
        while((left>=0&&right<s.length())&&s.charAt(left)==s.charAt(right)){
            if(left==right){
                str+=s.charAt(left);
            }
            else{
                str=s.charAt(left)+str+s.charAt(right);
            }
            left--;
            right++;
        }
        return str;
    }
}
