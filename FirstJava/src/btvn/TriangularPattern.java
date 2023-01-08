package btvn;
import java.util.*;
public class TriangularPattern {
    public static void main(String[] args) {
        System.out.println("Enter the size : ");

        Scanner sc = new Scanner(System.in);
        int square = sc.nextInt();

        for (int row = 1; row <= square; row++) {
            for (int col = 1; col <= square; col++) {
                if( row + col >= square + 1 ){
                    System.out.print("# ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("------------");
        for (int row = 1; row <= square; row++) {
            for (int col = 1; col <= square; col++) {
                if( row <= col ){
                    System.out.print("# ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
