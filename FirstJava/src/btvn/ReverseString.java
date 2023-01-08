package btvn;
import java.util.*;
import  java.lang.*;
public class ReverseString {
    public static void main(String[] args) {
        String Rev = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String inStr = sc.nextLine();
        int inStrLen = inStr.length();
        for (int i = 0; i < inStrLen; i++) {
            Rev = inStr.charAt(i) + Rev;

        }

        System.out.println("The reverse of the String " + inStr + " is " + Rev);
    }
}
