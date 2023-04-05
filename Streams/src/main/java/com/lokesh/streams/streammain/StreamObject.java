package com.lokesh.streams.streammain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        //todo : create streams

        //1 blank stream
        Stream<Object> emptyStream = Stream.empty();
        emptyStream.forEach(e-> System.out.println(e));

        String name[] = {"Taqui", "dev", "Tiger", "Lokesh"};
        //2
        Stream<String> stream1 = Stream.of(name);
//        stream1.forEach(e-> System.out.println(e));

        Stream<Object> objectStream =Stream.builder().build();

        List<String> newList = stream1.filter(e->e.startsWith("T"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(newList);

        List<Integer> list = Arrays.asList(1,3,4,2,0, 12, 9);
        List<Integer> evenItem = list.stream().filter(i -> i%3 == 0 && i!=0)
                .sorted()
                .map(i->i*2)
                .peek(e-> System.out.println("filter data: "+ e))
                .collect(Collectors.toList());
        System.out.println(evenItem);

        int sum = list.stream().reduce(4, (ele1, ele2)->ele2+ele1);
        System.out.println(sum);
    }
}
