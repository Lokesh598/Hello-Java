public class findFactorial {
    static public int printFactorial(int n) {
        if(n==0) 
            return 1;
        
        return n * printFactorial(n-1);
    }
    static public int printFactorialIterative(int n) {
        int res = 1;
        for(int i = 2; i <= n; i++ ) {
            res = res*i;
        }
        return res;
    }
    public static void main(String[] args) {
        int factVal = 6;
        int x = printFactorial(factVal);
        System.out.println("factorial of "+ factVal +" is "+ x);
        System.out.println(printFactorialIterative(factVal));
    }
}
