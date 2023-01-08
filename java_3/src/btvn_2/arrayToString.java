package btvn_2;

import java.util.*;

public class arrayToString {
    public static int num;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check = false;
        while (!check) {
            System.out.print("Enter a positive number: ");
            num = sc.nextInt();
            if (num > 0) {
                check = true;
            } else System.out.println("Invalid input, please try again.");
        }
        int[] arr = new int[num];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(arrayToString(arr));
        sc.close();
    }

    public static String arrayToString(int[] arr) {
        StringBuilder result = new StringBuilder();
        if (arr.length == 0) {
            result = new StringBuilder("[]");
        } else {
            System.out.print("[");
            for (int i = 0; i < arr.length; i++) {
                if (i == arr.length - 1) {
                    result.append(arr[i]).append("]");
                } else {
                    result.append(arr[i]).append(", ");
                }
            }
        }
        return result.toString();
    }
}
