package QuanliDt;

import javafx.DemoController;
import javafx.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public class PhoneNumber {
    public String ten;
    public String phoneNum;
    public Button edit;
    public Button delete;

    public PhoneNumber(){

    }

    public PhoneNumber(String ten,String phoneNum){
        this.ten = ten;
        this.phoneNum = phoneNum;
        this.edit = new Button("Edit");
        this.delete = new Button("Delete");
        this.edit.setOnAction(event->{
            try{
                FXMLLoader loader = new FXMLLoader(getClass().getResource("form.fxml"));
                Parent root = loader.load();
                FormController d = loader.getController();
                d.setData(this);
                Main.rootStage.setScene(new Scene(root,600,400));
            }catch (Exception e){

            }

        });
        this.delete.setOnAction(event -> {
            MainDT.phoneList.remove(this);
        });

    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Button getEdit() {
        return edit;
    }

    public void setEdit(Button edit) {
        this.edit = edit;
    }

    public String toString(){
        String s = "\n-------------";
        s+= "\n"+getTen();
        s+= "\n"+getPhoneNum();
        return s;
    }
}

