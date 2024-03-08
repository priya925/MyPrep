package org.example.treetraversal;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalOfTree {

    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.left.right.right = new Node(5);
        root.left.right.right.right = new Node(6);
        levelOrderTraversalInOneLine(root);
        levelOrderTraversal(root);

        System.out.println("in order traversal in one line");
        inorderTraversal(root);

        System.out.println("pre order traversal in one line");
        preorderTraversal(root);

        System.out.println("postOrder order traversal in one line");
        postorderTraversal(root);
    }

    public static void levelOrderTraversalInOneLine(Node root){
        System.out.println("level order traversal in one line");
        if(root == null)
            return;

        StringBuilder sb = new StringBuilder("");
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node node = queue.peek();
            sb.append(node.data).append(" ");
            if(node.left != null)
                queue.add(node.left);
            if(node.right != null)
                queue.add(node.right);
            queue.poll();
        }
        System.out.println(sb);
    }

    public static void levelOrderTraversal(Node root){
        System.out.println("level order traversal");

        if(root == null)
            return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        StringBuilder sb = new StringBuilder("");
        while(!queue.isEmpty()){
            Node node = queue.remove();
            if(node == null && queue.size() != 1)
                sb.append("\n");
            else {
                sb.append(node.data).append(" ");
                if(node.left!= null)
                    queue.add(node.left);
                if(node.right != null)
                    queue.add(node.right);
                if((node.left !=null || node.right!= null))
                    queue.add(null);
            }

        }
        System.out.println(sb);
    }

    public static void inorderTraversal(Node node){
        if(node == null){
            return;
        }
//        inorderTraversal(node.left);
//        System.out.println(node.data);
//        inorderTraversal(node.right);
    }

    public static void preorderTraversal(Node node){

        if(node == null){
            return;
        }
        System.out.println(node.data);
        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }
    public static void postorderTraversal(Node node){

        if(node == null){
            return;
        }
        postorderTraversal(node.left);
        postorderTraversal(node.right);
        System.out.println(node.data);
    }
}
