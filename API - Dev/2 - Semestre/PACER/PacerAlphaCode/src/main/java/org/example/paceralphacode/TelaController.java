package org.example.paceralphacode;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class TelaController {

    @FXML
    private Label Pacer;

    @FXML
    private Label checkEmailSenha;

    @FXML
    private Button btn;

    @FXML
    private ImageView fatec;

    @FXML
    private Hyperlink forgotPassword;

    @FXML
    private TextField idEmail;

    protected void idEmail() {
        idEmail.setText("professor@fatec.sp.gov.br");
    }

    @FXML
    private PasswordField idSenha;

    protected void idSenha() {
        idSenha.setText("acessoprofessor");
    }


    @FXML
    private AnchorPane login;

    @FXML
    private void onButtonClick() throws IOException {
        if (idEmail.getText().equals("professor@fatec.sp.gov.br") && idSenha.getText().equals("acessoprofessor")) {

            FXMLLoader fxmlLoader = new FXMLLoader(ExecuteApplication.class.getResource("Interface.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage newstage = new Stage();
            newstage.setTitle("Home PACER");
            newstage.setScene(scene);
            newstage.setMaximized(true);
            newstage.show();

            Stage stage = (Stage) login.getScene().getWindow();
            stage.close();

        } else if (idEmail.getText().equals("professor@fatec.sp.gov.br") != idSenha.getText().equals("acessoprofessor")) {
            checkEmailSenha.setText("E-mail ou Senha incorreta, tente novamente.");
            checkEmailSenha.setVisible(true);
        } else if (idEmail.getText().isEmpty() || idSenha.getText().isEmpty() || idEmail.getText().equals("") || idSenha.getText().equals("")) {
            checkEmailSenha.setText("Preencha E-mail e Senha, tente novamente.");
            checkEmailSenha.setVisible(true);
        }
    }
}