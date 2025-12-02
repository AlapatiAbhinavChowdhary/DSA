import java.util.*;
public class BinaryTree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTreeBuild{
        static int idx= -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }


    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);;
    }
    public static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void levelorder(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode =q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            } else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
    }

    public static int countofnodes(Node root){
        if(root ==null){
            return 0;
        }
        int leftNode = countofnodes(root.left);
        int rightNode = countofnodes(root.right);
        return leftNode + rightNode + 1;
    }

    public static int sumofnodes(Node root){
        if(root ==null){
            return 0;
        }
        int leftsum=sumofnodes(root.left);
        int rightsum=sumofnodes(root.right);
        return leftsum + rightsum + root.data;
    }

    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int leftheight=height(root.left);
        int rightheight=height(root.right);
        return Math.max(leftheight,rightheight)+1;
    }
    public static int diameter(Node root){
        if(root==null){
            return 0;
        }
        int diam1=diameter(root.left);
        int diam2=diameter(root.right);
        int diam3=height(root.left)+height(root.right)+1;
        return Math.max(diam3,Math.max(diam1,diam2));
    }
    static class Info{
        int diam;
        int ht;

        Info(int diam,int ht){
            this.diam=diam;
            this.ht=ht;
        }
    }

    public static Info diameter2(Node root){
        if(root==null){
            return new Info(0,0);
        }
        Info leftinfo=diameter2(root.left);
        Info rightinfo=diameter2(root.right);

        int diam1=leftinfo.diam;
        int diam2=rightinfo.diam;
        int diam3=leftinfo.ht + rightinfo.ht + 1;

        int ht=Math.max(leftinfo.ht,rightinfo.ht)+1;

        int finaldiam=Math.max(diam3,Math.max(diam1,diam2));
        return new Info(finaldiam,ht);
    }






    public static void main(String[] args){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTreeBuild tree=new BinaryTreeBuild();
        Node root=tree.buildTree(nodes);
        preorder(root);
        System.out.println(); 
        inorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        levelorder(root);
        System.out.println("Count of nodes: "+countofnodes(root));
        System.out.println("Sum of nodes: "+sumofnodes(root));
        System.out.println("Height of tree: "+height(root));
        System.out.println("Diameter of tree: "+diameter(root));
        System.out.println("Diameter of tree (optimized): "+diameter2(root).diam);

    }
}
