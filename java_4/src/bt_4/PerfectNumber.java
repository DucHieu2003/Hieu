package bt_4;

import java.util.*;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so can kiem tra: ");
        int m = sc.nextInt();
        isPerfect(m);
    }

    public static void isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            System.out.println(n + " la so hoan hao");
        } else {
            System.out.println(n + " khong la so hoan hao");
        }
    }
}
