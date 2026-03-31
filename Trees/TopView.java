package Trees;


import java.util.*;
/*
class TopView {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/
class TopView {
    static class pair {
        Node node;
        int level;

        pair(Node node, int level) {
            this.node = node;
            this.level = level;
        }
    }

    public ArrayList<Integer> topView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) return ans;
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(root, 0));
        while (!q.isEmpty()) {
            pair p = q.poll();
            Node curr = p.node;
            int level = p.level;
            if (!map.containsKey(level)) {
                map.put(level, new ArrayList<>());
            }
            map.get(level).add(curr.data);
            if (curr.left != null) {
                q.add(new pair(curr.left, level - 1));
            }
            if (curr.right != null) {
                q.add(new pair(curr.right, level + 1));
            }
        }
        for (int key : map.keySet()) {
            ans.add(map.get(key).get(0));
        }
        return ans;
    }
}
