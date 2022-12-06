

public class exception {
    public static void main(String[] args) {
        try {
            int arr[] = {1,2,3};
            System.out.println(arr[1]);
        }
        catch (Exception e) {
            System.out.println("Something went wrong");
        } finally {
            System.out.println("try catch block finished");
        }
    }
}
