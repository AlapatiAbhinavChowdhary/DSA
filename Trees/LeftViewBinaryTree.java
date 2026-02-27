/*
 * Left View of Binary Tree
 * GFG: https://www.geeksforgeeks.org/problems/left-view-of-binary-tree/1
 *
 * Approach: DFS (Preorder traversal)
 * - Visit left child before right child.
 * - The first node encountered at each level is the leftmost node.
 * - Track current level; if arr.size() == level, this is the first node at that level → add it.
 *
 * Time Complexity : O(N)
 * Space Complexity: O(H) — recursion stack, where H is the height of the tree
 */

/*
class LeftViewBinaryTree {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/

class Solution {
    void ans(Node root, int lev, ArrayList<Integer> arr) {
        if (root == null)
            return;
        if (arr.size() == lev)
            arr.add(root.data);
        ans(root.left, lev + 1, arr);
        ans(root.right, lev + 1, arr);
    }

    public ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer> arr = new ArrayList<>();
        ans(root, 0, arr);
        return arr;
    }
}
