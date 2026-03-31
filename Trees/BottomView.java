package Trees;


import java.util.*;
/*
class BottomView {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/
class BottomView {
    static class pair {
        Node node;
        int level;

        pair(Node node, int level) {
            this.node = node;
            this.level = level;
        }
    }

    public ArrayList<Integer> bottomView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) return ans;
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(root, 0));
        while (!q.isEmpty()) {
            pair p = q.poll();
            Node curr = p.node;
            int lev = p.level;
            if (!map.containsKey(lev)) {
                map.put(lev, new ArrayList<>());
            }
            map.get(lev).add(curr.data);
            if (curr.left != null) {
                q.add(new pair(curr.left, lev - 1));
            }
            if (curr.right != null) {
                q.add(new pair(curr.right, lev + 1));
            }
        }
        for (int key : map.keySet()) {
            int size = map.get(key).size();
            ans.add(map.get(key).get(size - 1));
        }
        return ans;
    }
}
