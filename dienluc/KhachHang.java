package dienluc;

import java.util.Scanner;

public class KhachHang {
    public int MaKH, SoLuong;
    public double DonGia, ThanhTien;
    public String NgayHD, HoTenKH;
    Scanner in =new Scanner(System.in);
    public KhachHang()
    {
        this.MaKH=0;
        this.DonGia=0;
        this.NgayHD="";
        this.HoTenKH="";
        this.SoLuong=0;
    }
    public KhachHang(int ma, double dgia, String ngay, String hoten, int sl,
                        double ttien)
    {
        this.MaKH=ma;
        this.DonGia=dgia;
        this.NgayHD=ngay;
        this.HoTenKH=hoten;
        this.SoLuong=sl;
        this.ThanhTien=ttien;
    }
    public int getMaKH() {
        return MaKH;
    }
    public void setMaKH(int maKH) {
        MaKH = maKH;
    }
    public double getDonGia() {
        return DonGia;
    }
    public void setDonGia(double donGia) {
        DonGia = donGia;
    }
    public String getNgayHD() {
        return NgayHD;
    }
    public void setNgayHD(String ngayHD) {
        NgayHD = ngayHD;
    }
    public String getHoTenKH() {
        return HoTenKH;
    }
    public void setHoTenKH(String hoTenKH) {
        HoTenKH = hoTenKH;
    }
    public int getSoLuong() {
        return SoLuong;
    }
    public void setSoLuong(int sl) {
        SoLuong = sl;
    }
    public double getThanhTien() {
        return ThanhTien;
    }
    public void setThanhTien(double thanhTien) {
        ThanhTien = thanhTien;
    }
    public void nhap()
    {
        System.out.println("Nhap Ma Khach Hang: ");
        MaKH = in.nextInt();
        System.out.println("Ho va Ten Khach Hang: ");
        HoTenKH = in.next();
        System.out.println("Ngay Lap Hoa Don: ");
        NgayHD = in.next();
        System.out.println("So Luong(KW): ");
        SoLuong = in.nextInt();
        System.out.println("Don Gia: ");
        DonGia = in.nextDouble();
    }
    public String toString() {
        return "[MaKH: " + MaKH + ", HoTenKH: " + HoTenKH + ", NgayHD: " +
                NgayHD
                + ", DonGia: " + DonGia + ", SoLuong: " +SoLuong;
    }
}
