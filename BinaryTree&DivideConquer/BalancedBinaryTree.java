/*
Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

*/


/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */
public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: True if this Binary tree is Balanced, or false.
     */
    public boolean isBalanced(TreeNode root) {
        // write your code here
    		if(null == root){
    			return true;
    		}

    		int leftDepth = maxDepth(root.left);
    		int rightDepth = maxDepth(root.right);

    		if(Math.abs(leftDepth - rightDepth) <= 1){
    			return true;
    		}else{
    			return false;
    		}


    }


    public int maxDepth(TreeNode root) {
        // write your code here

    	  if(root == null){
    	  	return 0;
    	  }

    	  int maxDepth = Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;

    	  return maxDepth;
    }
}

