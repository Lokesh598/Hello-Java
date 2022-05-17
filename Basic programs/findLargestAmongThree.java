public class findLargestAmongThree {
    static int largestOfThree(int a, int b, int c) {
        // return Math.max(a, Math.max(b, c));
        return a>b?(a>c?a:c):(b>c?b:c);
    }
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        int c = 4;
        int largest = 0;
        if (a > b) {
            largest = a;
        } else if (b > c) {
            largest = b;
        } else {
            largest = c;
        }
        System.out.println("Largest among three numbers is: " + largest);
        System.out.println("Largest among three numbers is: " + largestOfThree(a, b, c));
    }    
}
