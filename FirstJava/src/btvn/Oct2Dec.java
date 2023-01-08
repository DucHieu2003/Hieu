package btvn;
import java.util.*;
public class Oct2Dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Octal number: ");
        String str = sc.nextLine();
        System.out.println(convertDec(str));
    }
    private static int convertDec(String str) {
        int num = Integer.parseInt(str,8);
        return num;
    }
}
