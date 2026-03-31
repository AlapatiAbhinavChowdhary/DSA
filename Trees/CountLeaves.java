package Trees;

/* A Binary Tree node
class CountLeaves
{
    int data;
    Node left, right;
}*/
class CountLeaves {
    int countLeaves(Node root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        return countLeaves(root.right) + countLeaves(root.left);
    }
}
