public class TrigonometricSeries {
    public static void main(String[] args) {
        double sin_MathMethod = Math.sin(Math.PI / 2);
        double sin_Cal = sinCal(Math.PI / 2, 5);
        double cos_MathMethod = Math.cos(Math.PI / 2);
        double cos_Cal = cosCal(Math.PI / 2, 5);
        System.out.println(sin_Cal);
        System.out.println(sin_MathMethod);
        System.out.println(cos_Cal);
        System.out.println(cos_MathMethod);
    }

    public static double sinCal(double x, int numTerm) {
        double total = 0;
        double base = x;
        for (int i = 2; i <= numTerm; i++) {
            if (i % 2 == 1) {
                base = -(base * Math.pow(x, 2)) / i;
                total += base;
            } else base /= i;
        }

        double sin = x + total;
        return Math.round(sin * 100.0) / 100.0;
    }

    public static double cosCal(double x, int numTerm) {
        double total = 0;
        double base = 1;
        for (int i = 2; i <= numTerm; i++) {
            if (i % 2 == 0) {
                base = -(base * Math.pow(x, 2)) / i;
                total += base;
            } else base /= i;
        }

        double cos = 1 + total;
        return Math.round(cos * 100.0) / 100.0;
    }
}


