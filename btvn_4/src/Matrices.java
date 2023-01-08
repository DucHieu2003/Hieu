import java.util.Random;

public class Matrices {
    public static void createRandomMatrix(int[][] matrix) {
        if (matrix == null) {
            return;
        }
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = random.nextInt(100);
            }
        }
    }

    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        createRandomMatrix(matrix);
        return matrix;
    }

    public static void print(int[][] matrix) {
        if (matrix == null) {
            System.out.println("null");
            return;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.printf("%10d", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void print(double[][] matrix) {
        if (matrix == null) {
            System.out.println("null");
            return;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.printf("%10.2f ", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2) {
        if (matrix1 == null || matrix2 == null) {
            return false;
        }
        return matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length;
    }

    public static boolean haveSameDimension(double[][] matrix1, double[][] matrix2) {
        if (matrix1 == null || matrix2 == null) {
            return false;
        }
        return matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length;
    }

    public static int[][] add(int[][] matrix1, int[][] matrix2) {
        if (matrix1 == null || matrix2 == null) {
            return null;
        }
        if (!haveSameDimension(matrix1, matrix2)) {
            return null;
        }
        int[][] matrix = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return matrix;
    }

    public static double[][] add(double[][] matrix1, double[][] matrix2) {
        if (matrix1 == null || matrix2 == null) {
            return null;
        }
        if (!haveSameDimension(matrix1, matrix2)) {
            return null;
        }
        double[][] matrix = new double[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return matrix;
    }

    public static int[][] subtract(int[][] matrix1, int[][] matrix2) {
        if (matrix1 == null || matrix2 == null) {
            return null;
        }
        if (!haveSameDimension(matrix1, matrix2)) {
            return null;
        }
        int[][] matrix = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return matrix;
    }

    public static double[][] subtract(double[][] matrix1, double[][] matrix2) {
        if (matrix1 == null || matrix2 == null) {
            return null;
        }
        if (!haveSameDimension(matrix1, matrix2)) {
            return null;
        }
        double[][] matrix = new double[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return matrix;
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        if (matrix1 == null || matrix2 == null) {
            return null;
        }
        if (matrix1[0].length != matrix2.length) {
            return null;
        }
        int[][] matrix = new int[matrix1.length][matrix2[0].length];
        for (int i =0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                for (int k = 0; k < matrix2.length; k++) {
                    matrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return matrix;
    }

    public static double[][] multiply(double[][] matrix1, double[][] matrix2) {
        if (matrix1 == null || matrix2 == null) {
            return null;
        }
        if (matrix1[0].length != matrix2.length) {
            return null;
        }
        double[][] matrix = new double[matrix1.length][matrix2[0].length];
        for (int i =0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                for (int k = 0; k < matrix2.length; k++) {
                    matrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return matrix;
    }


    public static void main(String[] args) {
        int[][] matrix1 = createRandomMatrix(2, 3);
        print(matrix1);
        System.out.println();

        int[][] matrix2 = new int[2][3];
        createRandomMatrix(matrix2);
        print(matrix2);
        System.out.println();

        print(add(matrix1, matrix2));
        System.out.println();

        print(subtract(matrix1, matrix2));
        System.out.println();

        int[][] matrix3 = createRandomMatrix(3, 2);
        print(matrix3);
        System.out.println();

        print(multiply(matrix1, matrix3));
    }
}
