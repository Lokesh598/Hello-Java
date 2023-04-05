package com.lokesh.lambda.exercise;
interface IntegerMath{
    int operation(int a, int b);
}
public class Calculator {
    public int operationBinary(int a, int b, IntegerMath op) {
        return op.operation(a,b);
    }
    public static void main(String[] args) {
        Calculator myApp = new Calculator();
        IntegerMath addition = ((a, b) -> a+b);
        IntegerMath substract = ((a, b) -> a-b);
        System.out.println("20+30 = "+ myApp.operationBinary(20,30, addition));
        System.out.println("4-2 = "+ myApp.operationBinary(4,2, substract));
    }
}
