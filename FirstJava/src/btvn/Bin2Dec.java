package btvn;
import java.util.*;

public class Bin2Dec {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a binary int:");
        int binary=sc.nextInt();
        int decimal = 0;
        int n = 0;
        while(true){
            if(binary == 0){
                break;
            } else {
                int temp = binary%10;
                decimal += temp*Math.pow(2, n);
                binary = binary/10;
                n++;
            }
        }
        System.out.print("that int in decimal: "+decimal);
    }
}
