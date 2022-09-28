package com.lokesh.interfaces;



public class InterfaceTest implements B{

    public static void main(String[] args) {
        new InterfaceTest().go();
    }

    public void go() {
        concreteMethod();
        A.staticMethod();
        B.staticMethod();
    }

    @Override
    public void abstractMethod() {
        System.out.println("In class implemented method");
    }

    @Override
    public void concreteMethod() {
        B.super.concreteMethod();
    }
}

interface A {
    void abstractMethod();

    default void concreteMethod() {
        System.out.println("In interface A concrete method");
    }
    static void staticMethod() {
        System.out.println("in interface A concrete method");
    }
}
interface B extends A {
    default void concreteMethod() {
        System.out.println("In interface B concrete method");
    }

    static void staticMethod() {
        System.out.println("In interface B static method");
    }
}
interface C {
    default void concreteMethod() {
        System.out.println("In interface C concrete method");
    }
}
