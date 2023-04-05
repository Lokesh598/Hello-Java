package com.lokesh.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ListInJava {
    public static void main(String[] args) {
        List strlist = new ArrayList<>();

        //add at last
        strlist.add(0,"0");
        strlist.add(1,"1");
        //replace
        strlist.set(1, "3");
        strlist.add(2,"2");

        strlist.remove(0);
        strlist.forEach(System.out::println);
    }
}