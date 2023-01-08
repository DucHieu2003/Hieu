import javax.swing.plaf.PanelUI;
import java.util.Scanner;

public class Matrix {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] matrix1 = createRandomMatrix();
        int[][] matrix2 = createRandomMatrix();

        System.out.println("The matrix1 is: ");
        print(matrix1);
        System.out.println("The matrix2 is: ");
        print(matrix2);
        if (haveSameDimension(matrix1, matrix2)) {
            System.out.println("The two matrix have the same dimension");
            System.out.println("The sum matrix of the two matrix is: ");
            print(add(matrix1, matrix2));
            System.out.println("The subtract matrix of the two matrix is: ");
            print(subtract(matrix1, matrix2));
        } else {
            System.out.println("The two matrix doesn't have the same dimension");
        }

        if (matrix1[0].length == matrix2.length) {
            System.out.println("The multiply matrix of the two matrix is: ");
            print(multiply(matrix1, matrix2));
        }
    }

    public static void createRandomMatrix(int[][] matrix) {
        System.out.println("Enter the index of the matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] newMatrix = new int[rows][cols];
        createRandomMatrix(newMatrix);
        return newMatrix;
    }

    public static int[][] createRandomMatrix() {
        System.out.print("Enter the number of rows and columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = createRandomMatrix(rows, cols);
        return matrix;
    }

    public static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2) {
        if ((matrix1.length == matrix2.length) && (matrix1[0].length == matrix2[0].length)) {
            return true;
        }
        return false;
    }

    public static int[][] add(int[][] matrix1, int[][] matrix2) {
        int[][] sumMatrix = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return sumMatrix;
    }

    public static int[][] subtract(int[][] matrix1, int[][] matrix2) {
        int[][] subtractMatrix = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                subtractMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return subtractMatrix;
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int[][] mulMatrix = new int[matrix1.length][matrix2[0].length];
        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix2[0].length; col++) {
                mulMatrix[row][col] = 0;
                for (int i = 0, j = 0; i < matrix1[0].length; i++, j++) {
                    mulMatrix[row][col] += matrix1[row][i] * matrix2[j][col];
                }
            }
        }
        return mulMatrix;
    }
}
