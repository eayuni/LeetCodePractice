package pkg1;
//104. Maximum Depth of Binary Tree
public class MaximumDepthBinaryTree {
	
	 // Definition for a binary tree node.
	  public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	

	
	    public int maxDepth(TreeNode root) {
	        
	        if(root == null){
	            return 0;
	        }
	        
	        int left = 1 + maxDepth(root.left);
	        int right =1 + maxDepth(root.right);
	        
	        return Math.max(left,right);
	        
	    }

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}