package com.lokesh.streams.streammain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streammain01 {
    public static void main(String[] args) {
        //todo 1: create a list and filter all even numbers from list

        List<Integer> list1 = Arrays.asList(2, 23, 24,65,3,28);
        //todo 2: without stream
        List<Integer> listOfEvens = new ArrayList<>();
        System.out.println("list without streams");
        for (Integer i : list1) {
            if(i%2==0) {
                listOfEvens.add(i);
            }
        }
        System.out.println(list1);
        System.out.println("list of even");
        listOfEvens.forEach(ele-> System.out.println(ele));

        //todo 3: with stream
        //Stream<Integer> stream = list1.stream();
        List<Integer> streamList = list1.stream().filter(integer -> integer%2 ==0).collect(Collectors.toList());
        System.out.println(streamList);


    }
}
