package org.example.dsaprep2026.heapproblems;

import java.util.PriorityQueue;

public class FindKLargestElementsFromArray {

    public static void main(String [] args){
        int[] arr = {1,8,6,7,5,3,4,10,2};
        int k = 4;
        findKLargestElements(arr, k);
    }
    static void findKLargestElements(int[] arr, int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int j: arr){
            minHeap.add(j);
            if(minHeap.size()>k)
                minHeap.poll();
        }
        while (!minHeap.isEmpty()){
            System.out.println(minHeap.poll());
        }
    }
}
