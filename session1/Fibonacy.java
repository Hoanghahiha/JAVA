import java.util.Scanner;

public class Fibonacy {

    public static int nhapSoTN() {
        Scanner input = new Scanner(System.in);
        boolean check = false;
        int n = 0;
        while (!check) {
            try {
                n = Integer.parseInt(input.nextLine());
                if (n < 0) {
                    System.out.println("Bạn phải nhập số tự nhiên! Hãy nhập lại.");
                    continue;
                }
                check = true;
            } catch (Exception e) {
                System.out.println("Bạn phải nhập số tự nhiên! Hãy nhập lại.");
            }
        }
        return (n);
    }

    public static int fibonacci_thu_n(int n) {
        if ((n == 1) || (n == 2)) {
            return 1;
        } else {
            int arr[] = new int[n];
            arr[0] = 1;
            arr[1] = 1;
            for (int i = 2; i < arr.length; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
            return arr[n-1];
        }

    }

    public static void main(String[] args) {
        System.out.println("Nhập số tự nhiên n: ");
        int n = nhapSoTN();
        System.out.println("Số Fibonacci thứ " + n + " là: ");
        System.out.println(fibonacci_thu_n(n));
    }

}