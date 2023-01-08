package btvn_2;

import java.util.*;

public class Contains {
    public static void main(String[] args) {
        int[] array;
        int key;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao kich thuoc cua mang: ");
        int n = sc.nextInt();
        array = new int[n];
        System.out.print("Nhap vao so can kiem tra: ");
        key = sc.nextInt();
        for (int i = 0; i < n; i++) {

            array[i] = sc.nextInt();
        }

        if (contains(array, key)) {
            System.out.println("Mang chua so can kiem tra");
        } else {
            System.out.println("Mang khong chua so can kiem tra");
        }
        sc.close();
    }

    public static boolean contains(int[] array, int key) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                count++;
            }
        }
        if (count >= 1) {
            return true;
        } else {
            return false;
        }
    }
}

