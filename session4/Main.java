package session4;

import java.util.ArrayList;

public class Main {
    public int year;
    public static int numberYear; // Global variable

    public static void main(String args[]){
        System.out.println("Hello world");
        numberYear = 20;
        Main m = new Main();
        m.year = 2022;

        m.sayHello();
        Main.reading();

        int x; //x=0
        Main ma; //null
        ma = new Main(); // co o nho --> bien phai co gia tri thi moi co o nho
        Main m2;
        Main m3;
        ArrayList<String> arr;
        arr = new ArrayList<>();
        arr.add("aaa");
    }

    public void sayHello(){

    }

    public void go(){
        this.sayHello();
    }

    public static void reading(){
        // trong stactic khong co this

    }
}
