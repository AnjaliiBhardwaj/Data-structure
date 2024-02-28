import java.util.*;
class BottomLeftNode513{
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
    public int findBottomLeftValue(TreeNode root) {
        Queue <TreeNode> pendingQueue=new LinkedList<>();
        pendingQueue.add(root);
        // i can either return frontnode but it has local scope so i need extra var to store the value and initialise it and has globalscope
        TreeNode ans=root;
        while(!pendingQueue.isEmpty()){
            TreeNode frontNode=pendingQueue.poll();
            //storing the value aswell 
            ans=frontNode;
            if(frontNode.right!=null){
                pendingQueue.add(frontNode.right);
            }
            if(frontNode.left!=null){
                pendingQueue.add(frontNode.left);
            }
        }
        return ans.val;
    }
}