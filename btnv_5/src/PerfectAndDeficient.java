import java.util.Scanner;

public class PerfectAndDeficient {
    public static boolean isPerfect(int aPosInt) {
        int sum = 0;
        for (int i = 1; i < aPosInt; i++) {
            if (aPosInt % i == 0) {
                sum += i;
            }
        }
        if (sum == aPosInt) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isDeficient(int aPosInt) {
        int sum = 0;
        for (int i = 1; i < aPosInt; i++) {
            if (aPosInt % i == 0) {
                sum += i;
            }
        }
        if (sum > aPosInt) {
            return true;
        } else {
            return false;
        }
    }

    public static void perfectNumberList(int upperNumber) {
        int countPer = 0;
        int countDef = 0;
        for (int i = 1; i <= upperNumber; i++) {
            if (isPerfect(i)) {
                System.out.print(i + " ");
                countPer++;

            }
        }
        System.out.println();
        for (int j = 0; j <= upperNumber; j++) {
            if (isDeficient(j)) {
                System.out.print(j + " ");
                countDef++;
            }
        }
        System.out.printf("\n%d perfect numbers found (%.2f%c)", countPer, (double) countPer / upperNumber * 100, '%');
        System.out.printf("\n%d perfect numbers found (%.2f%c)", countDef, (double) countDef / upperNumber * 100, '%');

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int n = sc.nextInt();
        perfectNumberList(n);
        sc.close();
    }
}
