package com.Streams;

import java.util.Arrays;
import java.util.List;

public class LazyEgarMethods {

    List<Integer> trades= Arrays.asList(300, 4, 600, 12, 20,877,900,543);

    static boolean isEven(int n){
        if(n%2==0){
            return true;
        }else{
            return false;
        }
    }
    void lazyMethod(){
            trades.stream()
                    .filter( i -> {
                        System.out.println("lazy method doesn't invoid without terminator method");
                        return isEven(i);
                    })
                    .limit(2);                    ;
    }
    void egarMethod(){
        trades.stream()
                .filter(i -> {
                    System.out.println("egar method invokes because of terminator method");
                    return isEven(i);
                })
                .limit(2)
                .count();

    }

    public static void main(String[] args){
        LazyEgarMethods lz=new LazyEgarMethods();
        lz.egarMethod();
        lz.lazyMethod();
    }
}
