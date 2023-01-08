package btvn;
import java.util.*;
public class CheckHexStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a hex String: ");
        String str = sc.nextLine();
        int n = str.length();
        if(checkHex(str)) {
            System.out.println(str + " is a hex string.");
        }   else System.out.println(str + " is NOT a hex string");
    }

    public static boolean checkHex(String str) {
        String str2 = str.toUpperCase();
        int n = str.length();
        for(int i = 0; i < n; i++) {
            char ch = str2.charAt(i);
            if(!((ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'F'))) {
                return false;
            }
        }
        return true;
    }
}

