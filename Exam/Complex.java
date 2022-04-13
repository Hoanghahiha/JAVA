package Exam;

import java.util.Scanner;

public class Complex {

    private double realPart;
    private double imaginaryPart;

    public Complex() {
        realPart = 0;
        imaginaryPart = 0;
    }

    public Complex(double a, double b) {
        this.realPart = a;
        this.imaginaryPart = b;
    }

    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    public void scan(Scanner sc) {
        System.out.print("\tEnter real part: ");
        realPart = sc.nextDouble();
        System.out.print("\tEnter imaginary part: ");
        imaginaryPart = sc.nextDouble();
    }

    public void toStringComplex() {
        if (imaginaryPart < 0) {
            System.out.println(realPart + " - " + Math.abs(imaginaryPart) + "*i");
        } else {
            System.out.println(realPart + " + " + imaginaryPart + "*i");
        }
    }

    public Complex add(Complex sp2) {
        double real = realPart + sp2.realPart;
        double imaginary = imaginaryPart + sp2.imaginaryPart;
        return new Complex(real, imaginary);
    }

    public Complex subtract(Complex sp2) {
        double real = realPart - sp2.realPart;
        double imaginary = imaginaryPart - sp2.imaginaryPart;
        return new Complex(real, imaginary);
    }

    public Complex multiply(Complex sp2) {
        double real = realPart * sp2.realPart - imaginaryPart * sp2.imaginaryPart;
        double imaginary = realPart * sp2.imaginaryPart + sp2.realPart * imaginaryPart;
        return new Complex(real, imaginary);
    }

    public Complex divide(Complex sp2) {
        double real = (realPart * sp2.realPart + imaginaryPart * sp2.imaginaryPart) / (sp2.realPart * sp2.realPart + sp2.imaginaryPart * sp2.imaginaryPart);
        double imaginary = (sp2.realPart * imaginaryPart - realPart * sp2.imaginaryPart) / (sp2.realPart * sp2.realPart + sp2.imaginaryPart * sp2.imaginaryPart);
        return new Complex(real, imaginary);
    }
}
