package pkg1;
//100. Same Tree

import java.util.Scanner;



public class SymmetricTree {
	
	  public static class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	     public TreeNode(int x) { val = x; }
	     
		

		public int getVal() {
			return val;
		}
		public void setVal(int val) {
			this.val = val;
		}
		public TreeNode getLeft() {
			return left;
		}
		public void setLeft(TreeNode left) {
			this.left = left;
		}
		public TreeNode getRight() {
			return right;
		}
		public void setRight(TreeNode right) {
			this.right = right;
		}
		
		public void insert(Integer data) {
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
	  }

	 public static boolean isSymmetric(TreeNode root) { 
	        
	       if(root == null) {
	    	   return true;
	       }
	           
	        return isSymmetricRecurse(root.left, root.right);
	    }
		 
	 public static boolean isSymmetricRecurse(TreeNode left, TreeNode right) {
			 if(left == right) {
				 return true;
			 }
			 
			 return isSymmetricRecurse(left.left,right.right) && isSymmetricRecurse(left.right , right.left);
		 }
		 
		
	
	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        TreeNode root = new TreeNode(1);
        while(t > 0) {
            int data = scan.nextInt();
            root.insert(data);
            System.out.println("Here");
            t--;
        }
        scan.close();
        
        while(root!=null) {
        	System.out.println(root.val);
        	
        }
		
		//System.out.println(root);
		
		//System.out.println(isSymmetric(root));
		
	}
	

}

