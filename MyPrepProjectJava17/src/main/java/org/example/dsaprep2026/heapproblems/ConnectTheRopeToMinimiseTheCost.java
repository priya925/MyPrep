package org.example.dsaprep2026.heapproblems;

import java.util.PriorityQueue;

public class ConnectTheRopeToMinimiseTheCost {

    /**
     * after connecting 2 ropes of 1, 2, we get 4 ropes (1+2)=3,3,4,5 and the cost is 3
     * after that connect 3 and 3 then we get 3 ropes 6, 4, 5 and the cost is 3+6 =9
     * then connect 4,5 so we get 2 ropes 6, 9 and the cost is 9+9 = 18
     * then connect 6,9 and, we get 15 as rope and cost is 18+15 = 33
     * so this is the problem that we need to get minimised cost
     * Solution is at any point of time we need to connect two minimum length ropes.
     */

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};

        getMinimizedCostAfterConnectingTheRope(arr);

    }

    static void getMinimizedCostAfterConnectingTheRope(int[] arr){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int minimizedCost = 0;
        for(int j : arr){
            minHeap.add(j);
        }

        while(!minHeap.isEmpty()){
            int i = minHeap.poll();
            int j = minHeap.poll();
            int newRopeLength = i+j;
            if(!minHeap.isEmpty())
                minHeap.add(newRopeLength);
            minimizedCost = minimizedCost+newRopeLength;
        }

        System.out.println(minimizedCost);
    }
}
