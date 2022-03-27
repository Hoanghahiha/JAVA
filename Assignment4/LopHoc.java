package Assignment4;

import java.util.ArrayList;

public class LopHoc {
    public String LopHoc;
    public ArrayList<String> Hocsinh = new ArrayList<>();

    public LopHoc(String LopHoc,String Hocsinh){
        this.LopHoc = LopHoc;
        this.Hocsinh.add(Hocsinh);
    }
}
