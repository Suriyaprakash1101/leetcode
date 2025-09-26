/*
524. Longest Word in Dictionary through Deleting
Solved
Medium
Topics
premium lock icon
Companies
Given a string s and a string array dictionary, return the longest string in the dictionary that can be formed by deleting some of the given string characters. If there is more than one possible result, return the longest word with the smallest lexicographical order. If there is no possible result, return the empty string.

 

Example 1:

Input: s = "abpcplea", dictionary = ["ale","apple","monkey","plea"]
Output: "apple"
Example 2:

Input: s = "abpcplea", dictionary = ["a","b","c"]
Output: "a"
*/

class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        dictionary.sort((a,b)-> a.compareTo(b));
        String ans="";
        for(int i=0;i<dictionary.size();i++){
            if(isSubsequence(dictionary.get(i),s) && ans.length()<dictionary.get(i).length()){
                ans=dictionary.get(i);
            }
        }
        return ans;

    }
    public static boolean isSubsequence(String word,String word2){
        int i=0;
        int j=0;
        while(i<word.length() && j<word2.length()){
            if(word.charAt(i)==word2.charAt(j)){
                i++;
            }
            j++;
        }
        return i==word.length();
    }
}
