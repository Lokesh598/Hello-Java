package com.lokesh.interfaces;

public class DiamondProblem {
    public static void main(String[] args) {
         new Toomuch().walk();
    }
}
class Toomuch implements Father, Mother {

    /*
     * When the interfaces that we are implementing has
     * the same methods signatures then we must override them.
     */
    @Override
    public void walk() {
        Father.super.walk();
        Mother.super.walk();
        System.out.println("Walking like myself");
    }
}
interface Father {
    default void walk() {
        System.out.println("Walking like father");
    }
}

interface Mother {
     default void walk() {
        System.out.println("Walking like mother");
    }
}