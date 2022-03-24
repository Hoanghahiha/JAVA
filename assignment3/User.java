package assignment3;

import java.util.Scanner;

public class User {
    public String name;
    public String email;
    public int phoneNum;
    public int age;
    public int money;

    public User() {
        super();
    }


    public User(String name,String email,int phoneNum, int age, int money){
        this.name = name;
        this.email = email;
        this.phoneNum = phoneNum;
        this.age = age;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void infoUserinput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        name = sc.nextLine();
        System.out.println("Nhap email: ");
        email = sc.nextLine();
        System.out.println("Nhap so dien thoai: ");
        phoneNum = sc.nextInt();
        System.out.println("Nhap tuoi: ");
        age = sc.nextInt();
        System.out.println("Nhap so tien: ");
        money = sc.nextInt();
    }

    public void infouseroutput(){
        System.out.println("Ho ten khach hang: " + this.name);
        System.out.println("Email: "+ email+", SDT: "+this.phoneNum);
        System.out.println("So tien khach co: "+this.money);
    }

}
