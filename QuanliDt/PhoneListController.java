package QuanliDt;

import javafx.Main;
import javafx.Person;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

public class PhoneListController implements Initializable {
    public TableView<PhoneNumber> tbView;
    public TableColumn<PhoneNumber, String> tbTen;
    public TableColumn<PhoneNumber,String> tbSdt;
    public TableColumn<PhoneNumber, Button> tbEdit;
    public TableColumn<PhoneNumber, Button> tbDelete;
    public TextField tbSearch;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tbTen.setCellValueFactory(new PropertyValueFactory<PhoneNumber,String>("ten"));
        tbSdt.setCellValueFactory(new PropertyValueFactory<PhoneNumber,String>("SDT"));
        tbEdit.setCellValueFactory(new PropertyValueFactory<PhoneNumber,Button>("edit"));
        tbDelete.setCellValueFactory(new PropertyValueFactory<PhoneNumber,Button>("Delete"));
        tbView.setItems(MainDT.phoneList);
    }
    public void formScreen() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("form.fxml"));
        Main.rootStage.setScene(new Scene(root,600,400));
    }

    public void search(){
        String s = tbSearch.getText();
        List<PhoneNumber> kq = MainDT.phoneList.stream()
                .filter(p->p.getTen().contains(s)
                        || p.getPhoneNum().contains(s))
                .collect(Collectors.toList());
        ObservableList result = FXCollections.observableArrayList();
        result.addAll(kq);
        tbView.setItems(result);
    }
}
