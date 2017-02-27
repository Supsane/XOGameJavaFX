package XOJavaFX.ru.geekbrains.Model;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

//http://code.makery.ch/library/javafx-8-tutorial/ru/

public class MainWindow extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../View/mainWindow.fxml"));
        primaryStage.setTitle("XOGameJavaFX");
        primaryStage.setScene(new Scene(root, 500, 500));
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
