/*
494. Target Sum
Solved
Medium
Topics
Companies
You are given an integer array nums and an integer target.

You want to build an expression out of nums by adding one of the symbols '+' and '-' before each integer in nums and then concatenate all the integers.

For example, if nums = [2, 1], you can add a '+' before 2 and a '-' before 1 and concatenate them to build the expression "+2-1".
Return the number of different expressions that you can build, which evaluates to target.

 

Example 1:

Input: nums = [1,1,1,1,1], target = 3
Output: 5
Explanation: There are 5 ways to assign symbols to make the sum of nums be target 3.
-1 + 1 + 1 + 1 + 1 = 3
+1 - 1 + 1 + 1 + 1 = 3
+1 + 1 - 1 + 1 + 1 = 3
+1 + 1 + 1 - 1 + 1 = 3
+1 + 1 + 1 + 1 - 1 = 3
Example 2:

Input: nums = [1], target = 1
Output: 1
 

Constraints:

1 <= nums.length <= 20
0 <= nums[i] <= 1000
0 <= sum(nums[i]) <= 1000
-1000 <= target <= 1000
*/
class Solution {
   
    public int findTargetSumWays(int[] nums, int target) {
        int[]a=new int[1];
        recursion(nums,target,0,0,a);
        return a[0];
    }
    public static void recursion(int[]n,int target,int sum,int index,int[]a){
       if(sum==target&&index==n.length){
            a[0]=a[0]+1;
            return;
        }
        if(index==n.length){
            return;
        }
        recursion(n, target, sum+n[index], index+1,a);
        recursion(n, target, sum-n[index], index+1,a);


    }

}
