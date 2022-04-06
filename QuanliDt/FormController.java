package QuanliDt;

import javafx.Main;
import javafx.Person;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class FormController {
    public Text result;
    public Text errMsg;
    public TextField cTen;
    public TextField cSDT;

    public PhoneNumber phoneNumber;

    public void setData(PhoneNumber phoneNumber){
        this.phoneNumber = phoneNumber;

        cTen.setText(phoneNumber.getTen());
        cSDT.setText(phoneNumber.getPhoneNum());
    }

    public void submit(){
//        String s = "\n------------------";
//        s+= "\n"+fullName.getText();
//        s+= "\n"+email.getText();
//        s+= "\n"+age.getText();
//
        try{
            PhoneNumber p = new PhoneNumber(cTen.getText(),
                    cSDT.getText());
            if(this.phoneNumber == null){
                MainDT.phoneList.add(p);
            }else{
                int i = MainDT.phoneList.indexOf(this.phoneNumber);
                MainDT.phoneList.set(i,p);
            }

            //renderList();
            Parent root = FXMLLoader.load(getClass().getResource("list.fxml"));
            Main.rootStage.setScene(new Scene(root,600,400));

            errMsg.setVisible(false);
        }catch (Exception e){
            errMsg.setText(e.getMessage());
            errMsg.setVisible(true);
        }

    }

    private void renderList(){
        String txt = "Infomation\n";
        for(PhoneNumber p : MainDT.phoneList){
            txt+= p.toString();
        }
        result.setText(txt);

        cTen.setText("");
        cSDT.setText("");
    }
}
