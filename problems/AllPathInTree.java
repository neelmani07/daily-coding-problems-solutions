
/*
 * This problem was asked by Facebook.

Given a binary tree, return all paths from the root to leaves.

For example, given the tree:

   1
  / \
 2   3
    / \
   4   5
Return [[1, 2], [1, 3, 4], [1, 3, 5]].
 */



class Treenode
{
	public int data;
	public Treenode left,right;
	
	
	public Treenode(int d)
	
	{
		data=d;
		left=null;
		right=null;
		
	}
}
public class AllPathInTree 
{	public void printTreePre(Treenode root)
	{
		if(root==null)
			return;
		else
		{
			System.out.println(root.data);
			printTreePre(root.left);
			printTreePre(root.right);
		}
		
	}
	public void printAllPath(Treenode root,String path)
	{
		if(root.left == null && root.right == null)
		{
			System.out.println("path="+path+root.data);
			return;
		}
		else
		{   
			printAllPath(root.left,path+root.data);
			printAllPath(root.right,path+root.data);
		}
	}
	public static void main(String ar[])
	{
		
		AllPathInTree obj=new AllPathInTree();
		Treenode root=new Treenode(1);
		root.left=new Treenode(2);
		root.right=new Treenode(3);
		root.right.left=new Treenode(4);
		root.right.right=new Treenode(5);
		obj.printTreePre(root);
		obj.printAllPath(root,"");
	}

}
