package org.example.dsaprep2026.treeproblems;

public class PreOrderTraversalMain extends CreateBinaryTree {

    public static void main(String[] args){

        PreOrderTraversalMain potm = new PreOrderTraversalMain();
        Node root = potm.createBinaryTree();
        preOrderTraversal pot = new preOrderTraversal();
        pot.traverseTreeInPreOrder(root);

    }
}


class preOrderTraversal{
    public void traverseTreeInPreOrder(Node root){
        if(root == null)
            return;
        if(root.left != null){
            traverseTreeInPreOrder(root.left);
        }
        System.out.println(root.value);
        if(root.right != null){
            traverseTreeInPreOrder(root.right);
        }

    }
}