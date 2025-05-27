/*
86. Partition List
Solved
Medium
Topics
premium lock icon
Companies
Given the head of a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.

You should preserve the original relative order of the nodes in each of the two partitions.

 

Example 1:


Input: head = [1,4,3,2,5,2], x = 3
Output: [1,2,2,4,3,5]
Example 2:

Input: head = [2,1], x = 2
Output: [1,2]
 

Constraints:

The number of nodes in the list is in the range [0, 200].
-100 <= Node.val <= 100
-200 <= x <= 200

*/
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode dummy1=new ListNode(-1);
        ListNode dummy2=new ListNode(-1);
        ListNode s=head;
        ListNode d1=dummy1;
        ListNode d2=dummy2;
        while(s!=null){
            if(s.val>=x){
                d1.next=s;
                d1=s;
            }
            else{
                d2.next=s;
                d2=s;
            }
            s=s.next;
        }
        d1.next=null;
        d2.next=dummy1.next;
        return dummy2.next;
    }
}
