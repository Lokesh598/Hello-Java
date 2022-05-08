# Array

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

intializing an array
```
var-name = new type[size];
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


