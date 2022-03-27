package session4.lab1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PhoneBook extends Phone{
    public ArrayList<PhoneNumber> PhoneList = new ArrayList<>();

    @Override
    public void insertPhone(String name, String phone) {
        for(PhoneNumber p:PhoneList){
            if(p.name == name){
                for(String s:p.phone){
                    if(s == phone) return;
                }
                p.phone.add(phone);
                return;
            }
        }
        PhoneList.add(new PhoneNumber(name,phone));
    }

    @Override
    public void removePhone(String name) {
        for(PhoneNumber p:PhoneList){
            if(p.name == name){
                PhoneList.remove(p);
                return;
            }
        }
    }

    @Override
    public void updatePhone(String name, String newphone) {
        for(PhoneNumber p:PhoneList){
            if(p.name == name){
                p.phone.removeAll(p.phone);// xoa het
                p.phone.add(newphone);
                return;
            }
        }
    }

    @Override
    public PhoneNumber searchPhone(String name) {
        for(PhoneNumber p:PhoneList){
            if(p.name == name){
//                System.out.println(p.name+":"+p.phone);
                return p;
            }
        }
        return null;
    }

    @Override
    public void sort() {
        // bubble sort
        for(int i =0; i<PhoneList.size();i++){
            boolean flag = false;
            for (int j =0;j<PhoneList.size() - i - 1;j++){
                if (PhoneList.get(j).name.charAt(0)>PhoneList.get(j+1).name.charAt(0)){
                    flag = true;
                    Collections.swap(PhoneList,j,j+1);
                }
            }
            // No swapping happenned
            if (!flag){
                break;
            }
        }
        for (PhoneNumber s: PhoneList){
            System.out.println(s);
        }
    }
}