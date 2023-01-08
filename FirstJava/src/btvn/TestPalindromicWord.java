package btvn;
import java.util.*;
public class TestPalindromicWord {
    public static void main( String[] args ){
        Scanner sc = new Scanner(System.in);
        String Str = sc.next();
        String checkStr = Str.toUpperCase();
        int StrLen = Str.length();
        int code = 0;

        for( int fIdx = 0, bIdx = StrLen - 1; fIdx < bIdx; fIdx++, bIdx-- ){
            if( (int)checkStr.charAt(fIdx) == (int)checkStr.charAt(bIdx)){
                continue;
            }
            else {
                System.out.println( Str + " is not a palindrome");
                code++;
                break;
            }
        }
        if( code == 0 ){
            System.out.println( Str + " is a palindrome");
        }
    }
}
