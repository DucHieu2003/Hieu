import java.util.Scanner;

public class LengthOfSequence {
    public static int length(int n) {
        if (n == 1) {
            return 1;
        }
        return length(n - 1) + (n + "").length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n = sc.nextInt();
        System.out.println("Length is: " + length(n));
        sc.close();
    }
}
