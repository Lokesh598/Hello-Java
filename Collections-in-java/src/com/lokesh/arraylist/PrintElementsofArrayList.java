package com.lokesh.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PrintElementsofArrayList {

    public static void main(String[] args) {
        ArrayList<String> strName = new ArrayList<>();
        
        strName.add("Lokesh");
        strName.add("babalu");
        strName.add("Nitin");
        strName.add("Naveen");
        strName.add("Lokesh");

        // forEach loop
//        for (String s : strName) {
//            System.out.println(s);
//        }

        //access element in particular position
        System.out.println(strName.get(2));

        //Lambda expression
//        strName.forEach(System.out::println);

        System.out.println("\nAdd Name at 0th position");
        strName.add(0, "milaan");

        strName.forEach(System.out::println);

        System.out.println("print arraylist\n");
        System.out.println(strName);

        //Replace element at specific position
        System.out.println("\nlist after update the name:");
        strName.set(2, "Ramesh");
        System.out.println(strName);

        //Remove Element from list
        System.out.println("\nlist after remove ramesh");
        strName.remove(2);
        System.out.println(strName);

        //Reverse Elements of list
        System.out.println("\nlist after reverse the list");
        Collections.reverse(strName);
        System.out.println(strName);


    }
}
