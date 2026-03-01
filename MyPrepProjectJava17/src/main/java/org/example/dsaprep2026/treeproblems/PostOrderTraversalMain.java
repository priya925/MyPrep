package org.example.dsaprep2026.treeproblems;

public class PostOrderTraversalMain extends CreateBinaryTree {
    public static void main(String[] args) {
        PostOrderTraversalMain potm = new PostOrderTraversalMain();
        Node root = potm.createBinaryTree();
        PostOrderTraversal pot = new PostOrderTraversal();
        pot.traverseTreeInPostOrder(root);
    }
}


class PostOrderTraversal {
    public void traverseTreeInPostOrder(Node root) {
        if (root == null)
            return;
        if (root.right != null) {
            traverseTreeInPostOrder(root.right);
        }
        if (root.left != null)
            traverseTreeInPostOrder(root.left);
        System.out.print(root.value + "\n");
    }
}