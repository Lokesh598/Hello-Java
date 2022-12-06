long long int factorial(int N){
       //code here
      long long int result = 1;
       for(int i = 1; i<=N;i++)
       {
           result*=i;
       }
       return result;
}

class HelloWorld {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
        
       //code here
        int result = 1;
       for(int i = 1; i<=5;i++)
       {
           result*=i;
       }
       System.out.println(result);

    }
}

//recursive solution for factorial
class HelloWorld {
    static int fact(int n)
    {   
        if(n==0)
            return 1;
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int n = 5;
    System.out.println(fact(n));
    }
}

