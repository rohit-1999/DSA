package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeImpl {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int node[]) {
            idx++;
            if (node[idx] == -1) return null;
            Node newNode = new Node(node[idx]);
            newNode.left = buildTree(node);
            newNode.right = buildTree(node);
            return newNode;
        }
        public void inOrder(Node root) {
            if(root == null) {//aSystem.out.print(-1+" ");
                return;}
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);

        }
        public void preOrder(Node root) {
            if(root == null) {//aSystem.out.print(-1+" ");
                return;}
            System.out.print(root.data+" ");
            preOrder(root.left);

            preOrder(root.right);

        }
        public void postOrder(Node root) {
            if(root == null) {//aSystem.out.print(-1+" ");
                return;}

            postOrder(root.left);

            postOrder(root.right);
            System.out.print(root.data+" ");

        }
        public void levelOrder(Node root) {
            if(root==null) return;
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
               Node currentNode = q.remove();
               if(currentNode==null){
                   System.out.println();
                   if(q.isEmpty()) break;
                   else q.add(null);
               }
                else{
                    System.out.print(currentNode.data+" ");
                    if(currentNode.left!=null) q.add(currentNode.left);
                    if(currentNode.right!=null) q.add(currentNode.right);
                }
            }
        }
        public int countNode(Node root){
            if(root == null) return 0;
            return 1+countNode(root.left)+countNode(root.right);
        }
        public int sumOfNode(Node root){
            if(root == null) return 0;
            return root.data+sumOfNode(root.left)+sumOfNode(root.right);
        }
        public int height(Node root){
            if(root == null) return 0;
            return 1+Math.max(height(root.left),height(root.right));
        }
        public int diameter(Node node){
           if(node==null) return 0;
            int diaLeft = diameter(node.left);
            int diaRight = diameter(node.right);
            int dia3 = 1+height(node.left)+height(node.right);
            return Math.max(dia3,Math.max(diaLeft,diaRight));
        }
        class TreeInfo{
            int ht;
            int diam;
            public TreeInfo(int ht, int diam) {
                this.ht = ht;
                this.diam = diam;
            }
        }
            public TreeInfo diameter2(Node root){
                if(root==null) return new TreeInfo(0,0);
                TreeInfo left = diameter2(root.left);
                TreeInfo right = diameter2(root.right);
                int myHeight = Math.max(left.ht,right.ht)+1;

                int diaLeft = left.diam;
                int diaRight = right.diam;
                int dia3 = 1+left.ht+right.ht;
                int myDiam = Math.max(dia3,Math.max(diaLeft,diaRight));
                return new TreeInfo(myHeight,myDiam);
            }


    }
        public static void main(String[] args) {
            int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
            BinaryTree tree = new BinaryTree();
            Node root = tree.buildTree(nodes);
//            System.out.println("Inorder");
//            tree.inOrder(root);
//            System.out.println();
//            System.out.println("PostOrder");
//            tree.postOrder(root);
//            System.out.println();
//            System.out.println("PreOrder");
//            tree.preOrder(root);
//            System.out.println();
//            System.out.println("levelOrder");
//            tree.levelOrder(root);
//            System.out.println();
//            System.out.println("countNode");
//            System.out.println(tree.countNode(root));
//            System.out.println();
//            System.out.println("sumOfNode");
//            System.out.println(tree.sumOfNode(root));
//            System.out.println();
//            System.out.println("Height of Tree");
//            System.out.println(tree.height(root));
//            System.out.println();
//            System.out.println("Diameter of Tree");
           System.out.println(tree.diameter(root));
            System.out.print(tree.diameter2(root).diam);
        }
}
