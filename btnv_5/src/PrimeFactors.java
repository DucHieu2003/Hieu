import java.util.Scanner;

public class PrimeFactors {
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
    public static boolean isProductOfPrimeFactors(int aPosInt) {
        int product = 1;
        for (int i = 2; i < aPosInt; i++) {
            if (aPosInt % i == 0 && isPrime(i)) {
                product *= i;
            }
        }
        if (product == aPosInt) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.print("Enter the upper bound: ");
        int n = sc.nextInt();
        System.out.println("These numbers are equal to the product of prime factors: ");
        for (int i = 2; i < n; i++) {
            if (isProductOfPrimeFactors(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.printf("\n%d perfect numbers found (%.2f%c)", count, (double) count / n * 100, '%');
        sc.close();
    }
}
