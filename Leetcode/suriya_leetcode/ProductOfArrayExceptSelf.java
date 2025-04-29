/*
238. Product of Array Except Self
Solved
Medium
Topics
Companies
Hint
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 

Constraints:

2 <= nums.length <= 105
-30 <= nums[i] <= 30
The input is generated such that answer[i] is guaranteed to fit in a 32-bit integer.
 

Follow up: Can you solve the problem in O(1) extra space complexity? (The output array does not count as extra space for space complexity analysis.)
*/
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[]a=new int[2];
        int[]arr=new int[nums.length];
        find(nums,a);
        if(a[1]>1){
            return arr;
        }
        else if(a[1]==1){
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0){
                    arr[i]=a[0];
                    return arr;
                }
            }
        }
        else{
            for(int i=0;i<nums.length;i++){
                arr[i]=a[0]/nums[i];
            }
        }
        return arr;
    }
    public static void find(int[]a,int[]arr){
        int zerocount=0;
        int prd=1;
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                zerocount++;
                continue;
            }
            prd*=a[i];
        }
        arr[0]=prd;
        arr[1]=zerocount;
    }
}
//another method
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[]a=new int[2];
        int[]arr=new int[nums.length];
        find(nums,a);
        if(a[1]>1){
            for(int i=0;i<nums.length;i++){
                nums[i]=0;
            }
        }
        else if(a[1]==1){
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0){
                    nums[i]=a[0];
                    
                }
                else{
                    nums[i]=0;
                }
            }
        }
        else{
            for(int i=0;i<nums.length;i++){
                nums[i]=a[0]/nums[i];
            }
        }
        return nums;
    }
    public static void find(int[]a,int[]arr){
        int zerocount=0;
        int prd=1;
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                zerocount++;
                continue;
            }
            prd*=a[i];
        }
        arr[0]=prd;
        arr[1]=zerocount;
    }
}
