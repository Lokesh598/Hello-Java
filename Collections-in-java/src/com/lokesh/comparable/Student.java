package com.lokesh.comparable;

public class Student implements Comparable<Student>{
    private int stID;
    private String name;
    private int age;

    public Student() {}
    public Student(int stID, String name, int age) {
        this.stID = stID;
        this.name = name;
        this.age = age;
    }

    public int compareTo(Student student) {
        if(age == student.age)
            return 0;
        else if (age > student.age)
            return 1;
        else
            return -1;
    }

}
