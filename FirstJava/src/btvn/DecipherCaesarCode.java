package btvn;
import java.util.*;
public class DecipherCaesarCode {
    public static void main( String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a ciphertext String : ");
        String Str = sc.next().toUpperCase();
        int StrLen = Str.length();
        System.out.println("The plaintext String is : ");
        for( int Idx = 0; Idx < StrLen; Idx++ ){
            if( (int)Str.charAt(Idx) > 67 ){
                int code = (int)Str.charAt(Idx) - 3;
                System.out.print((char)code);
            }
            else {
                int code = (int)Str.charAt(Idx) + 23;
                System.out.print((char)code);
            }
        }
    }
}
