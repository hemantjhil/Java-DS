{
import java.util.*;
class StackUsingQueues
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			Queues g = new Queues();
			
			int q = sc.nextInt();
			while(q>0)
			{
				int QueryType = sc.nextInt();
				if(QueryType == 1)
				{
					int a = sc.nextInt();
					g.push(a);
				}
				else if(QueryType == 2)
				System.out.print(g.pop()+" ");
			q--;
			}	
			System.out.println();
				
			
			
		t--;
		}
	}
}

}
/*This is a function problem.You only need to complete the function given below*/

class Queues
{
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
    /*The method pop which return the element poped out of the stack*/
    int pop()
    {
	    // Your code here
	    //return q1.poll();
	    if(q1.peek()==null){
	        return -1;
	    }
	    else{
	        int x=q1.peek();
	        q1.remove();
	        return x;
	    }
    }
	
    /* The method push to push element into the stack */
    void push(int a)
    {
	    // Your code here
	    q2.add(a);
	    while(q1.peek()!=null){
	        q2.add(q1.peek());
	        q1.remove();
	    }
	    Queue<Integer> q=q1;
	    q1=q2;
	    q2=q;
    }
}
