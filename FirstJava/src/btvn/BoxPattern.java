package btvn;
import java.util.*;
public class BoxPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || row == size || col == size || col == 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("---------");
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == 1 || row == size || row == col) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("----------");
        for (int row = 1; row <= size; row++) {
            for (int col = size; col >= 1; col--) {
                if (row == col || row == 1 || row == size) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("-------");
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row == size || row == 1 || col == row || )
            }
        }
    }
}
