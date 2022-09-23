package com.nisum.assignment1;
import java.util.Scanner;
/**
 * This code swap the first and last element in an array and return it
 * @author mtaqui
 *
 */
public class SwapValuesOfArray {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");

		int n = inp.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements : ");
		for (int i = 0; i < n; i++) {
			arr[i] = inp.nextInt();
		}
		int firstElement = arr[0];
		int lastElement = arr[arr.length - 1];

		arr[0] = lastElement;
		arr[arr.length - 1] = firstElement;
		
		for (int a : arr) {
			System.out.println(a);
		}
		inp.close();
	}
}
