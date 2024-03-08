package org.example;

import java.util.Stack;

public class GetMinimumElementFromStack {
    static Stack<Integer> stack = new Stack<>();
    static Stack<Integer> minStack = new Stack<>();
    public static void main(String[] args){
        int[] arr = {10, 5, 0, -1, 0, -1, 0};
        if(arr.length ==0){
            System.out.println("Array is empty.");
        }
        for(int i=0; i<arr.length;i++){
            stack.push(arr[i]);
            if(minStack.isEmpty())
                minStack.push(arr[i]);
            else{
                int y = minStack.pop();
                minStack.push(y);
                if(arr[i] < y)
                    minStack.push(arr[i]);
                else
                    minStack.push(y);
            }

        }
        System.out.println(minStack.pop());
    }
}
