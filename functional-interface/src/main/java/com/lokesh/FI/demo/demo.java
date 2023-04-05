package com.lokesh.FI.demo;

//lets create an interface
@FunctionalInterface
interface A {
    //declare an abstract method
    void show();
    // this is a method is already define in the object class. so it will allow this method.
    // every class in java extends an object class.
    String toString();
}
class B extends Object implements A{
    public void show() {
        System.out.println("hiii lokesh");
    }
}
public class demo {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
    }
}
