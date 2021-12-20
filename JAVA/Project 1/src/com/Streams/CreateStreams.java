package com.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreams {

    public void emptyStream(){
        Stream<String> empty= Stream.empty();
        empty.forEach(System.out::println);
    }
    public void valueStream(){
        Stream<String> value= Stream.of("name","age","bday");
        System.out.println(value.count());
    }
    public void collectionStream(){
        List<String> value= Arrays.asList("apple","banana","fruit");
        System.out.println(value);
    }

    public static void main(String[] args){
        new CreateStreams().emptyStream();
        new CreateStreams().valueStream();
        new CreateStreams().collectionStream();

    }
}
