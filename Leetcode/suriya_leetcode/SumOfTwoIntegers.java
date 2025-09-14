/*

371. Sum of Two Integers
Solved
Medium
Topics
premium lock icon
Companies
Given two integers a and b, return the sum of the two integers without using the operators + and -.

 

Example 1:

Input: a = 1, b = 2
Output: 3
Example 2:

Input: a = 2, b = 3
Output: 5
 

Constraints:

-1000 <= a, b <= 1000

*/


class Solution {
    public int getSum(int a, int b) {
        while(b!=0){
            int carry=(a&b)<<1;
            a=a^b;
            b=carry;
        }
        return a;
    }
}
/*
bit manipulation:
we get carry using & operator, after that sum get by xor operator, in the xor operator same bits result will be 0, so we use & operator to find carry and add carry with get sum. wherever the carray(b) gets zero then we return the sum.
 
 subtraction
 in subtraction we get the difference by using xor operator, and the borrow will be find by using not and & operator. code below;

 public class Main
{
	public static void main(String[] args) {
		int a=5;
		int b=3;
		while(b!=0){
		    int difference=a^b;
		    int borrow=(~a)&b;
		    a=difference;
		    b=borrow<<1;
		}
		System.out.println(a);
	}
}
 
 */
