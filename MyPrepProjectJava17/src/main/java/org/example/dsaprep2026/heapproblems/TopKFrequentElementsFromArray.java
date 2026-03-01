package org.example.dsaprep2026.heapproblems;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElementsFromArray {

    public static void main(String[] args) {
        int[] arr = {1,1,1,3,3,5,6,6,6,6,7,7,8,9,4};
        findTopKFrequentElements(arr, 3);
    }

    static void findTopKFrequentElements(int[] arr, int k) {

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for(int j : arr){
            frequencyMap.put(j, frequencyMap.getOrDefault(j, 0)+1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap =
                new PriorityQueue<>((a,b) -> a.getValue()-b.getValue());
        for(Map.Entry<Integer, Integer> j : frequencyMap.entrySet()){
            minHeap.add(j);
            if(minHeap.size()>k)
                minHeap.poll();
        }

        while(!minHeap.isEmpty()){
            System.out.println(minHeap.poll().getKey());
        }
    }
}
