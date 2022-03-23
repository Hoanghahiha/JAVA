package session3.lab1;

import java.util.Scanner;

public class Giaovien extends Student{
    String dsLopday;
    int mucluong;
    int somonday;
    String cacmonday;

    public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap danh sach lop day: ");
        dsLopday = sc.nextLine();
        System.out.println("Nhap muc luong: ");
        mucluong = sc.nextInt();
        System.out.println("Nhap so mon day: ");
        somonday = sc.nextInt();
        System.out.println("Nhap cac mon day: ");
        cacmonday = sc.nextLine();
    }
}
