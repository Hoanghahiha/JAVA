package JavaFX_1;

import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class DemoController {
    public Text result;
    public Text errMsg;
    public TextField name;
    public TextField price;
    public TextField donVi;
    public TextField soLuong;

    public void submit(){
        try{
            Product p = new Product(name.getText(),
                    Integer.parseInt(donVi.getText()),Integer.parseInt(price.getText()),Integer.parseInt(soLuong.getText()));
            result.setText(result.getText()+p.toString());

            name.setText("");
            donVi.setText("");
            price.setText("");
            soLuong.setText("");

            errMsg.setVisible(false);
        }catch (Exception e){
            errMsg.setText(e.getMessage());
            errMsg.setVisible(true);
        }

    }
}
