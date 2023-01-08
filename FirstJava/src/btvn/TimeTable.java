package btvn;
import java.util.*;
public class TimeTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        int columns = scan.nextInt();

        System.out.println("Number of rows: " + rows);
        System.out.println("Number of columns: " + columns);

        for (int row = 0; row < rows+1; row++) {
            for (int col = 0; col < columns+1; col++) {

                if (row == 0 && col == 0) {
                    System.out.print("* | ");
                }
                else if (row == 0 && col != 0) {
                    System.out.printf("%4d",col);
                }
                else if (col == 0 && row != 0) {
                    System.out.print(row + " | ");
                }
                else {
                    System.out.printf("%4d",row*col);
                }
            }

            if (row == 0) {
                System.out.println("");
                for (int i = 0; i < columns+1; i++) {
                    System.out.print("----");
                }
            }

            System.out.println("");
        }
    }
}
