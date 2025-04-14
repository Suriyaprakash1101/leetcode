/*
46. Permutations
Solved
Medium
Topics
Companies
Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.

 

Example 1:

Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
Example 2:

Input: nums = [0,1]
Output: [[0,1],[1,0]]
Example 3:

Input: nums = [1]
Output: [[1]]
 

Constraints:

1 <= nums.length <= 6
-10 <= nums[i] <= 10
All the integers of nums are unique.
*/


class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>result=new ArrayList<>();
        ArrayList<Integer>tem=new ArrayList<>();
        backtrack(result,tem,nums);
        return result;
    }
    public static void backtrack(List<List<Integer>>result,ArrayList<Integer>tem,int[]nums){
        if(tem.size()==nums.length){
            result.add(new ArrayList<>(tem));
            return;
        }
        for(int n:nums){
            if(tem.contains(n)){
                continue;
            }
            tem.add(n);
            backtrack(result,tem,nums);
            tem.remove(tem.size()-1);
        }
    }
}





