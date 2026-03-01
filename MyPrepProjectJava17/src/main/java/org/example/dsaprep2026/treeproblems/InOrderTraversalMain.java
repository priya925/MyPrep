package org.example.dsaprep2026.treeproblems;

public class InOrderTraversalMain extends CreateBinaryTree {
    public static void main(String[] args){
    InOrderTraversalMain iotm = new InOrderTraversalMain();
    Node root = iotm.createBinaryTree();
    InOrderTraversal iot = new InOrderTraversal();
    iot.traverseTreeInInOrder(root);
    }
}


class InOrderTraversal{
    public void traverseTreeInInOrder(Node root){
        if(root == null)
            return;
        System.out.println(root.value);
        if(root.left != null){
            traverseTreeInInOrder(root.left);
        }
        if(root.right != null)
            traverseTreeInInOrder(root.right);
    }
}