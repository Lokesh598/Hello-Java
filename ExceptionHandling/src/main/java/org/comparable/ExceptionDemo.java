package org.comparable;

public class ExceptionDemo {
    public static void main(String[] args) {
        int i = 9;
        int j = 0;
        int k = i/j;
        int arr[] = {1,2,3,4};

        try {
            System.out.println(k);
            System.out.println(arr[5]);
        } catch(ArithmeticException e) {
            System.out.println("check denominator again");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("we can print within size of the array");
        } catch (Exception e) {
            System.out.println("something done wrong way!!");
        }
    }
}
