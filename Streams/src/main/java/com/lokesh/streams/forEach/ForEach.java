package com.lokesh.streams.forEach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEach {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,5,3,2,1);

        //lets see the forEach loop in more expressive
        Consumer<Integer> cons = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };
        nums.forEach(cons);
        System.out.println(" ");
        //foreach loop is use lambda expression
        nums.forEach(n -> System.out.println(n));
        System.out.println("break");
        nums.forEach(System.out::println);
        System.out.println("break");
        //simple for loop
        //it will print the values of i indexed
        for(int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }
        //enhanced for loop
        //todo: itrator jump over the values not index
        for(int it : nums) {
            System.out.print(it);
        }
        // above both loop are external for loop which are introduced earlier of java 8
    }
}
