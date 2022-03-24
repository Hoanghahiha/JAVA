package assignment3;

import java.util.ArrayList;

public class Room extends User{
    public String tenphong;
    public String vitri;
    public int giathuephong = 300000;

    ArrayList<String> User = new ArrayList<>();

    public void adduser(){
        if(getMoney() > giathuephong){
            User.add(name);
        }else {
            System.out.println("So tien quy khach khong du, vui long quay lai sau");
        }
    }

    public void info(){
        System.out.println("Thong tin khach thue phong: "+getName()+" ở phòng: "+getVitri()+"co gia: "+getGiathuephong());
    }


    public Room(String tenphong, String vitri, int giathuephong){
        this.tenphong = tenphong;
        this.vitri = vitri;
        this.giathuephong = giathuephong;
    }

    public String getTenphong() {
        return tenphong;
    }

    public void setTenphong(String tenphong) {
        this.tenphong = tenphong;
    }

    public String getVitri() {
        return vitri;
    }

    public void setVitri(String vitri) {
        this.vitri = vitri;
    }

    public int getGiathuephong() {
        return giathuephong;
    }

    public void setGiathuephong(int giathuephong) {
        this.giathuephong = giathuephong;
    }



}
