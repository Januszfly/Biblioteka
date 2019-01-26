package Main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }




    @Override
    public void start(Stage primaryStage) throws Exception{

        FXMLLoader loader= new FXMLLoader(this.getClass().getResource("../fxml/BorderPaneMain.fxml"));
        ResourceBundle bundle=ResourceBundle.getBundle("bundles.messages");
        loader.setResources(bundle);

        BorderPane borderPane=loader.load();
        Scene scene =new Scene(borderPane);

        primaryStage.setTitle(bundle.getString("tittle.application"));
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}