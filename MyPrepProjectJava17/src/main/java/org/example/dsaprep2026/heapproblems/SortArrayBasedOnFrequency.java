package org.example.dsaprep2026.heapproblems;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortArrayBasedOnFrequency {

    public  static void main(String[] args){
        int[] arr = {4,2,4,2,4,5,6,6,6,1,1,1,1,1,6,1,1,1,6,1};
        sortArrayByFrequency(arr);
    }

    static void sortArrayByFrequency(int[] arr){
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int j : arr){
            freqMap.put(j, freqMap.getOrDefault(j, 0)+1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>((a,b) -> b.getValue()-a.getValue());

        for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()){
            maxHeap.add(entry);
        }

        while(!maxHeap.isEmpty()){
            int i = 1;
            Map.Entry<Integer, Integer> entry = maxHeap.poll();
            while(i <= entry.getValue()){
                System.out.println(entry.getKey());
                i++;
            }
        }
    }
}
