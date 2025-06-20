/*
60. Permutation Sequence
Solved
Hard
Topics
premium lock icon
Companies
The set [1, 2, 3, ..., n] contains a total of n! unique permutations.

By listing and labeling all of the permutations in order, we get the following sequence for n = 3:

"123"
"132"
"213"
"231"
"312"
"321"
Given n and k, return the kth permutation sequence.

 

Example 1:

Input: n = 3, k = 3
Output: "213"
Example 2:

Input: n = 4, k = 9
Output: "2314"
Example 3:

Input: n = 3, k = 1
Output: "123"
 

Constraints:

1 <= n <= 9
1 <= k <= n!
*/
class Solution {
    public String getPermutation(int n, int k) {
        int[]nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=i+1;
        }
        int count=1;
        while(count<k){
            permutation(nums);
            count++;
        }
        String s="";
        for(int i=0;i<n;i++){
            s+=String.valueOf(nums[i]);
        }
        return s;
    }
    public static void permutation(int[]nums){
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
    public static void reverse(int[]a,int index){
        int i=index;
        int j=a.length-1;
        while(i<j){
            int tem=a[i];
            a[i]=a[j];
            a[j]=tem;
            i++;
            j--;
        }
    }
}
/*
refer next permutation algorithm and then see getPermutation funtion for clear understanding
*/
