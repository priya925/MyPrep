package org.example.treetraversal;

import java.util.*;

public class TopViewOfTree {

    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.left.right.right = new Node(5);
        root.left.right.right.right = new Node(6);
        topView(root);
    }

    public static void topView(Node root){
        if(root == null)
            System.out.println("No node found");
        Stack<Node> left = new Stack<>();
        Queue<NodeDistancePair> queue = new LinkedList<>();
        List<Node> right = new ArrayList<>();
        queue.add(new NodeDistancePair(root, 0));
        int l =0,r =0,hd = 0;
        while(!queue.isEmpty()){
            NodeDistancePair element = queue.peek();
            int distance = element.distance;
            if(distance< l){
                left.push(element.node);
                l = distance;
            }
            if(distance>r){
                right.add(element.node);
                r = distance;
            }
            if(element.node.left !=null)
                queue.add(new NodeDistancePair(element.node.left,distance-1));
            if(element.node.right != null)
                queue.add(new NodeDistancePair(element.node.right, distance+1));
            queue.poll();
        }
        while (!left.isEmpty())
            System.out.println(left.pop().data);
        System.out.println(root.data);
        for(int i=0; i<right.size();i++)
            System.out.println(right.get(i).data);
    }


}

class NodeDistancePair{
    Node node;
    int distance;
    NodeDistancePair(Node node, int distance){
        this.node = node;
        this.distance = distance;
    }
}

class  Node{
    int data;
    Node left, right;
    Node(int key){
        this.left = this.right = null;
        this.data = key;
    }
}


