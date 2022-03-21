package session2;

import java.util.Scanner;

public class Tamgiac {
    int a,b,c;

    public Tamgiac(){
        Scanner sc = new Scanner(System.in);
        this.a = sc.nextInt();
        this.b = sc.nextInt();
        this.c = sc.nextInt();
        System.out.println("Dien tich tam giac la: " + chuvi() );
        System.out.println("Chu vi tam giac la: " + chuvi());
    }

    public float chuvi(){
        float cv = (float)(this.a + this.b + this.c);
        return cv;
    }

    public float dientich(){
        float ncv = (float)(this.a + this.b + this.c)/2;
        float s = (float)Math.sqrt(ncv*(ncv-a)*(ncv-b)*(ncv-c));
        return s;
    }
}
