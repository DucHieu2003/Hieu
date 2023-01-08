package Exersices1_7;

public class TestMain {
    public static void main(String[] args) {
        MyComplex complex1 = new MyComplex();
        System.out.println(complex1);
        complex1.setReal(2.5);
        complex1.setImag(3.4);
        System.out.println("Number 1 is: " + complex1);
        MyComplex complex2 = new MyComplex(1.6, 4.1);
        System.out.println(complex2);
        complex2.setValue(0.5, 3.6);
        System.out.println("Number 2 is: " + complex2);
        if (complex1.isReal()) {
            System.out.println(complex1 + " is a pure real number");
        } else {
            System.out.println(complex1 + " is NOT a pure real number");
        }

        if (complex2.isImaginary()) {
            System.out.println(complex2 + " is a pure imaginary number");
        } else {
            System.out.println(complex2 + " is NOT a pure imaginary number");
        }

        if (complex1.equals(complex2)) {
            System.out.println(complex1 + " is equal to " + complex2);
        } else {
            System.out.println(complex1 + " is NOT equal to " + complex2);
        }

        System.out.println(complex1 + " magnitude is: " + complex1.magnitude());
        System.out.println("Number 2 add into number 1 equal: " + complex1.addInto(complex2));
        System.out.println("Number 1 is: " + complex1);
        System.out.println("The sum complex is: " + complex1.addNew(complex2));
    }
}
