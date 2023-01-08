public class Main {


    public static void main(String[] args) {

        int n = 12, k = 2;

        while (k < n) {

            for (k = 2; k <= n; k++)

                if (n % k == 2) {

                    {

                        System.out.print(k + " ");

                        n = n / k;

                        break;

                    }

                }
        }
    }
}


