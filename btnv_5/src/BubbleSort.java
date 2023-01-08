import java.util.*;

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the values of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        bubbleSort(array);
        System.out.println("Array after sorting is: " + Arrays.toString(array));
        sc.close();
    }
}
