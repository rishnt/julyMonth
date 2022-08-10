/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer> ansList=new ArrayList<Integer>();
    public List<Integer> preorderTraversal(TreeNode root) {
        
        preorderTraversalUtil(root);
        return ansList;
    }
    
    public void preorderTraversalUtil(TreeNode root) {
        if(root ==null) return;
        ansList.add(root.val);
        preorderTraversalUtil(root.left);
        preorderTraversalUtil(root.right);
      
    }
       
    }
