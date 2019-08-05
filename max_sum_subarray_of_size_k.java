/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int q=sc.nextInt();
		for(int x=0;x<q;x++){
		    int n=sc.nextInt();
		    int s=sc.nextInt();
		    int[] a=new int[n];
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextInt();
		    }
		    int sum=0;
		    if(s<=n){
		    for(int i=0;i<s;i++){
		        sum+=a[i];
		    }
		    int max=sum;
		    for(int i=s;i<n;i++){
		        sum+=a[i];
		        sum-=a[i-s];
		        if(sum>max){
		            max=sum;
		        }
		    }
		    System.out.println(max);
		    }
		    else{
		        
		    }
		}
	}
}
