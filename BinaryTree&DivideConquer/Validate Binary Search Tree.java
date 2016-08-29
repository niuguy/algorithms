/*
Given a binary tree, determine if it is a valid binary search tree (BST).

Assume a BST is defined as follows:

The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.
A single node tree is a BST
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

		private int lastVal = Integer.MIN_VALUE;
		private boolean firstNode = true;
    /**
     * @param root: The root of binary tree.
     * @return: True if the binary tree is BST, or false
     */
    public boolean isValidBST(TreeNode root) {
        // write your code here
    	if(root == null){
    		return true;
    	}

    	if(!isValidBST(root.left)){
    		return false;
    	}

    	firstNode = false;
    	lastVal = root.val;
    	if(!isValidBST(root.right)){
    		return false;
    	}
    	return true;

    }
}