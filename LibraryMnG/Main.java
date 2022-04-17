package LibraryMnG;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main extends Application {
    public final static String connectionString = "jdbc:mysql://localhost:3306/T2108M";
    public final static String user = "root";
    public final static String password = "";

    public static Stage rootStage;
    @Override
    public void start(Stage primaryStage) throws Exception{
        rootStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("formQL.fxml"));
        primaryStage.setTitle("QUAN LY THU VIEN");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }


    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //tao connect
            Connection conn = DriverManager.getConnection(connectionString,user,password);
            //khai bao statement de truy van sql
            Statement stt = conn.createStatement();
            //Truy van sql
            String txt_sql = "select * from sach";
            ResultSet rss = stt.executeQuery(txt_sql);

            while (rss.next()){
                System.out.println(rss.getInt("masach"));
                System.out.println(rss.getString("tensach"));
                System.out.println(rss.getString("nhaxb"));
            }

//                String insert_sql = "insert into sach(masach,tensach,nhaxb) values(123,'Kinh Thanh','Kim Dong')";
//                stt.execute(insert_sql);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        launch(args);
    }
}
