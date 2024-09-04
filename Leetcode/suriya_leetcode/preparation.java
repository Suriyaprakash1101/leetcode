//flipping image
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] row:image){
            for(int i=0;i<(image[0].length+1)/2;i++){//it runs in 2 times
                int tem=row[i]^1;
                row[i]=row[image[0].length-i-1]^1;//length=3-0-1=2
                row[image[0].length-i-1]=tem;
            }
        }
        return image;
    }
}
//count the prime number in the given range
class Solution {
    public int countPrimes(int n) {
        int count=0;
        boolean[]prime=new boolean[n+1];
        for(int i=2;i*i<n;i++){
            if(!prime[i]){
                for(int j=i*2;j<n;j=j+i){
                    prime[j]=true;
                }
            }
        }
        for(int i=2;i<n;i++){
            if(!prime[i]){
                count++;
            }
        }
        return count;
    }   
        
}
//search in 2Darray
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       if(matrix.length==0){
           return false;
       }
       for(int row=0;row<matrix.length;row++){
           for(int col=0;col<matrix[row].length;col++){
               if(matrix[row][col]==target){
                   return true;
               }
               
           }
       }return false;
    }
}
//maximum num. index in array
class Solution {
    public int findPeakElement(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[max]<nums[i]){
                max=i;
            }
        }
        return max;
    }
}
//two sum
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[]a=new int[2];
        int b=0;
        int c=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    b=i;
                    c=j;
                    break;
                }
                
            }
        }
        a[0]=b;
        a[1]=c;
        return a;
    }
}
//palindrome
class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int rem=0;
        int tem=x;
        while(x>0){
            rem=x%10;
            rev=rev*10+rem;
            x=(x/10);
        }
        if(tem==rev){
            return true;
        }
        return false;

    }
}
//reverse the integer
class Solution {
    public int reverse(int x) {
        long ans=0;

        while(x!=0){
            ans=ans*10+x%10;
            x=x/10;
        }
       return(ans<Integer.MIN_VALUE || ans>Integer.MAX_VALUE)?0:(int)ans;//if ans value less than integer mini value or greater than maximum value it return 0.
    }
}
//find the number of steps to reduce the numbers by zero
class Solution {
    public int numberOfSteps(int num) {
        return helper(num,0);
    }
    static int helper(int n,int c){
        if(n==0){
            return c;
        }
        if(n%2==0){
            return helper(n/2,c+1);
        }
        return helper(n-1,c+1);
    }
}
//remove the duplicates from the sorted array
class Solution {
    public int removeDuplicates(int[] nums) {
        int[]arr=new int[nums.length];
        int j=0;
        int n=nums.length;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                arr[j++]=nums[i];
                
            }
        }
        arr[j++]=nums[n-1];
        for(int i=0;i<arr.length;i++){
            nums[i]=arr[i];
        
        }
        return j;
        
    }
}
//fizzbuzz
class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String>l=new ArrayList<>(n-1);
        int i=1;
        while(i<=n){
            if(i<=n){

                
                if(i%3==0 && i%5==0){
                        l.add("FizzBuzz");
                        i+=1;
                    }
                    else if(i%3==0&&i%5!=0){
                        l.add("Fizz");
                        i+=1;
                    
                    }else if(i%3!=0&&i%5==0){
                        l.add("Buzz");
                        i+=1;
                        
                    }
                    else{
                        l.add(Integer.toString(i));
                        i+=1;
                        
                    }
            }
            if(i==n+1){
                break;
            }   

        }
        return l;
    }
}
//remove the duplicates from the sorted linkedlist
class Solution {
    public ListNode deleteDuplicates(ListNode node) {
        if(node==null){
            return node;
        }
        ListNode head=node;
        while(node.next!=null){
            if(node.val==node.next.val){
                node.next=node.next.next;
            }
            else{
                node=node.next;
            }
        }
        return head;
    }

}
//merge two sorted linkedlist
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list=new ListNode();
        ListNode tail=list;
        while(list1 != null&& list2 != null){
            if(list1.val<list2.val){
                tail.next=list1;
                list1=list1.next;
                tail=tail.next;
            }else{
                tail.next=list2;
                list2=list2.next;
                tail=tail.next;
            }
        }
        tail.next=(list1!=null)?list1:list2;
        return list.next;
      
        
    }
}
//linkedlist cycle
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
}
//riched customer wealth
class Solution {
    public int maximumWealth(int[][] accounts) {
        int r=accounts.length;
        
        int[]a=new int[r];
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum=sum+accounts[i][j];
            }
            a[i]=sum;
        }
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }else{
                continue;
            }
        }
        return max;

    }
}
//happy number
class Solution {
    public boolean isHappy(int n) {
        int fast=n;
        int slow=n;
        do{
            slow=find(slow);
            fast=find(find(fast));
        }while(slow!=fast);
        if(fast==1){
            return true;
        }
        return false;
        
    }
    public int find(int num){
        int ans=0;
        while(num>0){
            int rem=num%10;
            ans=ans+(rem*rem);
            num=num/10;
        }
        return ans;
    }
}
//or 
class Solution {
    public boolean isHappy(int n) {
        int fast=n;
        int slow=n;
        do{
            slow=find(slow);
            fast=find(find(fast));
        }while(slow!=fast);
        if(slow==1){
            return true;
        }
        return false;
        
    }
    public int find(int num){
        int ans=0;
        while(num>0){
            int rem=num%10;
            ans=ans+(rem*rem);
            num=num/10;
        }
        return ans;
    }
}
//add digits
lass Solution {
    public int addDigits(int num) {
        int n=num;
        int length=0;
        while(n>0){
            n=addition(n);
            length=(int)(Math.log10(n)+1);
            if(length==1){
                
                break;
            }else{
                continue;
            }
        }
        return n;
    }
    public static int addition(int n){
        int a=0;
        while(n>0){
            int rem=n%10;
            a=a+rem;
            n=n/10;

        }
        return a;
    }
}
//middle of the linkedlist
lass Solution {
    public ListNode middleNode(ListNode head) {
        ListNode s=head;
        ListNode f=head;
        while(f!=null&&f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s;
       
    }
}
//reverse the linkedlist
lass Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode pre=null;
        ListNode present=head;
        ListNode next=present.next;
        while(present!=null){
            present.next=pre;
            pre=present;
            present=next;
            if(next!=null){
                next=next.next;
            }

        }
        return pre;
    }
}
//plus one
class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;  
for(int i=n-1; i>=0; i--)   
{  
if(digits[i] < 9)   
{  
digits[i]++;   
return digits;  
}  
digits[i] = 0;  
}  
int[] newNumber = new int [n+1];  
newNumber[0] = 1;  
return newNumber;  
    }
}
//another method

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[]a={9,8,7,6,5,4,3,2,1,0};
		System.out.println(Arrays.toString(find(a)));
	}
	public static int[]find(int[]digits){
	   for(int i=digits.length-1;i>=0;i--){
	       if(digits[i]+1<10){
	           digits[i]++;
	           return digits;
	       }else{
	           digits[i]=0;
	       }
	   }
	   digits=new int[digits.length+1];
	   digits[0]=1;
	   return digits;
	}
}
//square root of the number
if(x <= 1){
            return x;
            }
        return (int)Math.floor(Math.sqrt(x));
