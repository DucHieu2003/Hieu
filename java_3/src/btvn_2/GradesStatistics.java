package btvn_2;

import java.util.*;

public class GradesStatistics {

    public static void main(String[] args) {
        final int numStudents;
        int[] grade;
        int sum = 0;
        double ave = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        numStudents = sc.nextInt();
        grade = new int[numStudents];

        for (int i = 0; i < grade.length; i++) {
            System.out.print("Enter the grade for student " + (i + 1) + ": ");
            grade[i] = sc.nextInt();
        }
        int max = grade[0];
        int min = grade[0];
        sc.close();
        ;

        for (int i = 0; i < grade.length; i++) {
            sum += grade[i];
            ave = (double) sum / grade.length;
        }

        for (int i = 1; i < grade.length; i++) {
            if (min > grade[i]) {
                min = grade[i];
            }
            if (max < grade[i]) {
                max = grade[i];
            }
        }
        System.out.println("The average is: " + (double) Math.round(ave * 100) / 100);
        System.out.println("The minimum is: " + min);
        System.out.println("The maximum is: " + max);
    }
}
