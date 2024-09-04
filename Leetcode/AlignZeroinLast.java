//align zero in the last of the array
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[]a={1,0,2,0,3,4,0,5,0,0,6};
		fun(a);
		//System.out.println(Arrays.toString(a));
	}
	public static void fun(int[]a){
	    int j=0;
	    for(int i=0;i<a.length;i++){
	        if(a[i]!=0&&a[j]==0){
	            int tem=a[i];
	            a[i]=a[j];
	            a[j]=tem;
	            System.out.println(Arrays.toString(a));
	        }
	        if(a[j]!=0){
	            j++;
	        }
	    }
	}
}


