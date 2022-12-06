import java.util.Scanner;

public class readInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int val = input.nextInt();
        System.out.println(val);
    }
}
