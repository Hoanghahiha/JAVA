package Assigment2;

import java.util.Scanner;

public class Fraction {
    int tuso;
    int mauso;

    public int getTuso() {
        return tuso;
    }

    public void setTuso(int tuso) {
        this.tuso = tuso;
    }

    public Fraction(){
        Scanner fc = new Scanner(System.in);
        tuso = fc.nextInt();
        mauso = fc.nextInt();
        System.out.println("Phan so vua nhap la: " + (float)tuso/mauso);
        System.out.println("Phan so rut gon la: " );
        System.out.println("Phan  so nghich dao la: " + mauso/tuso);
    }


}
