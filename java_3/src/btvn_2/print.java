package btvn_2;

import java.util.*;

public class print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        printInt(arr);
        sc.close();
    }

    private static void printInt(int[] array) {
        int len = array.length;
        for (int i = 0; i < len; i++) {
            if (i == 0) {
                System.out.print("[" + array[i] + ",");
            } else if (i == len - 1) {
                System.out.print(" " + array[i] + "]");
            } else System.out.print(" " + array[i] + ",");
        }
    }
}
