/* 

Given a binary tree, return the preorder traversal of its nodes' values.

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
     * @return: Preorder in ArrayList which contains node values.
     */
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        // write your code here
    		if(null == root){
    			return new ArrayList<Integer>();
    		}
    		ArrayList<Integer> results = new ArrayList<Integer>();

    		if(root.left != null){
    				results.addAll(preorderTraversal(root.left));
    		}
    		results.add(root.val);
    		if(root.right != null){
    			  results.addAll(preorderTraversal(root.right));
    		}

    		return results;



    }
}