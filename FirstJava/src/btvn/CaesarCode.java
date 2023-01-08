package btvn;
import java.util.*;
public class CaesarCode {
    public static void main(String[] args) {
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String inStr = sc.nextLine().toLowerCase();
        int inStrLen = inStr.length();
        char charStr;

        System.out.print("Caser's Code is: ");
        for (int idStr = 0; idStr < inStrLen; idStr++) {

            charStr = inStr.charAt(idStr);
            int idAlpha = alpha.indexOf(charStr);
            if (idAlpha <= 22) {
                System.out.print(alpha.charAt(idAlpha + 3));
            } else {
                System.out.print(alpha.charAt(idAlpha + 3 - 26));
            }
        }
    }

}
