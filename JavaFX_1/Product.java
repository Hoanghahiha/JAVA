package JavaFX_1;

public final class Product {
    public String name;
    public Integer price;
    public Integer donVi;
    public Integer soLuong;

    public Product() {
    }

    public Product(String name, Integer donVi, Integer price,Integer soLuong) {
        this.name = name;
        this.donVi = donVi;
        this.price = price;
        this.soLuong = soLuong;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getDonVi() {
        return donVi;
    }

    public void setDonVi(Integer donVi) {
        this.donVi = donVi;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public String toString(){
        String s = "\n-------------";
        s+= "\n"+"ProductName : "+getName();
        s+= "\n"+"Don vi: "+getDonVi();
        s+= "\n"+"Price: "+getPrice();
        s+= "\n"+"So Luong: "+getSoLuong();
        return s;
    }
}
