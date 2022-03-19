import java.util.Scanner;

public class USCLN_BSCNN {
    public static int UCLN(int a, int b){
        while(a!= b){
            if(a>b)
                a= a-b;
            else
                b= b-a;
        }
        return (a);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap a");
        int a = input.nextInt();
        System.out.println("Nhap b");
        int b= input.nextInt();
        System.out.println("Uoc chung lon nhat cua "+a+" va "+b+" la: "+UCLN(a,b));
        System.out.println("Boi chung nho nhat cua "+a+" va "+b+" la: "+((a*b)/UCLN(a,b)));
    }

}
