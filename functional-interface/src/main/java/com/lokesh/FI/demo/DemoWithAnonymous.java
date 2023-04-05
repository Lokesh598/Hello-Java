package com.lokesh.FI.demo;


interface C{
    void show();
}
public class DemoWithAnonymous {
    public static void main(String[] args) {
        C obj = new C() {//this is syntax we are using till Java 7
            //here we defined an anonymous class
            public void show() {
                System.out.println("hi from anonymous class");
            }
        };
        obj.show();
    }
}
