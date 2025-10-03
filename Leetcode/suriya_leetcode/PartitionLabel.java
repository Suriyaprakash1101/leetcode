/*
763. Partition Labels
Solved
Medium
Topics
premium lock icon
Companies
Hint
You are given a string s. We want to partition the string into as many parts as possible so that each letter appears in at most one part. For example, the string "ababcc" can be partitioned into ["abab", "cc"], but partitions such as ["aba", "bcc"] or ["ab", "ab", "cc"] are invalid.

Note that the partition is done so that after concatenating all the parts in order, the resultant string should be s.

Return a list of integers representing the size of these parts.

 

Example 1:

Input: s = "ababcbacadefegdehijhklij"
Output: [9,7,8]
Explanation:
The partition is "ababcbaca", "defegde", "hijhklij".
This is a partition so that each letter appears in at most one part.
A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits s into less parts.
Example 2:

Input: s = "eccbbbbdec"
Output: [10]
 

Constraints:

1 <= s.length <= 500
s consists of lowercase English letters.



  */

class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer>partition=new ArrayList<>();
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=s.length()-1;i>=0;i--){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),i);
            }
        }
        for(int i=0;i<s.length();){
            int start=i;
            int end=map.get(s.charAt(start));
            for(int j=start+1;j<=end;j++){
                int lastIndex=map.get(s.charAt(j));
                if(end<lastIndex){
                    end=lastIndex;
                }
            }
            partition.add(end-start+1);
            i=end+1;
        }
        return partition;
    }
}




