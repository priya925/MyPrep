package org.example.dsaprep2026.heapproblems;

import java.util.PriorityQueue;

public class FindKClosestPointsToOrigin {

    public static void main(String[] args) {
        int[][] arr = new int[4][2];
        arr[0][0] = 1;
        arr[0][1] = 3;
        arr[1][0] = -2;
        arr[1][1] = 2;
        arr[2][0] = 5;
        arr[2][1] = 8;
        arr[3][0] = 0;
        arr[3][1] = 1;
        int k = 2;
        printKClosestPointsToOrigin(arr, k);
    }

    static void printKClosestPointsToOrigin(int[][] arr, int k) {
        int originX = 0;
        int originY = 0;

        PriorityQueue<PairFor2DArray> maxHeap = new PriorityQueue<>((a, b) -> (int) (b.distance - a.distance));

        for (int i = 0; i < arr.length; i++) {
            double distanceFromOrigin = Math.sqrt(Math.pow(arr[i][0] - 0, 2) + Math.pow(arr[i][1] - 0, 2));
            PairFor2DArray p = new PairFor2DArray(arr[i][0], arr[i][1], distanceFromOrigin);
            maxHeap.add(p);
            if (maxHeap.size() > k)
                maxHeap.poll();
        }

        while (!maxHeap.isEmpty()) {
            PairFor2DArray p = maxHeap.poll();
            System.out.println("Point is x = " + p.x + " and y = " + p.y);
        }
    }
}

class PairFor2DArray {
    int x;
    int y;
    double distance;

    PairFor2DArray(int x, int y, double distance) {
        this.x = x;
        this.y = y;
        this.distance = distance;
    }
}