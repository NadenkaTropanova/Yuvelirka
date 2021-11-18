package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.cef.SystemBootstrap;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField loginField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button authSingButton;

    @FXML
    private Button loginSingUpButton;

    @FXML
    void initialize() {
        authSingButton.setOnAction(event {
            String loginText = loginField.getText().trim();
            String loginPassword = passwordField.getText().trim();

            if (!loginText.equals("")&& !loginPassword.equals("")) {
        loginUser(loginText,loginPassword);
            else
                System.out.println("Введите логин и пароль");
            })
        loginSingUpButton.setOnAction(event {
            loginSingUpButton.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/singUp.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
                Parent root = loader.getRoot();
                Stege stage = new Stage();
                stage.setScene(newScene(root));
                stage.showAngWait();
        });
    }
}

    private void loginUser(String loginText, String loginPassword) {

    }
}
