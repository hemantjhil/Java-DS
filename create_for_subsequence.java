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
		    String s1=sc.next();
		    char[] c1=s1.toCharArray();
		    String s2=sc.next();
		    char[] c2=s2.toCharArray();
		    boolean b=false;
		    int n1=s1.length();
		    int n2=s2.length();
		    int p=0;
		    int t=0;
		    int j=0,i=0;
		    for(i=0;i<n1;i++){
		        b=false;
		        for(j=p;j<n2;j++){
		            if(c1[i]==c2[j]){
		                b=true;
		                p=j+1;
		                break;
		            }
		        }
		        if(!b){
		            break;
		        }
		    }
		    if(i==n1){
		        System.out.println("1");
		    }
		    else{
		        System.out.println("0");
		    }
		}
	}
}
