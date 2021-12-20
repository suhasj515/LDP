package com.Streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class IntroStream {

    public static void main(String[] args){
        List<Integer> trades= Arrays.asList(300, 4, 600, 12, 20,877,900,543);

        largeTradeFilter(trades);

    }

    static boolean isEven(int n){
        if(n%2==0){
            return true;
        }else{
            return false;
        }
    }

    private static void largeTradeFilter(List<Integer> trades) {

        List<Integer> filteredTrades= trades.stream()
                .filter(i -> i>=100) //100
                .filter(i-> isEven(i))// 50
                .distinct()
                .limit(2)
                .collect(Collectors.toList());
        System.out.println(filteredTrades);

    }
}
