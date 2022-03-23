package session3.lab1;

import java.util.Scanner;

public class Student extends Person{
    int MaSV;
    int diemthi;
    String email;

    public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma Sv: ");
        this.MaSV = sc.nextInt();
        System.out.println("Nhap dia chi email: ");
        this.email = sc.nextLine();
    }

    public void hocbong(){
        if (this.diemthi>8){
            System.out.println("Hoc sinh nhan duoc hoc bong");
        }else {
            System.out.println("Hoc sinh khong nhan duoc hoc bong");
        }
    }
}
