package btvn_2;

import java.util.*;

public class CopyOfWithLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int leng = sc.nextInt();
        System.out.print("Enter the new  length: ");
        int newLength = sc.nextInt();

        int[] array = new int[leng];
        inputArray(array, sc);
        sc.close();

        System.out.print("The return array is: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(copyOfWithLength(array, newLength)[i] + " ");
        }
    }

    public static int[] copyOfWithLength(int[] array, int newLength) {
        if (array.length > newLength) {
            int[] CoArray = new int[newLength];
            for (int i = 0; i < newLength; i++) {
                CoArray[i] = array[i];
            }
            return CoArray;
        } else if (array.length < newLength) {
            int[] CoArray = new int[newLength];
            for (int i = 0; i < array.length; i++) {
                CoArray[i] = array[i];
            }
            for (int i = array.length; i < newLength; i++) {
                CoArray[i] = 0;
            }
            return CoArray;
        } else {
            int[] CoArray = new int[newLength];
            for (int i = 0; i < array.length; i++) {
                CoArray[i] = array[i];
            }
            return CoArray;
        }
    }

    public static void inputArray(int[] array, Scanner sc) {
        System.out.print("Enter the value of index: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
    }


}
