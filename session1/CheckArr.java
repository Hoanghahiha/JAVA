import java.util.Scanner;

public class CheckArr {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < 10; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
        System.out.print("Các phần tử của mảng: \n");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " \n");
        }
        System.out.println("Các số nguyên tố: ");
        int count;
        for(int i = 0; i < 10 ; i++) {
            count = 0;
            for(int a = 2; a <= arr[i]; a++) {
                if(arr[i] % a == 0) {
                    count += 1;
                }
            }
            if(count == 1) {
                System.out.println(arr[i]);
            }
        }
    }
}