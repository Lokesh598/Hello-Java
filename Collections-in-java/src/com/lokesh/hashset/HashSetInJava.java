package com.lokesh.hashset;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetInJava {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(2);
        set.add(3);
        boolean b1 = set.add(2);
        set.add(4);
        set.add(1);

        Set<String> st = new HashSet<>();
        st.add("c");
        st.add("a");
        st.add("b");
        st.forEach((n)-> System.out.println(n));
        set.forEach(System.out::println);
        System.out.println("See hashset also sort the data automatically\n");
        System.out.println(set);
        System.out.println("b1 = "+b1 + "duplicate value");

        System.out.println("\nsize of set" + set.size());

        set.remove(1);
        System.out.println(set);

        System.out.println(set.isEmpty());

        TreeSet<Integer> tset = new TreeSet<Integer>(set);

        System.out.println(tset+ " This is treeset");

        tset.ceiling(2);
    }
}
