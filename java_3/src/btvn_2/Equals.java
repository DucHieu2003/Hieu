package btvn_2;

import java.util.*;

public class Equals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao kich thuoc cua mang thu nhat: ");
        int n = sc.nextInt();
        System.out.print("Nhap vao kich thuoc cua mang thu hai: ");
        int m = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        System.out.println("Nhap cac phan tu cua mang thu nhat:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Nhap cac phan tu cua mang thu hai:");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        if (equals(arr1, arr2)) {
            System.out.println("Hai mang bang nhau");
        } else {
            System.out.println("Hai mang khong bang nhau");
        }
        sc.close();
    }

    public static boolean equals(int[] array1, int[] array2) {
        int count = 0;
        if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] == array2[i]) {
                    count++;
                }
            }
        }
        if (count == array1.length) {
            return true;
        } else {
            return false;
        }
    }
}
