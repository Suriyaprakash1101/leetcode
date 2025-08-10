/*

Code


Testcase
Testcase
Test Result
493. Reverse Pairs
Solved
Hard
Topics
premium lock icon
Companies
Hint
Given an integer array nums, return the number of reverse pairs in the array.

A reverse pair is a pair (i, j) where:

0 <= i < j < nums.length and
nums[i] > 2 * nums[j].
 

Example 1:

Input: nums = [1,3,2,3,1]
Output: 2
Explanation: The reverse pairs are:
(1, 4) --> nums[1] = 3, nums[4] = 1, 3 > 2 * 1
(3, 4) --> nums[3] = 3, nums[4] = 1, 3 > 2 * 1
Example 2:

Input: nums = [2,4,3,5,1]
Output: 3
Explanation: The reverse pairs are:
(1, 4) --> nums[1] = 4, nums[4] = 1, 4 > 2 * 1
(2, 4) --> nums[2] = 3, nums[4] = 1, 3 > 2 * 1
(3, 4) --> nums[3] = 5, nums[4] = 1, 5 > 2 * 1
 

Constraints:

1 <= nums.length <= 5 * 104
-231 <= nums[i] <= 231 - 1
*/
class Solution {
    public int reversePairs(int[] nums) {
        return mergesort(nums,0,nums.length-1);
    }
    public static int mergesort(int[]a,int low,int high){
        int count=0;
        while(low>=high){
            return 0;
        }
        int mid=low+(high-low)/2;
        count+=mergesort(a,low,mid);
        count+=mergesort(a,mid+1,high);
        count+=countPair(a,low,mid,high);
        mergeArray(a,low,mid,high);
        return count;
    }
    public static int countPair(int[]a,int low,int mid,int high){
        int count_pair=0;
        int right=mid+1;
        for(int i=low;i<=mid;i++){
            while(right<=high&&(long)a[i]>2L*(long)a[right]){// i use long for some edge case like if the element is Integer.MAX_VALUE the it change the limit to 0 so error occured.
                right++;
            }
            count_pair+=(right-(mid+1));
        }
        return count_pair;
    }
    public static void mergeArray(int[]a,int low,int mid,int high){
        ArrayList<Integer>l=new ArrayList<>();
        int index=low;
        int right=mid+1;
        while(index<=mid&&right<=high){
            if(a[index]<=a[right]){
                l.add(a[index]);
                index++;
            }
            else{
                l.add(a[right]);
                right++;
            }
        }
        while(index<=mid){
            l.add(a[index]);
            index++;
        }
        while(right<=high){
            l.add(a[right]);
            right++;
        }
        for(int i=0;i<l.size();i++){
            a[i+low]=l.get(i);
        }
    }
}
/*
in this problem we use merge sort the recursion merge sort will go until it reach the one element, after that we have two array we check the pair and its count, further we merge the elements as sorted, i.e we merge in one portion, after return count.
 the main algorithm in this problem is if the element has some pair then the next element in the one portion also has that pair so no need to recalculate it.
 Debug the code for better explanation
*/
