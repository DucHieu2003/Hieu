import java.util.Scanner;

public class RecursiveBinarySearch {
    public static boolean binarySearch(int[] array, int key, int fromIdx, int toInx) {
        if (fromIdx == toInx - 1) {
            if (key == array[fromIdx]) {
                return true;
            } else {
                return false;
            }
        }
        int middleIdx = (fromIdx + toInx) / 2;
        if (key == array[middleIdx]) {
            return true;
        } else if (key < array[middleIdx]) {
            toInx = middleIdx;
        } else {
            fromIdx = middleIdx + 1;
        }
        return binarySearch(array, key, fromIdx, toInx);
    }

    public static boolean binarySearch(int[] array, int key) {
        return binarySearch(array, key, 0, array.length - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("Enter the values of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("Enter the key: ");
        int key = sc.nextInt();
        System.out.println(binarySearch(array, key));
        sc.close();
    }
}
