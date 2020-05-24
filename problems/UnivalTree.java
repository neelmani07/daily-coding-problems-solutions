package hanson;
import java.lang.*;
import java.util.*;
/*
 * This problem was asked by Google.

A unival tree (which stands for "universal value") is a tree where all nodes under it have the same value.

Given the root to a binary tree, count the number of unival subtrees.

For example, the following tree has 5 unival subtrees:

   0
  / \
 1   0
    / \
   1   0
  / \
 1   1
 */
class Node1  
{ 
    int data; 
    Node left, right; 
   
    public Node(int item)  
    { 
        data = item; 
        left = right = null; 
    } 
} 
   
/*class Count  
{ 
    int count = 0; 
} */
   
class UnivalTree  
{ 
    Node root;   
    //Count ct = new Count(); 
       
    // This function increments count by number of single  
    // valued subtrees under root. It returns true if subtree  
    // under root is Singly, else false. 
   int univalSubtreeCount(Node node)//, Count c)  
    { 
        // Return false to indicate NULL 
        if (node == null) 
            return 1; 
           
        // Recursively count in left and right subtrees also 
        else { Node lftchld=node.left;
        Node rtchld=node.right;
        int left = univalSubtreeCount(lftchld);//, c); 
        int right = univalSubtreeCount(rtchld);//, c); 
   
        // If any of the subtrees is not singly, then this 
        // cannot be singly. 
        if ((lftchld.data == rtchld.data)&&(rtchld.data == node.data)) 
            return left+right+1; 
        else 
        	return left+right;}
    }
   
        // If left subtree is singly and non-empty, but data 
        // doesn't match 
        /*if (node.left != null && node.data != node.left.data) 
            return false; 
   
        // Same for right subtree 
        if (node.right != null && node.data != node.right.data) 
            return false; 
   
        // If none of the above conditions is true, then 
        // tree rooted under root is single valued, increment 
        // count and return true. 
        c.count++; 
        return true; 
    } 
   
    // This function mainly calls countSingleRec() 
    // after initializing count as 0 */
   
   
    int UnivalTree(Node node)  
    { 
         
        return univalSubtreeCount(node); 
       
    }

    int UnivalTree()  
    { 
         
        return UnivalTree(root); 
       
    }
   
    // Driver program to test above functions 
    public static void main(String args[])   
    { 
           /* Let us construct the below tree 
                5 
              /   \ 
            4      5 
          /  \      \ 
         4    4      5 */
    	try {
    		
    	
        UnivalTree tree = new UnivalTree(); 
        tree.root = new Node(5); 
        tree.root.left = new Node(4); 
        tree.root.right = new Node(5); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(4); 
        tree.root.right.right = new Node(5); 
        //System.out.println(tree.root.data+" "+ tree.root.left.data+"  "+tree.root.right.data+"  "+tree.root.left.left.data+"  "+tree.root.left.right.data+"  "+ tree.root.right.right.data); 
        System.out.println("The count of single valued sub trees is : "
                + tree.UnivalTree()); 
    	}
    	catch(Exception e)
    	{System.out.println("hghfzd");}
   
        /*System.out.println("The count of single valued sub trees is : "
                                            + tree.univalSubtreeCount(tree.root)); */
       
    } 
} 
   




