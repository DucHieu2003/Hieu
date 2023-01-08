package btvn;
import java.util.*;
public class SquarePattern {
    public static void main(String[] args) {
        System.out.println("Nhap size: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                System.out.print("# ");
            }
            System.out.println("");

        }
    }
}
