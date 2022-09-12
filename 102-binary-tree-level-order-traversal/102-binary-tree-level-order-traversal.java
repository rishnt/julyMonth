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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> level=new ArrayList<>();
        if(root==null){
            return level;
        }
        
        Queue<TreeNode> node=new LinkedList<TreeNode>();
        node.add(root);
        
        while(!node.isEmpty()){
            ArrayList<Integer> ar=new ArrayList<Integer>();
            
           int size=node.size();
            for(int i=0;i<size;i++){
                TreeNode curr=node.poll();
                ar.add(curr.val);
                if(curr.left!=null){
node.add(curr.left);
                }
                if(curr.right!=null){
                    node.add(curr.right);
                }
                
            }           
                level.add(ar);
        }

            
        
        return level;
        
    }
}