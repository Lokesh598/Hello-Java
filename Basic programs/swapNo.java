// public class swapNo {
//     public static void main(String[] args) {
//         int a = 2;
//         int b = 3;
//         int temp;
//         System.out.println("values of a and b before swaping: ");
//         System.out.println("a: "+ a);
//         System.out.println("b: "+ b);
//         temp = a;
//         a = b;
//         b = temp;
//         System.out.println("values of a and b after swaping: ");
//         System.out.println("a:"+ a);
//         System.out.println("b:"+ b);
//     }
// }

// we will make seprate function for swapping

public class swapNo {

    // static void swapValues(int a, int b) {
    //     int temp;
    //     temp = a;
    //     a = b;
    //     b = temp;
    //     swapValues(a, b);
    //     System.out.println("values of a and b after swaping:");
    //     System.out.println("a: " + a);
    //     System.out.println("b: " + b);
    // }
    static void swapWithoutTemp(int a, int b) {
        a = a * b;
        b = a / b;
        a = a / b;
        System.out.println("values of a and b after swaping:");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
    public static void main(String[] args) {
        int a = 3;
        int b = 8;
        // swapValues(a, b);
        swapWithoutTemp(a, b);
    }
}