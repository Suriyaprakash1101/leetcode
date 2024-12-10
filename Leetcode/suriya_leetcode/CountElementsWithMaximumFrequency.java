//count elements with maximum frequency
/*3005. Count Elements With Maximum Frequency
Easy
Topics
Companies
Hint
You are given an array nums consisting of positive integers.

Return the total frequencies of elements in nums such that those elements all have the maximum frequency.

The frequency of an element is the number of occurrences of that element in the array.

 

Example 1:

Input: nums = [1,2,2,3,1,4]
Output: 4
Explanation: The elements 1 and 2 have a frequency of 2 which is the maximum frequency in the array.
So the number of elements in the array with maximum frequency is 4.
Example 2:

Input: nums = [1,2,3,4,5]
Output: 5
Explanation: All elements of the array have a frequency of 1 which is the maximum.
So the number of elements in the array with maximum frequency is 5.
 

Constraints:

1 <= nums.length <= 100
1 <= nums[i] <= 100
*/
class Solution {
    public int maxFrequencyElements(int[] nums) {
        ArrayList<Integer>l=new ArrayList<>();
        int max=0;
        ArrayList<Integer>l1=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int count=0;
            if(!l.contains(nums[i])){
                l.add(nums[i]);
                
                for(int j=0;j<nums.length;j++){
                    if(nums[j]==nums[i]){
                        count++;
                    }
                }
                if(max<count){
                    max=count;
                }
                l1.add(count);

                
            }
            
            
        }
        int add=0;
            if(max==1){
                return nums.length;
            }
            else{
                for(int i=0;i<l1.size();i++){
                    if(l1.get(i)==max){
                        add=add+l1.get(i);
                    }
                }
            }
            return add;
    }
}


