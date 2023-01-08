package bt_4;

import java.util.*;

public class Counter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao kich thuoc cua mang: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        System.out.print("Nhap cac phan tu: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = -1;
        }
        count(a, b);
    }

    public static void count(int[] array1, int[] array2) {
        for (int i = 0; i < array1.length; i++) {
            int dem = 1;
            for (int j = i + 1; j < array2.length; j++) {
                if (array1[i] == array1[j]) {
                    dem++;
                    array2[j] = 0;
                }
                if (array2[i] != 0) {
                    array2[i] = dem;

                }
            }
        }
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] > 0) {
                System.out.println(array1[i] + " xuat hien " + array2[i] + " lan");
            }
        }
    }
}
