import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n = ");
        n=sc.nextInt();
        if (checkPrime(n)){
            System.out.println(n + " la so nguyen to");
        }else{
            System.out.println(n + " khong la so nguyen to");
        }

        // int count = 0;
        //    for(int i=1; i<=n ;i++){
        //       if(n%i==0){
        //          count++;
        //          System.out.println();
        //      }
        //   }
        //   if(count==2){
        //   }
    }
    public static boolean checkPrime(int n){
        if(n<2) return false;
        if(n<4) return true;
        for (int i=2;i<=n/2;i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
