//median of two sorted array 
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[]a=new int[nums1.length+nums2.length];
        int j=0;
        for(int i=0;i<nums1.length;i++){
            a[j]=nums1[i];
            j++;
        }
        double add=0;
        for(int i=0;i<nums2.length;i++){
            a[j]=nums2[i];
            j++;
        }
       Arrays.sort(a);
        if(a.length%2==0){
            int med=a.length/2;
            add=(double)(a[med]+a[med-1])/2;
        }
        else{
            add=a[a.length/2];
        }
        return add;

        
    }
}

