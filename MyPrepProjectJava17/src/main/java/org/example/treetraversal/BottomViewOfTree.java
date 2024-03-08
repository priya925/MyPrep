package org.example.treetraversal;

import java.util.*;

public class BottomViewOfTree {

    public static void main(String[] args){
        TreeBottomView root = new TreeBottomView(20);
        root.left = new TreeBottomView(8);
        root.right = new TreeBottomView(22);
        root.left.left = new TreeBottomView(5);
        root.left.right = new TreeBottomView(3);
        root.right.left = new TreeBottomView(4);
        root.right.right = new TreeBottomView(25);
        root.left.right.left = new TreeBottomView(10);
        root.left.right.right = new TreeBottomView(14);
        bottomView(root);
    }

    public static void bottomView(TreeBottomView root){
        if(root == null)
            System.out.println("No node in this tree");
        Queue<TreeBottomView> queue = new LinkedList<>();
        Map<Integer, Integer> map = new TreeMap<>();
        int hd = 0;
        root.distance = hd;
        queue.add(root);
        while(!queue.isEmpty()){
            TreeBottomView node = queue.peek();
             hd = node.distance;
            map.put(hd, node.data);
            if(node.left != null){
                TreeBottomView leftNode = node.left;
                leftNode.distance = hd -1;
                queue.add(leftNode);
            }
            if(node.right != null){
                TreeBottomView rightNode = node.right;
                rightNode.distance = hd+1;
                queue.add(rightNode);
            }
            queue.poll();
        }

        for(Map.Entry<Integer,Integer> m: map.entrySet()){
            System.out.println(m.getValue());
        }
    }
}

class TreeBottomView{
    int data;
    TreeBottomView left, right;
    int distance;
    TreeBottomView(int data){
        this.data = data;
        this.distance = Integer.MAX_VALUE;
        this.left = null;
        this.right = null;
    }
}
