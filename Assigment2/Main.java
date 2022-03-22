package Assigment2;

public class Main {
    public static void main(String args[]){
        Fraction ps1 = new Fraction();
        Fraction ps2 = new Fraction();
        ps1.inputData();
        ps2.inputData();
        ps1.outputData("Phan so 1 la: ");
        ps2.outputData("Phan so 2 la: ");
        ps1.toiGian();
        ps1.outputData("Phan so 1 sau khi toi gian la: ");
        ps2.toiGian();
        ps2.outputData("Phan so 2 sau khi toi gian la: ");
        ps1.tong(ps2).outputData("Tong hai phan so la: ");
        ps1.hieu(ps2).outputData("Hieu hai phan so la: ");
        ps1.tich(ps2).outputData("Tich hai phan so la: ");
        ps1.thuong(ps2).outputData("Thuong hai phan so la:");
    }
}
