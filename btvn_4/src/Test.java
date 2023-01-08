public class Test {
    int c  = 1;
    static int d = 1;

    public static void main(String[] args) {
        Test t1 = new Test();
        t1.c++;
        t1.d++;
        System.out.println(t1.c);
        System.out.println(t1.d);
    }
}
