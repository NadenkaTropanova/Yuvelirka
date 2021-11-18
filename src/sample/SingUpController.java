package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SingUpController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField SingUpName;

    @FXML
    private TextField SingUpLastname;

    @FXML
    private TextField loginField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private CheckBox CheckBoxMan;

    @FXML
    private CheckBox CheckBoxWoman;

    @FXML
    private Button authSingButton;

    @FXML
    void initialize() {

    }
}
