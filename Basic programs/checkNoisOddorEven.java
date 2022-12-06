import java.util.Scanner;

// first method using if-else
public class checkNoisOddorEven {

    static public void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number:");
        int val = input.nextInt();

        if (val % 2 == 0) {
            // if((val | 1) > val)
            // if (val & 1 == 1)
            System.out.println("No. is even");
        }
        else {
            System.out.println("No. is odd");
        }

    }
}
