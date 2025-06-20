/*
31. Next Permutation
Solved
Medium
Topics
premium lock icon
Companies
A permutation of an array of integers is an arrangement of its members into a sequence or linear order.

For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).

For example, the next permutation of arr = [1,2,3] is [1,3,2].
Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.
Given an array of integers nums, find the next permutation of nums.

The replacement must be in place and use only constant extra memory.

 

Example 1:

Input: nums = [1,2,3]
Output: [1,3,2]
Example 2:

Input: nums = [3,2,1]
Output: [1,2,3]
Example 3:

Input: nums = [1,1,5]
Output: [1,5,1]
 

Constraints:

1 <= nums.length <= 100
0 <= nums[i] <= 100
*/
class Solution {
    public void nextPermutation(int[] nums) {
        int index=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
            reverse(nums,0);
            return;
        }
        else{
            for(int i=nums.length-1;i>index;i--){
                if(nums[i]>nums[index]){
                    int tem=nums[i];
                    nums[i]=nums[index];
                    nums[index]=tem;
                    break;
                }
            }
            reverse(nums,index+1);
        }
    }
    public static void reverse(int[]nums,int index){
        int i=index;
        int j=nums.length-1;
        while(i<j){
            int tem=nums[i];
            nums[i]=nums[j];
            nums[j]=tem;
            i++;
            j--;
        }
    }
}
/*
Approach
brute force approach:
in the brute force approach 
1->find all permutation
2->iterate over the permutation list to find the next permutation
it takes O(n!)-time complexity
O(n!) space complexity
optimized approach
1->it is dictionary sorted array so, first start the array in the sorted order. so we iterate from the last of the array to find the index of pivot, so if nums[ip<nnums[i+1]
it is pivot index.
if there is no pivot then we reverse the array
2->the next permutation is greater than the currect one, so we find the element from the index+1 position to nums.length that greater then one and smaller than all element 
from index+1 to nums.length. so we iterate from nums.length-1 to index+1. and swap the nums[index] with the smaller element.
3.After that we want to sort the array from index+1 still end. we know that from right to left nums are low to higher so we reverse those things to get the next permutation.
short algorithm:
1->find pivot from right to left
2->swapping the element from right to left if element greater than the nums[index] then swa, and break the loop.
3->from the right to left value from low to high to reverse it for sorting
*/
