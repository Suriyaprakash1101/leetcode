/*
448. Find All Numbers Disappeared in an Array
Solved
Easy
Topics
Companies
Hint
Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

 

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:

Input: nums = [1,1]
Output: [2]
 

Constraints:

n == nums.length
1 <= n <= 105
1 <= nums[i] <= n
 

Follow up: Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
*/
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer>l=new ArrayList<>();
        int i=0;
        while(i<nums.length){
            if(nums[i]-1!=i&&!(nums[nums[i]-1]==nums[i])){
                
                    int tem=nums[i];
                    nums[i]=nums[nums[i]-1];
                    nums[tem-1]=tem;
                
            }
            else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(j!=nums[j]-1){
                l.add(j+1);
            }
        }
        return l;
    }
}










*/
