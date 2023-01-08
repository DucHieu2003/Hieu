package btvn_2;

import java.util.*;

public class CopyOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao kich thuoc cua mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhap cac phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("The return array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(copyOf(arr)[i] + " ");
        }
        sc.close();
    }

    public static int[] copyOf(int[] array) {
        int[] Cp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            Cp[i] = array[i];

        }
        return Cp;
    }
}
