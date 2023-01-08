public class FibonacciInt {
    public static void main(String[] args) {
        int number = 0;
        while (checkFibonacci(number)) {
            System.out.println("F(" + number + ") = " + fibonacci(number));
            number++;
        }
        if (!checkFibonacci(number)) {
            System.out.println("F(" + number + ") is out of the range of int");
        }
    }

    public static long fibonacci(int n) {
        long f0 = 0;
        long f1 = 1;
        long fn = 1;
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            for (int i = 2; i <= n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
            return fn;
        }
    }

    public static boolean checkFibonacci(int n) {
        long fib1 = fibonacci(n - 1);
        long fib2 = fibonacci(n - 2);
        long maxValue = Integer.MAX_VALUE;
        return maxValue - fib1 > fib2;
    }
}
