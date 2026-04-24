package org.example.dsaprep2026.treeproblems;

public class FindLCAOfTwoNodesInBinaryTree {

    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.left.left = new Node(8);
        root.right.right = new Node(7);
        Node n1 = root.right.left.left;
        Node n2 = root.right.right;

        Node lca = findLca(root, n1, n2);
        System.out.println(lca.value);

    }

    static Node findLca(Node root, Node n1, Node n2){
        if(root == null)
            return  null;

        if(root == n1 || root == n2){
            return root;
        }

        Node leftLca = findLca(root.left, n1, n2);
        Node rightLca = findLca(root.right, n1, n2);

        if (leftLca != null && rightLca != null)
            return root;

        return leftLca != null ? leftLca : rightLca;
    }


}
