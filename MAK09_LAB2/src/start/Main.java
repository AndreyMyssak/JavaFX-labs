package start;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/main.fxml"));


        primaryStage.setTitle("Создание простейшей визуальной программы на Java");
        primaryStage.setScene(new Scene(root, 600, 223));
        primaryStage.setResizable(false);
        primaryStage.getIcons().add(new Image("/images/logo.png"));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
