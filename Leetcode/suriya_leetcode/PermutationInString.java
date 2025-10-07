/*
567. Permutation in String
Solved
Medium
Topics
premium lock icon
Companies
Hint
Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.

In other words, return true if one of s1's permutations is the substring of s2.

 

Example 1:

Input: s1 = "ab", s2 = "eidbaooo"
Output: true
Explanation: s2 contains one permutation of s1 ("ba").
Example 2:

Input: s1 = "ab", s2 = "eidboaoo"
Output: false
 

Constraints:

1 <= s1.length, s2.length <= 104
s1 and s2 consist of lowercase English letters.
*/

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
       int[]frequency1=new int[26];
       int[]frequency2=new int[26];
       for(int i=0;i<s1.length();i++){
            int index=s1.charAt(i)-'a';
            frequency1[index]+=1;
       }
       for(int i=0;i<s1.length();i++){
            int index=s2.charAt(i)-'a';
            frequency2[index]+=1;
       }
       if(checkPermutation(frequency1,frequency2,s1)){
        return true;
       }
       int left=0;

       for(int i=s1.length();i<s2.length();i++){
            int index=s2.charAt(left)-'a';
            frequency2[index]-=1;
            index=s2.charAt(i)-'a';
            frequency2[index]+=1;
            if(checkPermutation(frequency1,frequency2,s1)){
                return true;
            }
            left++;

       }
       return false;
    }
    public static boolean checkPermutation(int[]a,int[]b,String s){
        for(int i=0;i<s.length();i++){
            int index=s.charAt(i)-'a';
            if(a[index]!=b[index]){
                return false;
            }
        }
        return true;
    }
}
