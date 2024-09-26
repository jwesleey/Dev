package org.example.demo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.TextFieldTableCell;


public class Test {

    @FXML
    private TableView<User> table;

    @FXML
    private TableColumn<User, String> tableUsers;

    @FXML
    private TextField emailAluno;

    @FXML
    private Button addAluno;

    private ObservableList<User> users;

    public void initialize() {
        users = FXCollections.observableArrayList();

        // Configurando a coluna para exibir os nomes dos alunos
        tableUsers.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
        tableUsers.setCellFactory(TextFieldTableCell.forTableColumn());

        /*Permitindo edição dos nomes
        tableUsers.setOnEditCommit(event -> {
            User user = event.getRowValue();
            user.setName(event.getNewValue());
        });*/

        // Adicionando alunos ao clicar no botão
        addAluno.setOnAction(event -> addAluno());

        // Configurar a tabela para aceitar a lista de usuários
        table.setItems(users);
    }

    private void addAluno() {
        String email = emailAluno.getText();
        if (email != null && !email.isEmpty()) {
            users.add(new User(email));  // Adiciona o novo aluno à lista
            emailAluno.clear();           // Limpa o campo de entrada
        }
    }
}
