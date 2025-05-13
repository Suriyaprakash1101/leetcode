/*
300. Longest Increasing Subsequence
Solved
Medium
Topics
Companies
Given an integer array nums, return the length of the longest strictly increasing subsequence.

 

Example 1:

Input: nums = [10,9,2,5,3,7,101,18]
Output: 4
Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
Example 2:

Input: nums = [0,1,0,3,2,3]
Output: 4
Example 3:

Input: nums = [7,7,7,7,7,7,7]
Output: 1
 

Constraints:

1 <= nums.length <= 2500
-104 <= nums[i] <= 104
 
*/
class Solution {
    public int lengthOfLIS(int[] nums) {
        int i=0;
        int j=1;
        int[]dp=new int[nums.length];
        while(j<nums.length){
            if(nums[j]>nums[i]){
                dp[j]=Math.max(dp[j],dp[i]+1);
                i++;
            }
            else if(i==j){
                i=0;
                j++;
            }
            else{
                i++;
            }
        }
        
        return maxi(dp)+1;
    }
    public static int maxi(int[]dp){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<dp.length;i++){
            if(max<dp[i]){
                max=dp[i];
            }
        }
        return max;
    }
}
