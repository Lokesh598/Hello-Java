package com.lokesh.treeset;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetInJava {
    public static void main(String[] args) {

        /**
         * @Author Lokesh singh
         * <p>
         * TreeSet ts = new TreeSet();
         * Set syncSet = Collections.synchronizedSet(ts);
         */
        Set<String> tset = new TreeSet<>();

        tset.add("Mayukh");
        tset.add("Nikhil");
        tset.add("Lokesh");
        tset.add("Mohit");
        tset.add("Ravish");

        tset.forEach(System.out::println);

        String[] str = tset.toArray(size->new String[size]);// lambda expression
        str = tset.toArray(size -> new String[size*10]);
        System.out.println(tset.toString());
        System.out.println("treeset sort the data ascending order\n because its internal mechanism is sbst");
    }
}
