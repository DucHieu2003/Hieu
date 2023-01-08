package bt_4;

import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen duong n: ");
        int n = sc.nextInt();
        System.out.println("Giai thua kep cua n la: " + factorial(n));
    }

    public static int factorial(int n) {
        int fac = 1;
        if (n > 0) {
            if (n % 2 == 0) {
                for (int i = 2; i <= n; i += 2) {
                    fac *= i;
                }
            } else {
                for (int i = 1; i <= n; i += 2) {
                    fac *= i;
                }
            }
            return fac;
        } else {
            return -1;
        }
    }
}
