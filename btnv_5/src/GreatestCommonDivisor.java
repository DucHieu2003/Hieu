import java.util.Scanner;

public class GreatestCommonDivisor {
    public static int gcd(int a, int b) {
        if (a <= 0 || b <= 0) {
            return -1;
        }
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter tưo number a and b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a, b));
        sc.close();
    }
}
