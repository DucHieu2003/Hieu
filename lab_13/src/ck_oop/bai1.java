package ck_oop;

import java.util.*;

public class bai1 {
    public static double function(double x) {
        return Math.sin(x) * Math.sin(x) * Math.cos(x);
    }
    public static double Inter(double a, double b, int n) {
        int z;
        double h,s;

        //n = n+n;
        s = (function(a) + function(b)) / 2;
        h = (b - a) / n;
       // z = 4;

        for (int i = 1; i < n; i++) {
            s = s +   function(a + i*h);
          //  z = 6 - z;
        }
        return s * h;
    }
    public static void main(String args[]){
        // Call class function
//        Function function;
//        function = new Function();

        // ENTER the desired values of a, b and n !!!
        double b = Math.PI / 2 ;
        double a = 0 ;
        int n = 10000 ;
        // Applies simpson method to function
        double result = Inter(a, b, n);
        double kt = 1/3 - result;
        // Show results
        System.out.println("Integral is: " + result);
       // System.out.println(kt);
    }
}
