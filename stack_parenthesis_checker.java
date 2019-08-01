import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int q=0;q<n;q++){
		    String st=sc.next();
		    char[] ch=st.toCharArray();
		    boolean b=false;
		    Stack<Character> s1=new Stack<>();
		    s1.push('a');
		    for(int i=0;i<ch.length;i++){
		        if(ch[i]=='{' || ch[i]=='(' || ch[i]=='['){
		            s1.push(ch[i]);
		            //System.out.println(s1.peek());
		        }
		        else{
		            if(ch[i]=='}'){
		                if(s1.peek()=='a'){
		                    b=false;
		                    break;
		                }
		                else{
		                char ch1=s1.pop();
		                if(ch1=='{'){
		                    b=true;
		                    //System.out.println("k");
		                }
		                }
		            }
		            if(ch[i]==']'){
		                if(s1.peek()=='a'){
		                    b=false;
		                    break;
		                }
		                else{
		                char ch1=s1.pop();
		                if(ch1=='['){
		                    b=true;
		                    //System.out.println("N");
		                }
		                }
		            }
		            if(ch[i]==')'){
		                if(s1.peek()=='a'){
		                    b=false;
		                    break;
		                }
		                else{
		                char ch1=s1.pop();
		                if(ch1=='('){
		                    b=true;
		                    //System.out.println("Q");
		                }
		                }
		            }
		        }
		    }
		    if(s1.pop()!='a'){
		        b=false;
		    }
		    if(b){
		        System.out.println("balanced");
		    }
		    else{
		        System.out.println("not balanced");
		    }
		}
	}
}
