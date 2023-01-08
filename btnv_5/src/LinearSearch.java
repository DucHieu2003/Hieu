import java.util.Scanner;

public class LinearSearch {
    public static boolean linearSearch(int[] array, int key) {
        for (int i : array) {
            if (i == key) {
                return true;
            }
        }
        return false;
    }

    public static int linearSearchIndex(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the values of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("Enter the number you want to search: ");
        int key = sc.nextInt();
        System.out.println("Check number in array: " + linearSearch(array, key));
        System.out.println("Numeric position in array is: " + linearSearchIndex(array, key));
        sc.close();
    }
}
