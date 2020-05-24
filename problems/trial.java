package hanson;

//Java program to find count of single valued subtrees 

/* Class containing left and right child of current  
node and key value*/
class Node  
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

class trial  
{ 
 Node root;   
// Count ct = new Count(); 
    
 // This function increments count by number of single  
 // valued subtrees under root. It returns true if subtree  
 // under root is Singly, else false. 
 int countSingleRec(Node node)  
 { 	
	 System.out.println(node.data+" "+ node.left.data+"  "+node.right.data+"  "+node.left.left.data+"  "+node.left.right.data+"  "+ node.right.right.data);
     // Return false to indicate NULL 
     if (node == null) 
         return 1; 
        
     // Recursively count in left and right subtrees also 
     else
    	 {
    	 if(node.left != null && node.right != null)
    	 {
    	  int left1 = countSingleRec(node.left); 
    	 
    	 int right1 = countSingleRec(node.right); 
    	 
    	 
     // If any of the subtrees is not singly, then this 
     // cannot be singly. 
    	 if (node.left.data == node.right.data &&  node.right.data==node.data) 
    		 return (left1+right1+1); 
    	 else 
    		 return (left1+right1);
    	 }
    	 }
	return 0;
 }
 

    /* // If left subtree is singly and non-empty, but data 
     // doesn't match 
     if (node.left != null && node.data != node.left.data) 
         return false; 

     // Same for right subtree 
     if (node.right != null && node.data != node.right.data) 
         return false; 

     // If none of the above conditions is true, then 
     // tree rooted under root is single valued, increment 
     // count and return true. 
     c.count++; 
     return true; */
 

 // This function mainly calls countSingleRec() 
 // after initializing count as 0 
 int countSingle()  
 { 
     return countSingle(root); 
 } 

 int countSingle(Node node)  
 { 
     // Recursive function to count 
     return countSingleRec(node); 
     
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
     trial tree = new trial(); 
     tree.root = new Node(5); 
     tree.root.left = new Node(4); 
     tree.root.right = new Node(5); 
     tree.root.left.left = new Node(4); 
     tree.root.left.right = new Node(4); 
     tree.root.right.right = new Node(5); 

     System.out.println("The count of single valued sub trees is : "
                                         + tree.countSingleRec(tree.root)); 
 } 
} 