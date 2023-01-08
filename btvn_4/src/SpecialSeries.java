import java.util.Scanner;

public class SpecialSeries {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        double x = sc.nextDouble();
        System.out.print("Enter the value of numTerm: ");
        int numTerm = sc.nextInt();
        if (x <= 1.0 || x >= -1) {
            System.out.println("The value of Exponential Series is: " + specialSeries(x, numTerm));
        } else {
            System.out.println("re-enter the value of x");
        }
    }

    public static double specialSeries(double x, int numTerm) {
        double sum = 0;
        double base = x;
        for (int i = 2; i <= numTerm; i++) {
            double fraction = 1;
            for (int k = 1; k <= i; k++) {
                if (k % 2 == 0 || k == i) {
                    fraction /= k;
                } else {
                    fraction *= k;
                }
            }
            if (i % 2 == 1) {
                base = base * Math.pow(x, 2) * fraction;
                sum += base;
            }
        }

        double result = x + sum;
        return Math.round(result * 100.0) / 100.0;
    }
}