class Node
{ 
    int data; 
    Node next; 
  
    public Node(int data) 
    { 
        this.data = data; 
        this.next = null; 
    } 
} 
  
public class conseSumZero { 
  
    
    static void conseSumZero(Node head) 
    {   
    	
        Node start=head;//=new Node();
    	Node nexts;//=new Node();   
    	int sum=0;int k=1;
        while(start.next!=null)
        {	sum=0;
        	nexts=start.next;
        	while(nexts.next!=null)
        	{
        		sum+=nexts.data;
        		System.out.println("sum"+sum);
        		if(sum==0)
        		{	k++;
        			start.next=nexts.next;
        			System.out.println("sum=0");
        			printList(head);
        			break;
        			
        		}
        		nexts=nexts.next;
        		System.out.println(nexts.data);
        	}
        	if(k%2==0)
        		start=start;
        	else
        		start=start.next;
        }
        	
        printList(head); 
    } 
  
    // Function to traverse and print Linked List 
    static void printList(Node head) 
    { System.out.println("hih"); 
        while (head.next != null) { 
            System.out.print(head.data + "-> "); 
            head = head.next; 
        } 
        System.out.println(head.data); 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        Node head = new Node(8); 
                head.next = new Node(10); 
                head.next.next = new Node(1); 
                head.next.next.next = new Node(4); 
                head.next.next.next.next = new Node(-1); 
                head.next.next.next.next.next = new Node(-3); 
                head.next.next.next.next.next.next = new Node(6); 
                head.next.next.next.next.next.next.next = new Node(-6); 
                head.next.next.next.next.next.next.next.next = new Node(-7); 
                head.next.next.next.next.next.next.next.next.next = new Node(3);
                printList(head); 
        conseSumZero(head); 
          
    } 
} 

