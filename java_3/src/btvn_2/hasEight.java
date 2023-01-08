package btvn_2;

import java.util.*;

public class hasEight {


    public static void main(String[] args) {
        final int SENTINEL = -1;
        int number;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer (or -1 to end): ");
        number = sc.nextInt();
        while (number != SENTINEL) {
            System.out.print("Enter a positive integer (or -1 to end): ");
            number = sc.nextInt();
            if (hasEight(number)) {
                sum += number;

            }
        }
        System.out.println("The magic sum is: " + sum);
        sc.close();
    }

    public static boolean hasEight(int number) {
        int digit;

        int count = 0;
        while (number > 0) {
            digit = number % 10;

            number = number / 10;
            if (digit == 8) {
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
