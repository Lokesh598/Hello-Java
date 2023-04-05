package com.lokesh.streams.nestedforloop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class StudentData {

    private static final List<Student> STUDENTS = Arrays.asList(
            new Student("", 123, Arrays.asList(new Address(1, "Hanuman Nagar", "kondapur"), new Address(2, "mansarovr", "Jaipur"))),
            new Student("Ankit", 124, Arrays.asList(new Address(1, "Shilpa Park", "kondapur"))),
            new Student("Dipankar", 123, Arrays.asList(new Address(1, "Bagam Bazar", "Udaipur")))
    );

    static List<Student> getStudents() {
        return new ArrayList<>(STUDENTS);
    }


}
