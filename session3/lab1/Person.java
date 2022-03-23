package session3.lab1;

import java.util.Scanner;

public class Person {
    String ten;
    String  gioitinh;
    String address;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        this.ten = sc.nextLine();
        System.out.println("Nhap gioi tinh (F/M)): ");
        this.gioitinh = sc.nextLine();
        System.out.println("Nhap dia chi: ");
        this.address = sc.nextLine();
    }
}