//another method
public class Main{
    public static void main (String[] args) {
        int n=26;
        System.out.println(find(n));
    }
    static int find(int n){
        int start=0;
        int end=n/2;
        int ans=0;
        while(start<=end){
            int mid=start+end/2;
            int tem=mid*mid;
            if(tem>n){
                end=mid-1;
            }
            else if(tem<n){
                ans=mid;
                start=mid+1;
            }
        }
        return ans;
        
    }
}
//the given linkedlist is palindrome or not
class Solution {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer>list=new ArrayList<>();
        ListNode s=head;
        while(s!=null){
            list.add(s.val);
            s=s.next;
        }
        int start=0;
        int end=list.size()-1;
        while(start<end){
            if(list.get(start)==list.get(end)){
                start++;
                end--;
            }else{
                return false;
            }
        }
        return true;
        
    }
}
//maximum twin sum of linkedlist
class Solution {
    public int pairSum(ListNode head) {
        ArrayList<Integer>list=new ArrayList<>();
        ListNode s=head;
        while(s!=null){
            list.add(s.val);
            s=s.next;
        }
        int n=list.size();
        int sum1=0;
        int max=0;
        for(int i=0;i<n/2;i++){
            sum1=list.get(i)+list.get(n-1-i);
            if(sum1>max){
                max=sum1;
            }else{
                continue;
            }
        }
        return max;

    }
}
//reverse the string array
class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        for(int i=0;i<s.length/2;i++){
            char ch=s[i];
            s[i]=s[n-1-i];
            s[n-1-i]=ch;

        }
        System.out.println(s);
    }
}
//search the insert position
class Solution {
    public int searchInsert(int[] nums, int target) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=target){
                return count;
            }else{
                count++;
            }
        }
        return count;
    }
}
//container with most water
class Solution {
    public int maxArea(int[] height) {
      int ans=0;
      int l=0;
      int r=height.length-1;
      while(l<r){
        int min=Math.min(height[l],height[r]);
        ans=Math.max(ans,min*(r-l));
        if(height[l]<height[r]){
          l++;
        }else{
          r--;
        }
      }
      return ans;
    }
}
