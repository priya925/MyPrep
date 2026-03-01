package org.example.dsaprep2026.heapproblems;

import java.util.Collections;
import java.util.PriorityQueue;

public class FindKSmallestElementsFromArray {

    public static void main(String[] args){
        int[] arr = {1,7,8,9,2,3,4,6};
        int k = 4;
        findKSmallestElements(arr, k);
    }

    static void findKSmallestElements(int[] arr, int k){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int j : arr){
            maxHeap.add(j);
            if(maxHeap.size()>k)
                maxHeap.poll();
        }

        while(!maxHeap.isEmpty())
            System.out.println(maxHeap.poll());
    }
}
