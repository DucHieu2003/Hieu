package btvn_2;

import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao kich thuoc cua mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhap vao cac phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Mang truoc khi dao nguoc la: " + Arrays.toString(arr));
        reverse(arr);
        sc.close();
    }

    public static void reverse(int[] array) {
        for (int fIdx = 0, bIdx = array.length - 1; fIdx < bIdx; fIdx++, bIdx--) {
            int temp = array[fIdx];
            array[fIdx] = array[bIdx];
            array[bIdx] = temp;
        }
        System.out.print("Mang sau khi dao la: " + Arrays.toString(array));
    }
}
