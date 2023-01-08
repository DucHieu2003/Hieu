import java.util.Scanner;

public class NumberConversion {

    public static final String alphabet = "0123456789ABCDEFGHIJKLMNOPQRSTVUWXYZ";

    public static void main(String[] args) {
        NumberConversion aNumberConversion = new NumberConversion();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number and radix: ");
        String numberStr = sc.nextLine();
        System.out.print("Enter the input radix: ");
        int inRadix = sc.nextInt();
        System.out.print("Enter the output radix: ");
        int outRadix = sc.nextInt();
        System.out.println(numberStr + " in radix " + inRadix + " is " + aNumberConversion.toRadix(numberStr, inRadix, outRadix) + " in radix " + outRadix);
    }

    public static int toInt(String in, int inRadix) {
        int result = 0;
        for (int i = in.length() - 1; i >= 0; i--) {
            int digit = Character.digit(in.charAt(i), inRadix);
            result += digit * Math.pow(inRadix, (in.length() - 1 - i));
        }
        return result;
    }

    public static String toRadix(int number, int radix) {
        String result = "";
        if (radix == 0) {
            return result;
        }

        while (number > 0) {
            result = alphabet.charAt(number % radix) + result;
            number /= radix;
        }
        return result;
    }

    public static String toRadix(String in, int inRadix, int outRadix) {
        if (inRadix == outRadix) {
            return in;
        }
        return toRadix(toInt(in, inRadix), outRadix);
    }
}
