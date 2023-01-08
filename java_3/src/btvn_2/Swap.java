package btvn_2;

import java.util.*;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao kich thuoc mang thu nhat: ");
        int n = sc.nextInt();
        System.out.print("Nhap vao kich thuoc mang thu hai: ");
        int m = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        System.out.println("Nhap cac phan tu mang thu nhat: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Nhap cac phan tu mang thu hai: ");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        if (swap(arr1, arr2)) {
            System.out.println("Mang thu 1 duoc hoan doi thanh cong va mang sau khi hoan doi co dang" + Arrays.toString(arr1));
            System.out.println("Mang thu 2 duoc hoan doi thanh cong va mang sau khi hoan doi co dang" + Arrays.toString(arr2));
        }
        sc.close();
    }

    public static boolean swap(int[] array1, int[] array2) {
        if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {
                int temp = array1[i];
                array1[i] = array2[i];
                array2[i] = temp;
            }
            return true;
        } else {
            return false;
        }
    }
}
