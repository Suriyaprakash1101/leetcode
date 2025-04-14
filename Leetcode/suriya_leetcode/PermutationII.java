/*
Given a collection of numbers, nums, that might contain duplicates, return all possible unique permutations in any order.

 

Example 1:

Input: nums = [1,1,2]
Output:
[[1,1,2],
 [1,2,1],
 [2,1,1]]
Example 2:

Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 

Constraints:

1 <= nums.length <= 8
-10 <= nums[i] <= 10
*/
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>>result=new ArrayList<>();
        Arrays.sort(nums);
        ArrayList<Integer>tem=new ArrayList<>();
        boolean[]b=new boolean[nums.length];
        backtrack(result,tem,b,nums);
        return result;
    }
    public static void backtrack(List<List<Integer>>result,ArrayList<Integer>tem,boolean[]b,int[]nums){
        if(tem.size()==nums.length){
            if(!result.contains(tem)){
                result.add(new ArrayList<>(tem));
                
            }
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(b[i]){
                continue;
            }
            b[i]=true;
            tem.add(nums[i]);
            backtrack(result,tem,b,nums);
            b[i]=false;
            tem.remove(tem.size()-1);
        }

    }
}
