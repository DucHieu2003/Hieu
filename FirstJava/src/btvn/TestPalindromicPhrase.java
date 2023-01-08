package btvn;
import java.util.*;
public class TestPalindromicPhrase {
    public static void main( String[] args ){
        Scanner sc = new Scanner(System.in);
        String Str = sc.next();
        String checkStr = Str.toUpperCase();
        int StrLen = Str.length();
        int code = 0;
        int code1;
        int code2;

        for( int fIdx = 0, bIdx = StrLen - 1; fIdx < bIdx; fIdx++, bIdx-- ){
            if( Character.isLetter(checkStr.charAt(fIdx)) ) {
                code1 = 1;
            }
            else {
                code1 = 0;
            }

            if( Character.isLetter(checkStr.charAt(bIdx)) ) {
                code2 = 1;
            }
            else {
                code2 = 0;
            }
            if( code1 == 1 && code2 ==1 ){
                if( (int)checkStr.charAt(fIdx) == (int)checkStr.charAt(bIdx)){
                    continue;
                }
                else {
                    System.out.println( Str + " is not a palindrome");
                    code++;
                    break;
                }
            }

            if( code1 == 0 && code2 == 1 ) {
                bIdx++;
                continue;
            }
            if( code1 == 1 && code2 == 0 ) {
                fIdx--;
                continue;
            }
            if( code1 == 0 && code2 == 0 ) {
                continue;
            }
        }

        if( code == 0 ){
            System.out.println( Str + " is a palindrome");
        }
    }
}
