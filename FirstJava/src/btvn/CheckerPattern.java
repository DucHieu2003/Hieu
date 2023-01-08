package btvn;
import java.util.*;
public class CheckerPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap size: ");
        int size = sc.nextInt();
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if(row % 2 == 0) {
                    System.out.print(" #");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }
}
