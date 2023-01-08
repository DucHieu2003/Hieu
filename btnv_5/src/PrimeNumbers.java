import java.util.Scanner;

public class PrimeNumbers {
    public static boolean isPrime(int n) {
        int count = 0;
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.print("Please enter the upper bound: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                count++;
            }
        }
        System.out.printf("\n%d perfect numbers found (%.2f%c)", count, (double) count / n * 100, '%');
        sc.close();
    }
}
