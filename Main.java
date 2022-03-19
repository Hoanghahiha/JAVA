import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("lalala");
        int x = 10;
        double pi = 3.14159;
        char h = 'h';
        boolean t = true;
        String s = "T2018M";
        s = s + " SEM 2";
        System.out.println(s);
        if (x >= 10) {
            System.out.println("x >= 10");
        } else {
            System.out.println("Not Found");
        }
        switch (h) {
            case 'a':
                System.out.println("AA");
                break;
            case 'h':
                System.out.println("HH");
                break;
            default:
                System.out.println("Not Found");
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("i= " + i);
        }
        System.out.println("Nhap 1 so tu ban phim");
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        sc.nextLine();
        System.out.println("So vua nhap:" + n);
        String s1 = sc.nextLine();
        System.out.println("String: " + s1);
        //array
        int[] arr = new int[10]; // giong int arr[10]
        arr[0] = 13;
        arr[1] = 15;
        for (int i = 0; i < 10; i++) {
            arr[1] = i * 2 + 1;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
        //for-each
        for (int a : arr) {
            System.out.println(a);
        }
    }
}

