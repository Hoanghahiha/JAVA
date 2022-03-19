import java.util.Scanner;

public class Fibonacy {
    public static void main(String args[]) {
        int n;

        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("n = ");
            n = sc.nextInt();
        }while(n <= 0);

        //print out the Fibonacci
        System.out.format("%dth Fibonacci is: %d", n, fibo(n));

    }
    public static int fibo(int n){
        int cnt = 2;
        int a0 = 1, a1 = 1, a2 = 2;
        if(n == 1 || n == 2){
            return 1;
        }
        else{
            while(cnt++ < n){
                a2 = a0 + a1;
                a0 = a1;
                a1 = a2;
            }
            return a2;
        }
    }
}
