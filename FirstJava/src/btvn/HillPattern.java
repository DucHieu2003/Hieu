package btvn;
import java.util.*;
public class HillPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        int k = 0;
        for (int row = 1; row <= size; row++, k = 0) {
            for (int col = 1; col <= size - row; col++) {
                System.out.print("  ");
            }
            while (k != 2 * row - 1) {
                System.out.print("# ");
                k++;
            }
            System.out.println();
        }
        System.out.println("--------------");
        for (int row = size; row >= 1; row--) {
            for (int col = 1; col <= size - row; col++) {
                System.out.print("  ");
            }
            for (int j = row; j <= 2 * row - 1; ++j) {
                System.out.print("* ");
            }
            for (int j = 0; j < row - 1; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

