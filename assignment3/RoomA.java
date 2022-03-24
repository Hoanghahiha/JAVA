package assignment3;

public class RoomA extends Room{
    public RoomA(String tenphong, String vitri, int giathuephong, String userlist) {
        super("RoomA", "Tang1", 300000, "Ha");
    }
    public String toString() {
        return "RoomA{" +
                "ten phong='" + tenphong + '\'' +
                ", gia thue phong=" + giathuephong +
                '}';
    }

}
