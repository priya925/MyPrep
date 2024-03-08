package org.example.java17;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class StreamFacotryExample {

    public static void main(String[] args){
        List<Integer> list = List.of(1,2,5,7,4,8,9,3);
        AtomicInteger sum1 = new AtomicInteger();
        Integer sum = list.stream().mapToInt(i -> (int)i).sum();
        System.out.println(sum);
        int n = 20;
        System.out.println(getResult(0,1,n,n));
        System.out.println(0.3+0.01);
    }

    public static int getResult(int result, int start, int n, int nodeRemaining){
        for(int i=start; i<=n;i+=2){
            if(nodeRemaining>1){
                result += i;
                nodeRemaining--;
            }
        }
        if(nodeRemaining == 1)
            return result;
        return getResult(result, start+1,n,nodeRemaining);
    }
}
