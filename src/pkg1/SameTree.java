package pkg1;
//100. Same Tree

public class SameTree {
	
	  public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	     TreeNode(int x) { val = x; }
	  }
	 
	class Solution {
	    public boolean isSameTree(TreeNode p, TreeNode q) {
	        
	        if( p == null && q == null){
	            return true;
	        }
	        else if(p== null || q == null){
	            return false;
	        }
	        if(p.val == q.val){
	             return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
	        }
	           
	        return false;
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
