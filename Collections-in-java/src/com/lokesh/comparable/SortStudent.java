package com.lokesh.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortStudent {
    public static void main(String[] args) {
        List<Student> st = new ArrayList<>();
        st.add(new Student(101, "Vimal Jakhar", 23));
        st.add(new Student(102, "Dharmraj Daga", 20));
        st.add(new Student(103, "Vimal Daga", 24));


        Collections.sort(st);
        for(Student student : st){
            System.out.println(student.toString());
        }
    }
}
