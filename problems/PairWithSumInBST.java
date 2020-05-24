package hanson;





public class PairWithSumInBST 
{
	
    class Node
    { 
        int key; 
        Node left, right; 
  
        public Node(int item)
        { 
            key = item; 
            left = right = null; 
        } 
    } 
  
    // Root of BST 
    Node root; 
  
    // Constructor 
    PairWithSumInBST()
    {  
        root = null;  
    } 
  
    // This method mainly calls insertRec() 
    void insert(int key) 
    { 
       root = insertRec(root, key); 
    } 
      
    /* A recursive function to insert a new key in BST */
    Node insertRec(Node root, int key)
    { 
  
        /* If the tree is empty, return a new node */
        if (root == null) { 
            root = new Node(key); 
            return root; 
        } 
  
        /* Otherwise, recur down the tree */
        if (key < root.key) 
            root.left = insertRec(root.left, key); 
        else if (key > root.key) 
            root.right = insertRec(root.right, key); 
  
        /* return the (unchanged) node pointer */
        return root; 
    } 
  
    // This method mainly calls InorderRec() 
    void inorder()
    { 
       inorderRec(root); 
    } 
  
    // A utility function to do inorder traversal of BST 
    void inorderRec(Node root)
    { 
        if (root != null) { 
            inorderRec(root.left); 
            System.out.println(root.key); 
            inorderRec(root.right); 
        } 
    }
    void reverseInorderRec(Node root)
    {
    	if(root!=null)
    	{
    		reverseInorderRec(root.right); 
            System.out.println(root.key); 
            reverseInorderRec(root.left);
    	}
    }
  
    // Driver Program to test above functions 
    public static void main(String[] args)
    { 
    	PairWithSumInBST tree = new PairWithSumInBST(); 
  
        /* Let us create following BST 
              50 
           /     \ 
          30      70 
         /  \    /  \ 
       20   40  60   80 */
       /* tree.insert(50); 
        tree.insert(30); 
        tree.insert(20); 
        tree.insert(40); 
        tree.insert(70); 
        tree.insert(60); 
        tree.insert(80); */
        int arr[]= {50,30,20,40,70,60,80,50};
        for(int i=0;i<7;i++)
        {
        	tree.insert(arr[i]);
        }
        // print inorder traversal of the BST 
        tree.inorder(); 
        tree.reverseInorderRec(tree.root);
    } 
} 