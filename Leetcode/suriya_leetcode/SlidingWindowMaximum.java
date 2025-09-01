/*
239. Sliding Window Maximum
Solved
Hard
Topics
premium lock icon
Companies
Hint
You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position.

Return the max sliding window.

 

Example 1:

Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
Output: [3,3,5,5,6,7]
Explanation: 
Window position                Max
---------------               -----
[1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7
Example 2:

Input: nums = [1], k = 1
Output: [1]
 

Constraints:

1 <= nums.length <= 105
-104 <= nums[i] <= 104
1 <= k <= nums.length
*/

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[]ans=new int[nums.length-k+1];
        Deque<Integer>deq=new LinkedList<>();
        int j=0;
        for(int i=0;i<nums.length;i++){
            while(!deq.isEmpty()&&deq.peekFirst()<=i-k){// remove the element which does not include in window
                deq.pollFirst();
            }
            while(!deq.isEmpty()&&nums[deq.peekLast()]<=nums[i]){// remove the smaller element in the deq, because we have maintain the deq in descending order.
                deq.pollLast();
            }
            deq.offerLast(i);
            if(i>=k-1){
                ans[j]=nums[deq.peekFirst()];
                j++;
            }
        }
        return ans;
    }
}
