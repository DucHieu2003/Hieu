package btvn_2;

import java.util.*;

public class Search {
    public static int idx;

    public static void main(String[] args) {
        int[] arr;
        int key;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao kich thuoc cua mang: ");
        int n = sc.nextInt();
        arr = new int[n];
        System.out.print("Nhap so can kiem tra: ");
        key = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        idx = search(arr, key);
        sc.close();
    }

    public static int search(int[] array, int key) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                idx = i;
                count++;
                System.out.println(i);
            }
        }
        if (count >= 1) {
            return idx;
        } else {
            return -1;
        }
    }
}
