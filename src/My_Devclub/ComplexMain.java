package My_Devclub;

public class ComplexMain {
    public static void main(String[] args) {
        Complex complex = new Complex(1.2, 2.4);
        Complex complex1 = new Complex(3.6, 5.1);
        Complex complex2;

        complex2 = complex;
        System.out.println(complex.equals(complex1));
        System.out.println(complex1.equals(complex2));
        System.out.println(complex2);

    }
}