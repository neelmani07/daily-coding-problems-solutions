package hanson;
import java.util.*;
class Node2
{
	int value;
	Node2 lchild;
	Node2 rchild;
	
	Node2(int val)
	{
		lchild=rchild=null;
		value=val;
	}
}
public class NodeCousinSum
{
	
	public static void fillList(LinkedList<Integer> nodes)
	{
		int ar[]= {36,30,25,15,12,10};
		for(int i=0;i<ar.length;i++)
		{
			nodes.push(ar[i]);
		}
	}
	public static void constructTree(LinkedList<Integer> nodes, Queue<Node2> q,Node2 root)
	{	
		
		q.add(root);int k=1;
		while (k<nodes.size() && nodes.get(k)!=null)
		{
			Node2 currentRoot=q.poll();int aisehi=0;
			Node2 ToBlchild=new Node2(nodes.get(k));
			k++;
			currentRoot.lchild=ToBlchild;
			q.add(ToBlchild);
			
			if(k<nodes.size() && nodes.get(k)!= null)
			{
				//System.out.println(nodes.get(k));
				Node2 ToBrchild=new Node2(nodes.get(k));
				k++;
				currentRoot.rchild=ToBrchild;
				q.add(ToBrchild);
			}
		}
	}
	public static void inorderTraverse(Node2 root)
	{
		if(root==null)
			return;
		else
		{
			inorderTraverse(root.lchild);
			System.out.println(root.value+",");
			inorderTraverse(root.rchild);
		}
	}
	public static int findCsum(Node2 root,char ch)
	{
		int sum=0;
		if(ch=='l')
		{
			if(root.lchild.lchild != null)
				sum+=root.lchild.lchild.value;
			if(root.lchild.rchild != null)
				sum+=root.lchild.rchild.value;
		}
		else
		{
			if(root.rchild.lchild != null)
				sum+=root.rchild.lchild.value;
			if(root.rchild.rchild != null)
				sum+=root.lchild.rchild.value;
		}
		return sum;
	}
	
		
	public static int findSumOfCousins(Node2 root,int node)
	{
		int sum=0;
		while(root!=null)
		{
			if((root.lchild.lchild != null && root.lchild.lchild.value == node) ||(root.lchild.rchild != null && root.lchild.rchild.value == node))
			{	sum=findCsum(root,'r');
				System.out.println("found in left");
				break;
			}
			else if((root.rchild.lchild != null && root.rchild.lchild.value == node) ||(root.rchild.rchild != null && root.rchild.rchild.value == node))
			{
				System.out.println("found in right");
				sum=findCsum(root,'l');
				break;
			}
			findSumOfCousins(root.lchild,node);
			findSumOfCousins(root.rchild,node);
		}
		return sum;
	}
	public static void main(String arg[])
	{
		Node2 root;
		LinkedList<Integer> nodes = new LinkedList<Integer>();
		Queue<Node2> q =  new LinkedList<Node2>(); 
		fillList(nodes);
		root=new Node2(nodes.get(0));
		constructTree(nodes,q,root);
		inorderTraverse(root);
		System.out.println("sum of cousins="+findSumOfCousins(root,36));
		System.out.println("sum of cousins");
	}
}
