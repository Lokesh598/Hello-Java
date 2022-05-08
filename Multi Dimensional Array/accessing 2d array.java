import java.io.*;
import java.util.*;


public class solution {
    public static void main(String[] args) {

                int[][] arr = {{2, 5},
                               {4, 0},
                               {9, 1}};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j] + " ");
            }


        }
    }
}


// Output:
// arr[0][0] = 2
// arr[0][1] = 5
// arr[1][0] = 4
// arr[1][1] = 0
// arr[2][0] = 9
// arr[2][1] = 1
