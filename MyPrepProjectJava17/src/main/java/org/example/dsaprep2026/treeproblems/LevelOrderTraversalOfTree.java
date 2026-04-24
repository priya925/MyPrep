package org.example.dsaprep2026.treeproblems;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalOfTree {

    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(6);
        root.right.left.left = new Node(8);
        root.right.right = new Node(7);

        levelOrderTraversal(root);

    }

    static void levelOrderTraversal(Node root){
        if(root == null)
            return;
        Queue<Node> levelOrderQueue = new LinkedList<>();

        levelOrderQueue.add(root);

        while(!levelOrderQueue.isEmpty()){
            int numberOfNodesOnCurrentLevel = levelOrderQueue.size();
            for(int i = 0; i< numberOfNodesOnCurrentLevel; i++){
                Node currentNode = levelOrderQueue.poll();
                if(currentNode.left != null)
                    levelOrderQueue.add(currentNode.left);
                if(currentNode.right != null)
                    levelOrderQueue.add(currentNode.right);
                System.out.println(currentNode.value);
            }
        }

    }
}
