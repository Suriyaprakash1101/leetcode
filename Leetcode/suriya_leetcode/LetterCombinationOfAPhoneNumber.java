/*
17. Letter Combinations of a Phone Number
Solved
Medium
Topics
Companies
Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.

A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.


 

Example 1:

Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
Example 2:

Input: digits = ""
Output: []
Example 3:

Input: digits = "2"
Output: ["a","b","c"]
 

Constraints:

0 <= digits.length <= 4
digits[i] is a digit in the range ['2', '9'].
*/
class Solution {
    public List<String> letterCombinations(String digits) {
        String[]a={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        return combination("",digits,a);
    }
    public static ArrayList<String> combination(String p,String up,String[]a){
        if(up.isEmpty()){
            ArrayList<String>l=new ArrayList<>();
            if(!p.isEmpty()){
                l.add(p);
            }
            
            return l;
        }
        
        ArrayList<String>l=new ArrayList<>();
        int digits=up.charAt(0)-'2';
        for(int i=0;i<a[digits].length();i++){
            String c=String.valueOf(a[digits].charAt(i));
            l.addAll(combination(p+c,up.substring(1),a));
        }
        return l;
    }
}
