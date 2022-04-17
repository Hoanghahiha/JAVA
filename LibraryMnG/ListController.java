package LibraryMnG;

import javafx.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class ListController {
    public void formScreen() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("listBook.fxml"));
        Main.rootStage.setScene(new Scene(root,800,600));
    }
}
