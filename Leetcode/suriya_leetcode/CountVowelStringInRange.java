/*
You are given a 0-indexed array of strings words and a 2D array of integers queries.

Each query queries[i] = [li, ri] asks us to find the number of strings present in the range li to ri (both inclusive) of words that start and end with a vowel.

Return an array ans of size queries.length, where ans[i] is the answer to the ith query.

Note that the vowel letters are 'a', 'e', 'i', 'o', and 'u'.

 

Example 1:

Input: words = ["aba","bcb","ece","aa","e"], queries = [[0,2],[1,4],[1,1]]
Output: [2,3,0]
Explanation: The strings starting and ending with a vowel are "aba", "ece", "aa" and "e".
The answer to the query [0,2] is 2 (strings "aba" and "ece").
to query [1,4] is 3 (strings "ece", "aa", "e").
to query [1,1] is 0.
We return [2,3,0].
Example 2:

Input: words = ["a","e","i"], queries = [[0,2],[0,1],[2,2]]
Output: [3,2,1]
Explanation: Every string satisfies the conditions, so we return [3,2,1].
 

Constraints:

1 <= words.length <= 105
1 <= words[i].length <= 40
words[i] consists only of lowercase English letters.
sum(words[i].length) <= 3 * 105
1 <= queries.length <= 105
0 <= li <= ri < words.length
*/
class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[]ans=new int[queries.length];
        int[]a=new int[words.length];
        int j=0;
        for(int i=0;i<a.length;i++){
            boolean b=vowel(words[i]);
            if(b&&i==0){
                a[i]=1;
            }
            else if(b && i>0){
                a[i]=1+a[j];
                j++;
            }
            else if(!b && i>0){
                a[i]=a[j];
                j++;
            }
            else{
                a[i]=0;
            }
        }
        for(int i=0;i<queries.length;i++){
            int start=queries[i][0];
            int end=queries[i][1];
            if(start>0){
                int val=a[end]-a[start-1];
                ans[i]=val;
            }
            else{
                ans[i]=a[end];
            }
        }
        return ans;
    }
    public static boolean vowel(String s){
        char st=s.charAt(0);
        char e=s.charAt(s.length()-1);
        if((st=='a'||st=='e'||st=='i'||st=='o'||st=='u')&&(e=='a'||e=='e'||e=='i'||e=='o'||e=='u')){
            return true;
        }
        return false;
        
    }
}
