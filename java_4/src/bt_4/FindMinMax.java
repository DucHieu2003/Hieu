package bt_4;

import java.util.*;

public class FindMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("NHap vao kich thuoc cua mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Nhap vao cac phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Gia tri lon nhat va nho nhat cua mag la: " + min + " " + max);
    }
}
