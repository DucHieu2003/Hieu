package bt_4;

import java.util.*;

public class Statistic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen duong n: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Nhap vao cac phan tu cua mang a: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        double mean = 0;
        double var = 0;
        int sum = 0;
        double sVar = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
            sVar += Math.pow(a[i], 2) / n;
        }
        mean = (double) sum / n;
        mean = (double) Math.round(mean * 1000) / 1000;
        var = sVar - Math.pow(mean, 2);
        var = (double) Math.round(var * 1000) / 1000;
        System.out.println("Gia tri trung binh cua mang la: " + mean);
        System.out.println("Phuong sai cua mang la: " + var);
    }

}
