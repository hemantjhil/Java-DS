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
		    long n=sc.nextLong();
		    boolean b=false;
		    for(int i=0;i<n;i++){
		        long l=(long)Math.pow(2,i);
		        if(l==n){
		            b=true;
		            break;
		        }
		        if(l>n){
		            break;
		        }
		    }
		    if(b){
		    System.out.println("YES");
		}
		else{
		    System.out.println("NO");
		}
		}
	}
}
