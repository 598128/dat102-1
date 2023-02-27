public class fibonacci {

    public static void main(String[] args) {
        int n = 40;
        System.out.println(fib(n));
        System.out.print(fibonacci(n));

    }

    public static int fib(int n){
        if(n==0){
            return 0;
        } else if(n==1) {
            return 1;
        } else {
            return fib(n-1)+fib(n-2);
        }
    }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int fib = 1;
        int prevFib = 1;

        for (int i = 2; i < n; i++) {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }

        return fib;
    }
}
