package org.example.dsaprep2026.treeproblems;

public class BorderTreeTraversalMain extends CreateBinaryTree {

    public static void main(String[] args) {
        BorderTreeTraversalMain bttm = new BorderTreeTraversalMain();
        Node root = bttm.createBinaryTree();

        BorderTreeTraversal btt = new BorderTreeTraversal();
        btt.printBorderNodes(root);
    }


}


class BorderTreeTraversal {
    Node mainRoot;

    void printBorderNodes(Node root) {
        if (root == null)
            System.out.println("Root is null, tree is not present.");
        else {
            mainRoot = root;
            printLeftNodes(root);
            printLeafNodes(root);
            printRightNodes(root);
        }
    }

    void printLeftNodes(Node root) {
        if (root != null) {
            if (root.left != null) {
                System.out.println(root.value);
                printLeftNodes(root.left);
            } else
                printLeftNodes(root.right);
        }
    }

    void printLeafNodes(Node root) {
        if (root != null) {
            if (root.left == null && root.right == null) {
                System.out.println(root.value);
            }
            printLeafNodes(root.left);
            printLeafNodes(root.right);
        }
    }

    void printRightNodes(Node root) {
        if (root != null) {
            if (root.right != null) {
                printRightNodes(root.right);
                if(root.value != mainRoot.value)
                    System.out.println(root.value);
            }
        } else if (root.left != null)
            printRightNodes(root.left);
    }
}



