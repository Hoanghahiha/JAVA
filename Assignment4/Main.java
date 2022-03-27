package Assignment4;

import session4.lab1.PhoneBook;
import session4.lab1.PhoneNumber;

public class Main {
    public static void main(String args[]){
        PhoneBook pb = new PhoneBook();

        pb.insertPhone("Duy","0911222333");
        pb.insertPhone("Duy","0988777666");

        pb.insertPhone("Lan","01828282828");
        pb.insertPhone("Anh","01283844352");

        for (PhoneNumber pn : pb.PhoneList){
            System.out.println(pn.name);
            System.out.println(pn.phone);
        }

        pb.sort();
        for (PhoneNumber pn : pb.PhoneList){
            System.out.println(pn.name);
            System.out.println(pn.phone);
        }
    }
}
