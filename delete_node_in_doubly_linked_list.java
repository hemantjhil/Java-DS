{
//Initial Template for Java
                               import java.util.*;
class Node
{
	int data;
	Node next;
	Node prev;
	Node(int d)
	{
		data = d;
		next = prev = null;
	}
}
class Delete_Node_From_DLL
{
	Node head;
	Node temp;
	
	void addToTheLast(Node node)
	{
		if(head ==  null)
		{
			head = node;
		}
		else
		{
			Node temp = head;
			while(temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = node;
			node.prev = temp;
		}
	}
	
	void printList(Node head)
	{	Node temp = head;
		while(temp != null)
		{
			System.out.print(temp.data+" ");
			temp =  temp.next;
		}
		System.out.println();
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			Delete_Node_From_DLL list = new Delete_Node_From_DLL();
			
			int a1 = sc.nextInt();
			Node head = new Node(a1);
			list.addToTheLast(head);
			
			for(int i=1;i<n;i++)
			{
				int a = sc.nextInt();
				list.addToTheLast(new Node(a));
			}
			a1 = sc.nextInt();
			GfG g = new GfG();
			list.temp = head;
			//System.out.println(list.temp.data);
			Node ptr = g.deleteNode(list.head, a1);
			list.printList(ptr);
			t--;
		}
	}
}
                               
}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
/* Structure of linkedlist
class Node
{
	int data;
	Node next;
	Node prev;
	Node(int d)
	{
		data = d;
		next = prev = null;
	}
}
*/
class GfG
{
    // function returns the head of the linkedlist
    Node deleteNode(Node head,int x)
    {
	// Your code here	
	    Node t1=head,t2=head,t3=head;
	    int i=0;
	    int count=0;
	    Node t6=head;
	    while(t6!=null){
	        count++;
	        t6=t6.next;
	    }
	    //System.out.println(count);
	    if(x>1 && x!=count){
	    while(i<x-1){
	        t1=t1.next;
	        i++;
	    }
	    t2=t1.next;
	    t3=t1.prev;
	    t3.next=t2;
	    t2.prev=t3;
	    return head;
	    }
	    else if(x==count){
	        Node t7=head;
	        while(t7.next!=null){
	            t7=t7.next;
	        }
	        Node t5=t7.prev;
	        t5.next=null;
	        return head;
	    }
	    else if(x==1){
	        head=head.next;
	        head.prev=null;
	        Node t4=head.next;
	        head.next=t4;
	        return head;
	    }
	    else{
	        return head;
	    }
    }
}
