package btvn_2;

import java.util.*;

public class Hex2Bin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check = false;
        String hexStr = null;
        while (!check) {
            System.out.print("Enter a hex string: ");
            hexStr = sc.nextLine();
            if (!checkHex(hexStr)) {
                System.out.println("Invalid input. Please try again!");
            } else {
                check = true;
            }
        }
        convert2Bin(hexStr);
        sc.close();
    }

    static void convert2Bin(String str) {
        String[] HEX_BITS = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
        int len = str.length();
        int i;
        for (i = 0; i < len; i++) {
            if (getIdxStr(str.charAt(i)) == -1) {
                break;
            } else {
                int idx = getIdxStr(str.charAt(i));
                System.out.print(HEX_BITS[idx] + " ");
            }
        }
    }

    static int getIdxStr(char ch) {
        char[] HEX = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        for (int k = 0; k < HEX.length; k++) {
            if (ch == HEX[k]) {
                return k;
            }
        }
        return -1;
    }

    static boolean checkHex(String str) {
        String str2 = str.toLowerCase();
        char[] arr = str2.toCharArray();
        for (char ch : arr) {
            if ((ch < '0' || ch > '9') && (ch < 'a' || ch > 'f')) {
                return false;
            }
        }
        return true;
    }
}
