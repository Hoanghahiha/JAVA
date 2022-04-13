package Exam;

import java.util.Scanner;

public class ComplexDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Complex sp1 = new Complex();
        Complex sp2 = new Complex();
        Complex spDivide = new Complex();
        Complex spAdd = new Complex();
        Complex spSubtract = new Complex();
        Complex spMultiply = new Complex();

        System.out.println("Enter Complex 1:");
        sp1.scan(sc);
        System.out.println("Enter Complex 2:");
        sp2.scan(sc);

        System.out.println("Complex 1 is:");
        sp1.toStringComplex();
        System.out.println("Complex 2 is:");
        sp2.toStringComplex();

        spDivide = sp1.divide(sp2);
        System.out.println("The result of division Complex 1 by Complex 2 is:");
        spDivide.toStringComplex();

        spAdd = sp1.add(sp2);
        System.out.println("The result of add Complex 1 by Complex 2 is:");
        spAdd.toStringComplex();

        spMultiply = sp1.multiply(sp2);
        System.out.println("The result of multiply Complex 1 by Complex 2 is:");
        spMultiply.toStringComplex();


        spSubtract = sp1.subtract(sp2);
        System.out.println("The result of subtract Complex 1 by Complex 2 is:");
        spSubtract.toStringComplex();

        sc.close();
    }
}
