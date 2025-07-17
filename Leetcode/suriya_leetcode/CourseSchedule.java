/*
207. Course Schedule
Solved
Medium
Topics
premium lock icon
Companies
Hint
There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1. You are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that you must take course bi first if you want to take course ai.

For example, the pair [0, 1], indicates that to take course 0 you have to first take course 1.
Return true if you can finish all courses. Otherwise, return false.

 

Example 1:

Input: numCourses = 2, prerequisites = [[1,0]]
Output: true
Explanation: There are a total of 2 courses to take. 
To take course 1 you should have finished course 0. So it is possible.
Example 2:

Input: numCourses = 2, prerequisites = [[1,0],[0,1]]
Output: false
Explanation: There are a total of 2 courses to take. 
To take course 1 you should have finished course 0, and to take course 0 you should also have finished course 1. So it is impossible.
 

Constraints:

1 <= numCourses <= 2000
0 <= prerequisites.length <= 5000
prerequisites[i].length == 2
0 <= ai, bi < numCourses
All the pairs prerequisites[i] are unique.
*/
class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        LinkedList<Integer>[]list=new LinkedList[numCourses];
        for(int i=0;i<numCourses;i++){
            list[i]=new LinkedList<>();
        }
        ArrayList<Integer>l=new ArrayList<>();
        for(int i=0;i<prerequisites.length;i++){
            list[prerequisites[i][0]].add(prerequisites[i][1]);
        }
        int[] incomingEdge=new int[numCourses];
        for(int i=0;i<incomingEdge.length;i++){
            for(int ele:list[i]){
                incomingEdge[ele]++;
            }
        }
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(incomingEdge[i]==0){
                q.offer(i);
            }
        }
        while(!q.isEmpty()){
            int cur=q.poll();
            l.add(cur);
            for(int ele:list[cur]){
                incomingEdge[ele]--;
                if(incomingEdge[ele]==0){
                    q.offer(ele);
                }
            }
        }
        return l.size()==numCourses;
    }
    
}
