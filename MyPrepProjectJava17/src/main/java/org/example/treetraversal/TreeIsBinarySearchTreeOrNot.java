package org.example.treetraversal;

public class TreeIsBinarySearchTreeOrNot {

    BinaryTreeNode root;

    public static void main(String[] args){
        TreeIsBinarySearchTreeOrNot tree = new TreeIsBinarySearchTreeOrNot();
        tree.root = new BinaryTreeNode(4);
        tree.root.left = new BinaryTreeNode(2);
        tree.root.right = new BinaryTreeNode(5);
        tree.root.left.left = new BinaryTreeNode(1);
        tree.root.left.right = new BinaryTreeNode(3);

        boolean isBst = tree.isBstOrNot(tree.root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.println(isBst);
    }

    public boolean isBstOrNot(BinaryTreeNode node, int min, int max){
        if(node == null)
            return true;
        if(node.data < min || node.data>max)
            return false;
        return (isBstOrNot(node.left, min, node.data-1)
                && isBstOrNot(node.right, node.data+1,max ));
    }
}

class BinaryTreeNode{
    int data;
    BinaryTreeNode left;
    BinaryTreeNode right;
    BinaryTreeNode(int x){
        this.data = x;
        this.left = null;
        this.right = null;
    }
}
