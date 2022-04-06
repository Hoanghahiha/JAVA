package QuanliDt;

import javafx.Person;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainDT extends Application {
    public static ObservableList<PhoneNumber> phoneList = FXCollections.observableArrayList();
    public static Stage rootStage;
    public void start(Stage primaryStage) throws Exception{
        rootStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("list.fxml"));
        primaryStage.setTitle("Quan ly danh ba");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }

    public static void main(String[] args) {
        phoneList.add(new PhoneNumber("quang hoa","quanghoa@gmail.com"));
        phoneList.add(new PhoneNumber("nguyen van an","annv@gmail.com"));
        launch(args);
    }

}
