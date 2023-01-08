package btvn_2;

import java.util.*;

public class Dec2Hex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print(convert2Hex(num));
        sc.close();
    }

    private static String convert2Hex(int num) {
        String str = "";
        char[] hex_char = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        while (num > 0) {
            int x = num % 16;
            str = hex_char[x] + str;
            num /= 16;
        }

        return str;
    }
}
