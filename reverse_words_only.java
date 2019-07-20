/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int x=0;x<n;x++){
		    String s=sc.next();
		    String[] ar=s.split("\\.");
		    //System.out.println(ar.length);
		    if(ar.length>=1){
		    for(int i=0;i<ar.length-1;i++){
		        rever(ar[i]);
		        System.out.print(".");
		    }
		    rever(ar[ar.length-1]);
		    }
		    else{
		        rever(ar[0]);
		    }
		    System.out.println();
		}
	}
	static void rever(String s){
	    char[] a=s.toCharArray();
	    int n=a.length;
	    char[] k=new char[n];
	    for(int i=0;i<n;i++){
	        k[i]=a[n-i-1];
	        System.out.print(k[i]);
	    }
	    //String s1=(String)k;
	    //System.out.print(s1);
	}
}
