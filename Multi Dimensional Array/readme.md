# Multidimensional Arrays

Multidimensional arrays are arrays of arrays with each element of the array holding the reference of other arrays. 
These are also known as <a href = "https://www.geeksforgeeks.org/jagged-array-in-java/">Jagged Arrays</a>. A multidimensional array is created by appending one set of square brackets ([]) per dimension. 

** one dimensional array of one dimensional arrays is called two-dimensional array.

Examples: 
```java
data_type[][] array_name = {
   {0, 1, 2, 3} ,   /*  initializers for row 0 */
   {4, 5, 6, 7} ,   /*  initializers for row 1 */
   {8, 9, 10, 11}   /*  initializers for row 2 */
};
```

```java 
int[][] intArray = new int[10][20]; //a 2D array or matrix
int[][][] intArray = new int[10][20][10]; //a 3D array
```
## Jagged Array

A jagged array is an array of arrays such that member arrays can be of different sizes, 
i.e., we can create a 2-D array but with a variable number of columns in each row. 

```java
public class multiDimensional
{
	public static void main(String args[])
	{
		// declaring and initializing 2D array
		int arr[][] = { {2,7,9},{3,6,1},{7,4,2} };

		// printing 2D array
		for (int i=0; i< 3 ; i++)
		{
			for (int j=0; j < 3 ; j++)
				System.out.print(arr[i][j] + " ");

			System.out.println();
		}
	}
}
```
