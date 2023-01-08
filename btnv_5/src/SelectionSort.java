import java.util.*;

public class SelectionSort {
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min_idx] > array[j]) {
                    min_idx = j;
                }
            }
            int temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("Enter the values of the array");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        selectionSort(array);
        System.out.println("Array after sorting is: " + Arrays.toString(array));
        sc.close();
    }
}
