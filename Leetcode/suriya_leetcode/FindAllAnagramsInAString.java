/*
438. Find All Anagrams in a String
Solved
Medium
Topics
premium lock icon
Companies
Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.

 

Example 1:

Input: s = "cbaebabacd", p = "abc"
Output: [0,6]
Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".
Example 2:

Input: s = "abab", p = "ab"
Output: [0,1,2]
Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".
 
*/
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[]sCount=new int[26];
        int []pCount=new int[26];
        List<Integer>l=new ArrayList<>();
        for(int i=0;i<p.length();i++){
            pCount[p.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            sCount[s.charAt(i)-'a']++;
            if(i>=p.length()){
                sCount[s.charAt(i-p.length())-'a']--;
            }
            if(Arrays.equals(sCount,pCount)){
                l.add(i-p.length()+1);
            }
        }
        return l;
    }
}
