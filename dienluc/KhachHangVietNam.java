package dienluc;

public class KhachHangVietNam extends  KhachHang{
    public int LoaiKH;
    public KhachHangVietNam()
    {
        super();
        this.LoaiKH=0;
    }
    public KhachHangVietNam(int ma, double dgia, String ngay, String hoten, int sl,
                            double ttien, int loai)
    {
        super(ma, dgia, ngay, hoten, sl, ttien);
        this.LoaiKH = loai;
    }
    public int getLoaiKH() {
        return LoaiKH;
    }
    public void setLoaiKH(int loaiKH) {
        LoaiKH = loaiKH;
    }
    public void nhap()
    {
        super.nhap();
        System.out.println("Loai Khach Hang (1=SinhHoat, 2=KinhDoanh, 3=SanXuat)");
        LoaiKH = in.nextInt();
    }
    public double TTien()
    {
        if(SoLuong<50)
            return this.ThanhTien=this.DonGia*this.SoLuong;
        else if (SoLuong > 50 && SoLuong < 100)
            return this.ThanhTien=50*this.DonGia + (this.SoLuong-50)*this.DonGia*1.2;
        else if (SoLuong >100 && SoLuong <200)
            return this.ThanhTien=50*this.DonGia + (this.SoLuong-100)*this.DonGia*1.5;
        else
            return this.ThanhTien=50*this.DonGia + (this.SoLuong-200)*this.DonGia*2;
    }
    public String toString()
    {
        String temp;
        if(LoaiKH==1)
            temp="Sinh Hoat";
        else if(LoaiKH==2)
            temp="Kinh Doanh";
        else
            temp="San Xuat";
        return "Khach Hang Viet: " + super.toString() + ", LoaiKH: " + temp
                + ", Thanh Tien: " + ThanhTien;
    }
}
