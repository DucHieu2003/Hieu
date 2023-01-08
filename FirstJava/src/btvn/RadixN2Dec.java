package btvn;
import java.util.*;
public class RadixN2Dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radix: ");
        int radixNum = Integer.parseInt(sc.nextLine());
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        if(radixNum <= 16) {
            int num = Integer.parseInt(str, radixNum);
            System.out.print("The equivalent decimal number " + str + " is: " + num);
        }
    }
}
