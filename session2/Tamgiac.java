package session2;

import java.util.Scanner;

public class Tamgiac {
    int a,b,c;

    public Tamgiac(){
        Scanner sc = new Scanner(System.in);
        this.a = sc.nextInt();
        this.b = sc.nextInt();
        this.c = sc.nextInt();
        System.out.println("Dien tich tam giac la: " + dientich() );
        System.out.println("Chu vi tam giac la: " + chuvi());
    }

    int chuvi(){
        return (a + b + c);
    }

    double dientich(){
        double ncv = (double) (a + b + c)/2;
        return Math.sqrt(ncv*(ncv-a)*(ncv-b)*(ncv-c));
    }

    //ham getter setter

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

}
