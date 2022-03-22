package Assigment2;

import java.util.Scanner;
public class Fraction {
    int tuso,mauso;
    Scanner input=new Scanner(System.in);

    public void inputData() {
        System.out.print("Nhap tu so: ");
        this.tuso=input.nextInt();
        do
        {
            System.out.print("Nhap mau so: ");
            this.mauso=input.nextInt();
        }
        while (this.mauso==0);
    }

    public void outputData(String y) {
        System.out.println(y+" " +this.tuso+"/"+this.mauso);
    }
    public int UCLN(int a,int b) {
        if ((a==0) || (b==0))
            return a+b;
        while(a!=b)
        {
            if(a>b)
                a=a-b;
            else
                b=b-a;
        }
        return a;
    }
    public void toiGian() {
        int i=UCLN(tuso,mauso);
        this.tuso = this.tuso/i;
        this.mauso = this.mauso/i;
    }

    public void ngichdaophanso() {
        int tg=this.tuso;
        this.tuso = this.mauso;
        this.mauso = tg;
    }

    public Fraction tong(Fraction f) {
        Fraction ps=new Fraction();
        ps.tuso = ((this.tuso*f.mauso) + (this.mauso*f.tuso));
        ps.mauso = (this.mauso*f.mauso);
        ps.toiGian();
        return ps;
    }

    public Fraction hieu(Fraction f) {
        Fraction ps=new Fraction();
        ps.tuso = (this.tuso*f.mauso) - (this.mauso*f.tuso);
        ps.mauso = (this.mauso*f.mauso);
        return ps;
    }

    public Fraction tich(Fraction f) {
        Fraction ps=new Fraction();
        ps.tuso = this.tuso*f.tuso;
        ps.mauso = this.mauso*f.mauso;
        ps.toiGian();
        return ps;
    }

    public Fraction thuong(Fraction f) {
        Fraction ps=new Fraction();
        ps.tuso = this.tuso*f.mauso;
        ps.mauso = this.mauso*f.tuso;
        ps.toiGian();
        return ps;
    }
}