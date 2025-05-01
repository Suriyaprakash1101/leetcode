/*
128. Longest Consecutive Sequence
Solved
Medium
Topics
Companies
Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.

 

Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
Example 2:

Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
Example 3:

Input: nums = [1,0,1,2]
Output: 3
 

Constraints:

0 <= nums.length <= 105
-109 <= nums[i] <= 109
*/

class Solution {
    public int longestConsecutive(int[] nums) {
        int len=0;
        HashMap<Integer,Boolean>map=new HashMap<>();
        for(int n:nums){
            map.put(n,false);
        }
        for(int n:nums){
            int curlength=1;
            int nextnum=n+1;
            while(map.containsKey(nextnum)&&!map.get(nextnum)){
                curlength++;
                map.put(nextnum,true);
                nextnum++;
            }
            int prenum=n-1;
            while(map.containsKey(prenum)&&!map.get(prenum)){
                curlength++;
                map.put(prenum,true);
                prenum--;
            }
            len=Math.max(len,curlength);
        }
        return len;
    }
}
