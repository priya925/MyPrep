package org.example.treetraversal;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class BuildTree {
    static Set<TreeNode> set = new HashSet<>();
    static Stack<TreeNode> stack = new Stack<>();

    public static void main(String args[]){
        BuildTree bt = new BuildTree();
        int in[] = new int[] { 3, 2, 1, 5, 4, 6};
        int pre[] = new int[] { 1, 2, 3, 4, 5, 6 };
        int len = in.length;
        TreeNode root = bt.buildTree(in, pre);
        bt.printTreeInOrder(root);
    }

    public TreeNode buildTree(int[] inOrder, int[] preOrder){
        TreeNode root = null;
        for(int pre=0, in=0; pre<preOrder.length;){
            TreeNode node = null;
            do{
                node = new TreeNode(preOrder[pre]);
                if(root == null){
                    root= node;
                }
                if(!stack.isEmpty()){
                    if(set.contains(stack.peek())){
                        set.remove(stack.peek());
                        stack.pop().right = node;
                    } else {
                        stack.pop().left = node;
                    }
                }
                stack.push(node);
                pre++;
            } while(pre< preOrder.length && preOrder[pre] != inOrder[in]);
            node = null;
            while(!stack.isEmpty() && in< inOrder.length && stack.peek().val == inOrder[in]){
                node = stack.pop();
                in++;
            }
            if(node !=null){
                set.add(node);
                stack.push(node);
            }

        }
        return root;
    }

    public void printTreeInOrder(TreeNode node){
        if(node == null)
            return;
        printTreeInOrder(node.left);
        System.out.println(node.val + " ");
        printTreeInOrder(node.right);
    }
}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        this.val = x;
    }
}