package btvn_2;

import java.util.*;

public class GradesStatistics_2 {
    public static int[] grades;

    public static void main(String[] args) {
        readGrades();
        System.out.println("The grades are: ");
        print(grades);
        System.out.println("The average is " + average(grades));
        System.out.println("The median is " + median(grades));
        System.out.println("The max is " + max(grades));
        System.out.println("The min is " + min(grades));
        System.out.println("The standard deviation is: " + stdDev(grades));
    }

    public static void readGrades() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        grades = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("The grade for student " + (i + 1) + ": ");
            grades[i] = sc.nextInt();

        }
    }

    public static void print(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static double average(int[] array) {
        double ave = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        ave = (double) sum / array.length;
        ave = (double) Math.round(ave * 100) / 100;

        return ave;
    }

    public static double median(int[] array) {
        double median;
        int num1 = array.length / 2;
        int num2 = (array.length - 1) / 2;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        if (array.length % 2 == 0) {
            median = (double) (array[num1 - 1] + array[num1]) / 2;
        } else {
            median = array[num2];
        }
        return median;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static double stdDev(int[] array) {
        double mean = average(array);
        double sumStd = 0;
        double std = 0;
        for (int i = 0; i < array.length; i++) {
            sumStd += array[i] * array[i] - mean * mean;
        }
        std = Math.sqrt(sumStd / array.length);
        std = (double) Math.round(std * 100) / 100;
        return std;
    }
}

