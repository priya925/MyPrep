package org.example.dsaprep2026.heapproblems;

import java.util.PriorityQueue;

public class FindKClosestNumberFromArray {

    public static void main(String[] args){
        int[] arr = {5,6,7,8,9};
        int k = 3;
        int x = 7;
        findKClosestNumber(arr, x, k);
    }

    static void findKClosestNumber(int[] arr, int x, int k){
        PriorityQueue<Pair> minHeap = new PriorityQueue<>((a,b) -> b.key - a.key);
        for(int j : arr) {
            minHeap.add(new Pair(Math.abs(j-x), j));
            if(minHeap.size()>k) {
                minHeap.poll();
            }
        }

        while(!minHeap.isEmpty()){
            System.out.println(minHeap.poll().value);
        }

    }
}


class Pair{
    int key;
    int value;
    Pair(int key, int value){
        this.key = key;
        this.value = value;
    }
}