package assignment3;

public class Room{
    public String tenphong;
    public String vitri;
    public int giathuephong;
    public String userlist;

    public Room(String tenphong, String vitri, int giathuephong, String userlist){
        this.tenphong = tenphong;
        this.vitri = vitri;
        this.giathuephong = giathuephong;
        this.userlist = userlist;
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

    public String getUserlist() {
        return userlist;
    }

    public void setUserlist(String userlist) {
        this.userlist = userlist;
    }
}
