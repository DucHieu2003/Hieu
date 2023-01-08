import java.util.Scanner;

public class GCD {
    public static int gdc(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gdc(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two number a, b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("GCD is: " + gdc(a, b));
        sc.close();
    }
}
