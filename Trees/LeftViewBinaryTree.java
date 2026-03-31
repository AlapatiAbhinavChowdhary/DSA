package Trees;


import java.util.*;

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
class LeftViewBinaryTree {
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
