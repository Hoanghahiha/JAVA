package Assignment4;

import session4.lab1.PhoneNumber;

import java.util.ArrayList;
import java.util.Collections;

public class MonHocDaiCuong extends MonHoc{
    public ArrayList<LopHoc> DsLopHoc = new ArrayList<>();
    @Override
    public void themLopHoc(String name, String hocsinh) {
        for(LopHoc p:DsLopHoc){
            if(p.LopHoc == name){
                for(String s:p.Hocsinh){
                    if(s == hocsinh) return;
                }
                p.Hocsinh.add(hocsinh);
                return;
            }
        }
        DsLopHoc.add(new LopHoc(name,hocsinh));
    }

    @Override
    public void xoaLopHoc(String name) {
        for(LopHoc p:DsLopHoc){
            if(p.LopHoc == name){
                DsLopHoc.remove(p);
                return;
            }
        }
    }

    @Override
    public void sapXep() {
        // bubble sort
        for(int i =0; i<DsLopHoc.size();i++){
            boolean flag = false;
            for (int j =0;j<DsLopHoc.size() - i - 1;j++){
                if (DsLopHoc.get(j).LopHoc.charAt(0)>DsLopHoc.get(j+1).LopHoc.charAt(0)){
                    flag = true;
                    Collections.swap(DsLopHoc,j,j+1);
                }
            }
            // No swapping happenned
            if (!flag){
                break;
            }
        }
        for (LopHoc s: DsLopHoc){
            System.out.println(s);
        }
    }

    @Override
    public void inDanhSach() {

    }
}
