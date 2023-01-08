
public class FactorialInt {
    public static void main(String[] args) {
        int number = 1;
        while (checkFactorial(number)) {
            System.out.println("The factorial of " + number + " is " + FactorialCal(number));
            number++;
        }

        if (!checkFactorial(number)) {
            System.out.println("The factorial of " + number + " is out of range");
        }
    }

    public static boolean checkFactorial(int number) {
        long product = FactorialCal(number);
        long int_maxValue = Integer.MAX_VALUE;
        return product <= int_maxValue;
    }

    private static long FactorialCal(int number) {
        long product = 1;
        for (int i = 1; i <= number; i++) {
            product *= i;
        }
        return product;
    }
}
