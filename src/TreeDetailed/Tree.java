package TreeDetailed;

public class Tree {
    // Node class for binary tree.
    static class Node{
        int data;
        Node left;
        Node right;

        Node (int data){
            this.data = data;
            this.left = null;
            this.right = null;


        }
    }
    // Creating Binary tree
    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int [] nodes){
            idx++;
            // Here -1 signifies null
            if(nodes[idx]==-1){
                return null; // The node before this node is the leaf node

            }
            //Recursive method for forming tree
            Node treeFormer = new Node(nodes[idx]);
            treeFormer.left = buildTree(nodes); // recursion for left
            treeFormer.right = buildTree(nodes); // recursion for right

            return treeFormer;

        }

        public static void inorderTraversal (Node root){
            if(root==null){
                return;
            }
            inorderTraversal(root.left);
            System.out.print(root.data+" ");
            inorderTraversal(root.right);

        }

        public static void preorderTraversal(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data+" ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }

        public static void postorderTraversal(Node root){
            if (root==null) return;
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            System.out.print(root.data+" ");
        }
    }


    public static void main(String[] args) {
        int [] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        tree.inorderTraversal(root);
        System.out.println();
        tree.preorderTraversal(root);
        System.out.println();
        tree.postorderTraversal(root);


    }



}
