package org.example.dsaprep2026.heapproblems;

import java.util.PriorityQueue;

public class FindKthLargestElementFromArray {

    public static void main(String[] args){
        int[] arr = {1,4,3,2,6,5,8,9,7};
        int k = 4;
        System.out.println(findKthLargestElement(arr, k));
    }

    static int findKthLargestElement(int[] arr, int k){
        int kthLargestElement = 0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i=0; i<arr.length; i++){
            minHeap.add(arr[i]);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
        kthLargestElement = (null == minHeap) ? -1 : minHeap.poll();
        return kthLargestElement;
    }
}
