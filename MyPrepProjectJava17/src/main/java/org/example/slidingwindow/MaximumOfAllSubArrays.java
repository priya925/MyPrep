package org.example.slidingwindow;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class MaximumOfAllSubArrays {
    public static void main(String[] args){
        int[] arr = {1,10,5,20,70,8,100};
        int k = 3;
        findMaximumOfAllSubArrays(arr, k);
    }

    public static void findMaximumOfAllSubArrays(int[] arr, int k){
        int n= arr.length;
        int start =0, end =0;
        Queue<Integer> queue = new LinkedList<>();
        int currentSubArrayMax = arr[start];
        queue.add(currentSubArrayMax);
        while(end<n){
            if(end-start+1<k){
                end++;
                if(currentSubArrayMax < arr[end]){
                    currentSubArrayMax = arr[end];
                    queue.poll();
                    queue.add(currentSubArrayMax);
                }
            } else if(end-start+1 ==k){
                if(queue.isEmpty())
                    System.out.println("maximun element in subarray "+ start+" is " +0);
                else
                    System.out.println("maximum element in subarray "+ start+" is " +queue.peek());
                end++;
                if(end<n)
                    queue.add(arr[end]);
                if(!queue.isEmpty() && arr[start] == queue.peek())
                    queue.remove();
               for(int i=0; i<queue.size();i++){
                    if(end<n && arr[end]>queue.element()){
                        queue.remove();
                    }
                }
                start++;
            }
        }
    }
}
