import java.util.Scanner;

public class FactorialRecursive {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n = sc.nextInt();
        System.out.println("factorial(" + n + ") is: " + factorial(n));
        sc.close();
    }
}
