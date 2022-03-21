import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
        int n,sum = 0;
        Scanner Num = new Scanner(System.in);
        System.out.println("Nhap vao mot so: ");
        n = Num.nextInt();
        for(int i=1;i<=n/2;i++){
            if(n%i==0)
                sum+=i;
        }
        if(sum==n){
            System.out.println(n + " là số hoàn hảo");
        }
        else {
            System.out.println(n + " không phải là số hoàn hảo");
        }
    }
}
