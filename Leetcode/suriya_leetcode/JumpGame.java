/*
55. Jump Game
Solved
Medium
Topics
premium lock icon
Companies
You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

Return true if you can reach the last index, or false otherwise.

 

Example 1:

Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
Example 2:

Input: nums = [3,2,1,0,4]
Output: false
Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.
 

Constraints:

1 <= nums.length <= 104
0 <= nums[i] <= 105
*/
class Solution {
    public boolean canJump(int[] nums) {
       return checkJump(nums)!=-1;
    }
    public int checkJump(int[]nums){
        if(nums[0]==0&&nums.length!=1){
            return -1;
        }
        if(nums.length==1){
            return 1;
        }
        int destination=nums.length-1;
        int last_index=0;
        int cover=0;
        int jump=0;
        for(int i=0;i<nums.length;i++){
            cover=Math.max(cover,i+nums[i]);//we continuously update the maximum cover buy the element in the array
            if(last_index==i){
                last_index=cover;
                jump++;
                if(cover>=destination){
                    return jump;
                }
            }
        }
        
        return -1;
    }
}
