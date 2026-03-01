package org.example.dsaprep2026.heapproblems;

import java.util.PriorityQueue;

public class SortKSortedArray {

    public static void main(String[] args){
        int[] arr = {2, 6, 3, 12, 56, 8};
        int k  = 3;
        sortKSortedArray(arr,k);
    }

    static void sortKSortedArray(int[] arr, int k) {

        int [] sortedArray = new int[arr.length];
        int index = 0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int j : arr){
            minHeap.add(j);
            if(minHeap.size()>k){
                sortedArray[index++] = minHeap.poll();
            }
        }

        while(!minHeap.isEmpty())
            sortedArray[index++] = minHeap.poll();

        for(int j: sortedArray)
            System.out.println(j);
    }
}
