package BST;


import java.util.*;

/**
 * Definition for a binary tree node.
 * public class TwoSumInBST {
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
class TwoSumInBST {
    static void inorder(TreeNode root, ArrayList<Integer> arr) {
        if (root == null) return;
        inorder(root.left, arr);
        arr.add(root.val);
        inorder(root.right, arr);
    }

    public boolean findTarget(TreeNode root, int k) {
        if (root == null) return false;
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root, arr);
        int n = arr.size();
        int start = 0;
        int end = n - 1;
        while (start < end) {
            int sum = arr.get(start) + arr.get(end);
            if (sum == k) {
                return true;
            } else if (sum > k) {
                end--;
            } else {
                start++;
            }
        }
        return false;
    }
}
