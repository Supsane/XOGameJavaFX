package sample.mainWindow;

import javafx.event.ActionEvent;
import sample.optionsWindow.WindowOptions;

public class ControllerMainWindow {

    public void clickOnExit(ActionEvent actionEvent) {
        System.exit(0);
    }

    public void newGame(ActionEvent actionEvent) {

    }

    public void options(ActionEvent actionEvent) {
        new WindowOptions();
    }

    public void help(ActionEvent actionEvent) {
    }

    public void about(ActionEvent actionEvent) {
    }
}
