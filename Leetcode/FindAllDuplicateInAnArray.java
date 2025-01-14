/*
442. Find All Duplicates in an Array
Solved
Medium
Topics
Companies
Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears at most twice, return an array of all the integers that appears twice.

You must write an algorithm that runs in O(n) time and uses only constant auxiliary space, excluding the space needed to store the output

 

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [2,3]
Example 2:

Input: nums = [1,1,2]
Output: [1]
Example 3:

Input: nums = [1]
Output: []
 

Constraints:

n == nums.length
1 <= n <= 105
1 <= nums[i] <= n
Each element in nums appears once or twice.

*/
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i=0;
        ArrayList<Integer>l=new ArrayList<>();
        while(i<nums.length){
            if(nums[i]-1!=i&&!(nums[i]==nums[nums[i]-1])){
                    int tem=nums[i];
                    nums[i]=nums[tem-1];
                    nums[tem-1]=tem;

            
            }
            else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]-1!=j){
                l.add(nums[j]);
            }
        }
        return l;
    }
}
*/
