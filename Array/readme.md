# Array

In java arrays are obkects.
1. Arrays in Java work differently than they do in C/C++.

A Java array variable can also be declared like other variables with [] after the data type.

The variables in the array are ordered, and each has an index beginning from 0.

Java array can be also be used as a static field, a local variable, or a method parameter.

The size of an array must be specified by int or short value and not long.

The direct superclass of an array type is Object.

Every array type implements the interfaces Cloneable and java.io.Serializable.


## Creating, initializing and accessing 

general form of one-dimension array declaration is
```
type var-name[];
or
type[] var-name[];

example:
int myArray[];
```

#### intializing an array
In Single Line 
```
var-name = new type[size];

int [] arr= {1,2,3,4,5,6,7};
```

Using loop

An array can be initialized using a loop.
```java
import java.io.*;
import java.util.*;
public class Example {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner Scan = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Scan.nextInt();
        }
    }
}
Input: 2 3 4 5 6
```

example:
```
int myArray[];
myArray = new int[20];
```
or 
```
int[] myArray = new int[20]; // combining both statement in one
```

The elements in the array allocated by new will automatically be initialized to zero (for numeric types), false (for boolean), or null (for reference types).
Obtaining an array is a two-step process. First, you must declare a variable of the desired array type. Second, you must allocate the memory to hold the array, using new, and assign it to the array variable. Thus, in Java, all arrays are dynamically allocated.

## Array Literals
In a situation where the size of the array and variables of the array are already known, array literals can be used. 

```java
int[] intArray = new int[]{1,2,3,4,5,6};
```
- The length of this array determines the length of the created array.
- There is no need to write the new int[] part in the latest versions of Java.

## Accessing array using for loop

```java
for(int i = 0; i<intArray.length; i++) {
  System.out.println("Element at index: " + i + arr[i]);
}
```

using FOR-EACH loop
This is a special type of loop to access array elements of the array. But this loop can be used only to traverse an array, and nothing can be changed in the array using this loop.

```java
import java.io.*;
import java.util.*;
public class Solutions {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        for (int i: arr) {
            System.out.print(i + " ");
        }
    }
}
Output: 
10 20 30 40 50
```

## Array of Object

An array of objects is created like an array of primitive type data items in the following way. 
```java
Student[] arr = new int[7]; // student is user defined class
```

```java
// Java program to illustrate creating
// an array of objects

class Student
{
	public int roll_no;
	public String name;
	Student(int roll_no, String name)
	{
		this.roll_no = roll_no;
		this.name = name;
	}
}

// Elements of the array are objects of a class Student.
public class GFG
{
	public static void main (String[] args)
	{
		// declares an Array of integers.
		Student[] arr;

		// allocating memory for 5 objects of type Student.
		arr = new Student[5];

		// initialize the first elements of the array
		arr[0] = new Student(1,"aman");

		// initialize the second elements of the array
		arr[1] = new Student(2,"vaibhav");

		// so on...
		arr[2] = new Student(3,"shikar");
		arr[3] = new Student(4,"dharmesh");
		arr[4] = new Student(5,"mohit");

		// accessing the elements of the specified array
		for (int i = 0; i < arr.length; i++)
			System.out.println("Element at " + i + " : " +
						arr[i].roll_no +" "+ arr[i].name);
	}
}
```

### What happens if we try to access elements outside the array size?
JVM throws ArrayIndexOutOfBoundsException to indicate that the array has been accessed with an illegal index. 

```java
package javaLearning;
public class printArray
{
	public static void main (String[] args)
	{
		int[] arr = new int[2];
		arr[0] = 10;
		arr[1] = 20;

		for (int i = 0; i <= arr.length; i++)
			System.out.println(arr[i]);
	}
}

error: 10
20
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
	at javaLearning/javaLearning.printArray.main(printArray.java:11)
```
