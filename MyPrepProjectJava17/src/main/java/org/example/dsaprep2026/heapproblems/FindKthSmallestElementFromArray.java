package org.example.dsaprep2026.heapproblems;

import java.util.Collections;
import java.util.PriorityQueue;

public class FindKthSmallestElementFromArray {

    public static void main(String[] args){
        int[] arr = {1,8,9,4,5,6,2,3};
        int k = 4;
        System.out.println(findKthSmallestElement(arr,k));
    }


    static int findKthSmallestElement(int[] arr, int k){
        int kthSmallestElement = 0;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int j : arr) {
            maxHeap.add(j);
            if (maxHeap.size() > k)
                maxHeap.poll();
        }
        kthSmallestElement = null!=maxHeap? maxHeap.poll() : -1;
        return kthSmallestElement;
    }
}
