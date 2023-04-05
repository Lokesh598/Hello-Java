package com.lokesh.streams.nestedforloop;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class NestedForLoop {
    int gridSize = 3;
    int count = 0;
    private List<Integer> createGrid() {
        List<Integer> spaces = new ArrayList<>();
        for(int i = 0; i < gridSize; i++) {
            spaces.add(count++);
        }
        return spaces;
    }

    private List<Integer> createGridStream() {
        Stream<Integer> infiniteStream = Stream.iterate(0, i->i+1);

        List<Integer> spaces = infiniteStream.limit(gridSize).collect(Collectors.toList());
        return spaces;
    }
    //nested for loop

    public static void main(String[] args) {
        NestedForLoop a = new NestedForLoop();
//        Student st = new Student();
        System.out.println(a.createGrid());
        System.out.println("------------------------------");
        System.out.println("    Simplified by Stream");
        System.out.println("------------------------------");
        System.out.println(a.createGridStream());

        System.out.println("------------------------------");
        System.out.println("    Nested for loop");
        System.out.println("------------------------------");
//        System.out.println(createStudent());

        System.out.println("------------------------------");
        System.out.println("    Streams");
        System.out.println("------------------------------");

            List<Student> students = StudentData.getStudents();
            students.stream().forEach(System.out::println);
        System.out.println("------------------------------");
        System.out.println("    Using For loop");
        System.out.println("------------------------------");

//        List<Address> addresses = new ArrayList<>();
//        addresses.add(new Address(12, "lokesh", "jaipur"));



//        studentList.stream().
//                filter(student -> student.getStudentAddress().stream().filter(address -> address.getCity()))


//            for(Student student: StudentData.getStudents()) {
//                for(Address address: student.getStudentAddress()) {
//                    if(address.getCity() == "kondapur")
//                        System.out.println(student.getName());
//                }
//            }

        System.out.println(
                Arrays.asList(Arrays.asList(1,2,3,4,5),Arrays.asList(6,7,8,9,10)).stream()
                        .flatMap(integers -> integers.stream())
                        .collect(Collectors.toList()));

        System.out.println("--------------------------------------------------------------");
        System.out.println("    print students names who belongs kondapur Using streams");
        System.out.println("--------------------------------------------------------------");


        StudentData.getStudents().stream()
                .filter(student -> student.getStudentAddress().stream()
                        .map(address -> {
                            try {
                                return address.getCity();
                            } catch (Exception e) {
                                throw new RuntimeException(e);
                            }
                        })
                        .collect(Collectors.toList())
                        .contains("kondapur"))
                .map(student -> {
                    try {
                        return student.getName();
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                })
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
