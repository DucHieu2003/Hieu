package btvn;
import java.util.*;
public class CountVowelsDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String Str = sc.nextLine();
        char a1 = 'a';
        char a2 = 'e';
        char a3 = 'i';
        char a4 = 'o';
        char a5 = 'u';
        int count1 = 0;
        int count2 = 0;
        String Str1 = Str.toLowerCase();
        for (int i = 0; i < Str.length(); i++) {
            if (Character.isDigit(Str.charAt(i))) {
                count1+=1;
            }
            else if (Str1.charAt(i) == a1 || Str1.charAt(i) == a2 || Str1.charAt(i) == a3 || Str1.charAt(i) == a4 || Str1.charAt(i) == a5) {
                count2+=1;
            }

        }
        double digits = (double) count1 / Str.length();
        double vowels = (double) count2 / Str.length();
        System.out.printf("Number of vowels: " + count2 + " " + "(%f%%)", vowels);
        System.out.println();
        System.out.printf("Number of digits: " + count1 + " " + "(%f%%)", digits);
    }
}
