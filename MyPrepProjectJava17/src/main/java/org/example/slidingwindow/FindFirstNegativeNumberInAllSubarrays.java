package org.example.slidingwindow;

import java.util.LinkedList;
import java.util.Queue;

public class FindFirstNegativeNumberInAllSubarrays {

    public static void main(String[] args){
        int[] arr = {1,2,-3,-1,4,5,-6,8,9,10};
        int k = 3;
        findFirstNegativeInSubArray(arr,k);
    }

    public static  void findFirstNegativeInSubArray(int[] arr, int k){
        int start =0, end =0;
        Queue<Integer> queue = new LinkedList<>();
        if(arr[start]<0)
            queue.add(arr[start]);
        while(end<arr.length){
            if(end-start+1<k){
                end++;
                if(end < arr.length && arr[end]<0)
                    queue.add(arr[end]);
            } else if(end-start+1 ==k){
                if(queue.isEmpty())
                    System.out.println("First negative element in subarray "+ start+" is " +0);
                else
                    System.out.println("First negative element in subarray "+ start+" is " +queue.peek());
                if(!queue.isEmpty() && queue.peek().equals(arr[start]))
                    queue.poll();
                start++;
                end++;
                if(end < arr.length && arr[end]<0)
                    queue.add(arr[end]);
            }
        }

    }}
