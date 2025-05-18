/*
44. Wildcard Matching
Solved
Hard
Topics
Companies
Given an input string (s) and a pattern (p), implement wildcard pattern matching with support for '?' and '*' where:

'?' Matches any single character.
'*' Matches any sequence of characters (including the empty sequence).
The matching should cover the entire input string (not partial).

 

Example 1:

Input: s = "aa", p = "a"
Output: false
Explanation: "a" does not match the entire string "aa".
Example 2:

Input: s = "aa", p = "*"
Output: true
Explanation: '*' matches any sequence.
Example 3:

Input: s = "cb", p = "?a"
Output: false
Explanation: '?' matches 'c', but the second letter is 'a', which does not match 'b'.
 

Constraints:

0 <= s.length, p.length <= 2000
s contains only lowercase English letters.
p contains only lowercase English letters, '?' or '*'.
*/
class Solution {
    public boolean isMatch(String s, String p) {
        boolean[][]b=new boolean[s.length()+1][p.length()+1];
        b[0][0]=true;
        for(int j=1;j<=p.length();j++){
            if(p.charAt(j-1)=='*'){
                b[0][j]=b[0][j-1];
            }
        }
        for(int i=1;i<b.length;i++){
            for(int j=1;j<b[i].length;j++){
                if(s.charAt(i-1)==p.charAt(j-1)||p.charAt(j-1)=='?'){
                        b[i][j]=b[i-1][j-1];
                }
                else if(p.charAt(j-1)=='*'){
                    b[i][j]=b[i-1][j]||b[i][j-1];
                }
            }
        }
        return b[b.length-1][b[0].length-1];
        
    }
}
