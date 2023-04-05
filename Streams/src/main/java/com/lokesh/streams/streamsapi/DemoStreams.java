package com.lokesh.streams.streamsapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class DemoStreams {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3,1,6,4,5);

        //Stream<Integer> data = nums.stream();
//        Stream<Integer> sortedData = data.sorted();
//        sortedData.forEach(n-> System.out.println(n));

        // now we want to double the values so how we can do this
        //todo: 1. we can do this task using external loop
//        for(int n = nums) {
//            System.out.println(n*2);
//        }
        //todo: 2. using stream
        //Stream<Integer> mappedData =  data.map(n->n*2);
        //mappedData.forEach(n-> System.out.println(n));

        //todo: lets do complete task in single line ..lets do that
//        nums.stream().sorted().map(n->n*2).forEach(n-> System.out.println(n));
        //todo: lets make it more readable
        nums.stream()
                .sorted()
                .map(n->n*2)
                .forEach(n-> System.out.println(n));

        //todo: lets do filter task on given list
        //?
        System.out.println("filter in stream");

        Predicate<Integer> fil = new Predicate<Integer>() {
            @Override
            public boolean test(Integer n) {
                return n%2 == 0;
            }
        };

        nums.stream()
                //.filter(fil)
                .filter(n->n%2 == 0)
                .sorted()
                .map(n->n*2)
                .forEach(n-> System.out.println(n));

        int sum = nums.stream()
                .filter(n->n%2 == 0)
                .sorted()
                .map(n->n*2)
                .reduce(0, (c,e)-> c+e);
        System.out.println("sum of " + sum);
    }
}
