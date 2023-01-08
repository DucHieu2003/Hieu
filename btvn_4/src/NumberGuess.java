import java.util.Scanner;

public class NumberGuess {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        final int SECRET_NUMBER = (int) (Math.random() * 100);
        int trials_Max = Integer.MAX_VALUE;
        int count = 0;
        System.out.println(SECRET_NUMBER);
        System.out.println("Key in your guess:");

        for (int i = 1; i < trials_Max; i++) {
            int number = sc.nextInt();
            if (number > SECRET_NUMBER) {
                System.out.println("Try lower");
                count++;

            } else if (number < SECRET_NUMBER) {
                System.out.println("Try higher");
                count++;
            }else {
                count++;
                System.out.println("You got it in " + count + " trials");
                break;
            }
        }
    }

}
