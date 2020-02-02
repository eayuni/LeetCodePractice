package pkg1;
//94. Binary Tree Inorder Traversal

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class BinaryTreeInorderTraversal {
	  public static class TreeNode {
		      int val;
		     TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		      
		      TreeNode root;
			public TreeNode() {
				// TODO Auto-generated constructor stub
			}
			public void insert(Integer data) {
				
				if(root == null) {
					root = new TreeNode(data);
				}
				if(data >= this.val) {
					if(this.right == null){
						this.right = new TreeNode(data);
					}else
						this.right.insert(data);
				}
				else{
					if(this.left == null) {
						this.left = new TreeNode(data);
						}
					else
						this.left.insert(data);
					
				}
		  }
	  public static List<Integer> inorderTraversal(TreeNode root) {
		  List<Integer> result = new ArrayList<>();
		  
		  while(root !=null) {
			  result.add(root.val);
			  root = root.left;
		  }
		  
		return result;
		  
		  
	  }
	  
		 

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        TreeNode root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root.insert(data);
        }
        scan.close();
        
        
        System.out.println(inorderTraversal(root));
		
		
	}

}
}
