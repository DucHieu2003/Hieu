package btvn;
import java.util.*;
public class ExchangeCipher {
    public static void main( String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a plaintext String : ");
        String Str = sc.next().toUpperCase();
        int StrLen = Str.length();

        for( int Idx = 0; Idx < StrLen; Idx++ ){
            int code = 155 - (int)Str.charAt(Idx);
            System.out.print((char)code);
        }
    }
}
