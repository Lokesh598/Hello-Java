package com.lokesh.streams.nestedforloop;

import java.util.List;

public class Student {

    private String name;
    private long ROLL_No;

    private List<Address> studentAddress;


    public Student(String name, long ROLL_No, List<Address> studentAddress) {
        this.name = name;
        this.ROLL_No = ROLL_No;
        this.studentAddress = studentAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getROLL_No() {
        return ROLL_No;
    }

    public void setROLL_No(long ROLL_No) {
        this.ROLL_No = ROLL_No;
    }

    public List<Address> getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(List<Address> studentAddress) {
        this.studentAddress = studentAddress;
    }
    //    @Override
//    public String toString() {
//        return String.format(name, ROLL_No, studentAddress);
//    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ROLL_No=" + ROLL_No +
                ", studentAddress=" + studentAddress +
                '}';
    }
}
