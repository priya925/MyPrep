package org.example.dsaprep2026.treeproblems;

public class CreateBinaryTree {
    public Node createBinaryTree(){
        Node rootNode;
        rootNode = new Node(50);
        Node node40 = new Node (40);
        Node node45 = new Node(45);
        Node node30 = new Node(30);
        Node node25 = new Node(25);
        Node node20 = new Node(20);
        Node node80 = new Node(80);
        Node node70 = new Node(70);
        Node node90 = new Node(90);
        Node node60 = new Node(60);
        Node node55 = new Node(55);
        Node node65 = new Node(65);
        Node node51= new Node(51);

        rootNode.left = node40;
        rootNode.right = node70;

        //left nodes of root node
        node40.left = node25;
        node40.right = node45;
        node25.left = node20;
        node25.right = node30;

        //right nodes of root node
        node70.right = node80;
        node70.left = node60;
        node60.left = node55;
        node60.right = node65;
        node55.left = node51;
        node80.right = node90;

        return rootNode;
    }
}

class Node{
    int value;
    Node left;
    Node right;
    Node(int value){
        this.value = value;
    }
}
