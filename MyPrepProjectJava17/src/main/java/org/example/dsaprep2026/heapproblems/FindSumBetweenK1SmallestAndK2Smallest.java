package org.example.dsaprep2026.heapproblems;

import java.util.Collections;
import java.util.PriorityQueue;

public class FindSumBetweenK1SmallestAndK2Smallest {

    public static void main(String[] args){
        int[] arr = {1,3,12,5,15,11};

        int k1 = 3;
        int k2 = 6;
        int k1Smallest = findKthSmallestElement(arr, k1);
        int k2Smallest = findKthSmallestElement(arr, k2);
        int sum = 0;
        for(int j : arr){
            if(j> k1Smallest && j<k2Smallest)
                sum = sum + j;
        }
        System.out.println(sum);
    }

    static int findKthSmallestElement(int[] arr, int k ){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int j : arr){
            maxHeap.add(j);
            if(maxHeap.size()>k)
                maxHeap.poll();
        }

        return maxHeap.poll();
    }
}

