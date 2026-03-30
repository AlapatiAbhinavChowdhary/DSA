package Trees;


import java.util.*;
/**
 * Definition for a binary tree node.
 * public class PostorderTraversal {
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
class PostorderTraversalSolution {
    void postorder(TreeNode root,List<Integer> res){
        if(root==null) return;
        postorder(root.left,res);
        postorder(root.right,res);
        res.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        postorder(root,res);
        return res;
    }
}
