package btvn_2;

import java.util.*;

public class PrintArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final int NUM_ITEMS;
        int[] items;
        System.out.println("Enter the number of items: ");
        NUM_ITEMS = sc.nextInt();
        items = new int[NUM_ITEMS];
        if (items.length > 0) {
            for (int i = 0; i < items.length; i++) {
                System.out.print("Enter the value of all items: ");
                items[i] = sc.nextInt();
            }
        }
        sc.close();
        System.out.println();
        for (int i = 0; i < items.length; i++) {
            if (i == 0) {
                System.out.print("[" + items[0]);
            } else {
                System.out.print("," + " " + items[i]);
                System.out.print("]");
            }
        }
    }
}
