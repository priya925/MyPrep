package org.example.dsaprep2026.heapproblems;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElementsFromArray {

    public static void main(String[] args) {
        int[] arr = {1,1,1,3,3,5,6,6,6,6,7,7,8,9,4};
        findTopKFrequentElements(arr, 3);
    }

    static void findTopKFrequentElements(int[] arr, int k){
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap =
                new PriorityQueue<>((a,b) -> a.getValue() - b.getValue());
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            freqMap.put(arr[i], freqMap.getOrDefault(arr[i],0)+1);
        }

        for(Map.Entry<Integer, Integer> map:freqMap.entrySet()){
            minHeap.offer(map);
            if(minHeap.size()>k){
                minHeap.poll();
            }

        }

        while(!minHeap.isEmpty()){
            System.out.println(minHeap.poll().getKey());
        }
    }
}
