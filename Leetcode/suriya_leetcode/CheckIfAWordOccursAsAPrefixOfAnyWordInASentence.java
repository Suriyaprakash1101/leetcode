/*
1455. Check If a Word Occurs As a Prefix of Any Word in a Sentence
Solved
Easy
Topics
Companies
Hint
Given a sentence that consists of some words separated by a single space, and a searchWord, check if searchWord is a prefix of any word in sentence.

Return the index of the word in sentence (1-indexed) where searchWord is a prefix of this word. If searchWord is a prefix of more than one word, return the index of the first word (minimum index). If there is no such word return -1.

A prefix of a string s is any leading contiguous substring of s.

 

Example 1:

Input: sentence = "i love eating burger", searchWord = "burg"
Output: 4
Explanation: "burg" is prefix of "burger" which is the 4th word in the sentence.
Example 2:

Input: sentence = "this problem is an easy problem", searchWord = "pro"
Output: 2
Explanation: "pro" is prefix of "problem" which is the 2nd and the 6th word in the sentence, but we return 2 as it's the minimal index.
Example 3:

Input: sentence = "i am tired", searchWord = "you"
Output: -1
Explanation: "you" is not a prefix of any word in the sentence.*/

class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[]word=sentence.split(" ");
        for(int i=0;i<word.length;i++){
            if(word[i].length()>=searchWord.length()&&word[i].charAt(0)==searchWord.charAt(0)){
                boolean result=true;
                for(int j=1;j<searchWord.length();j++){
                    if(word[i].charAt(j)!=searchWord.charAt(j)){
                        result=false;
                        break;
                    }
                }
                if(result){
                    return i+1;
                }
            }
        }
        return -1;
    }
}





