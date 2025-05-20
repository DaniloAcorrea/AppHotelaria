package view;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

import javafx.stage.Stage;


public class CadLogin extends Application {

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("Login");

        // Left side with image
        ImageView imageView = new ImageView(new Image("/view/resources/img/piscina-hardman-praia-joao-pessoa.jpg"));
        imageView.setFitWidth(550);
        imageView.setFitHeight(600);

        // Right side with login form
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Label titulo = new Label("Faça seu Login");
        titulo.setStyle("-fx-font-size: 20px; -fx-font-weight: bold");
        grid.add(titulo, 0, 0, 2, 1);
        titulo.setAlignment(Pos.CENTER);
        titulo.setPadding(new Insets(0, 0, 20, 0));
        titulo.setMinWidth(200);
        titulo.setMaxWidth(200);

        TextField emailField = new TextField();
        emailField.setPromptText("example@domain.com");
        emailField.setAlignment(Pos.CENTER);
        emailField.setMinWidth(200);
        emailField.setMaxWidth(200);
        emailField.setAlignment(Pos.CENTER);
        grid.add(emailField, 1, 1);

        PasswordField passwordField = new PasswordField();
        TextField visiblePasswordField = new TextField();
        passwordField.setPrefColumnCount(10);
        passwordField.setAlignment(Pos.CENTER);
        passwordField.setMinWidth(200);
        passwordField.setMaxWidth(200);
        passwordField.setAlignment(Pos.CENTER);
        passwordField.setPromptText("********");
        grid.add(passwordField, 1, 2);


        visiblePasswordField.setPrefColumnCount(10);
        visiblePasswordField.setAlignment(Pos.CENTER);
        visiblePasswordField.setMinWidth(200);
        visiblePasswordField.setMaxWidth(200);
        visiblePasswordField.setPromptText("********");
        visiblePasswordField.setManaged(false);
        visiblePasswordField.setVisible(false);

        Button toggleButton = new Button();
        ImageView eyeIconInvisible = new ImageView(new Image(getClass().getResourceAsStream("/view/resources/img/invisivel.png")));
        ImageView eyeIconVisible = new ImageView(new Image(getClass().getResourceAsStream("/view/resources/img/olho-meio-aberto.png")));
        eyeIconInvisible.setFitHeight(20);
        eyeIconInvisible.setFitWidth(20);
        eyeIconVisible.setFitHeight(20);
        eyeIconVisible.setFitWidth(20);
        toggleButton.setGraphic(eyeIconInvisible);
        toggleButton.setStyle("-fx-background-color: transparent;");
        toggleButton.setOnMouseEntered(e -> toggleButton.setGraphic(eyeIconVisible));
        toggleButton.setOnMouseExited(e -> toggleButton.setGraphic(eyeIconInvisible));

        toggleButton.setOnAction(e -> {
            if (passwordField.isVisible()) {
                visiblePasswordField.setText(passwordField.getText());
                passwordField.setManaged(false);
                passwordField.setVisible(false);
                visiblePasswordField.setManaged(true);
                visiblePasswordField.setVisible(true);
            } else {
                passwordField.setText(visiblePasswordField.getText());
                passwordField.setManaged(true);
                passwordField.setVisible(true);
                visiblePasswordField.setManaged(false);
                visiblePasswordField.setVisible(false);
            }
        });

        HBox passwordBox = new HBox(5);
        passwordBox.setAlignment(Pos.CENTER);
        passwordBox.getChildren().addAll(passwordField, visiblePasswordField, toggleButton);
        grid.add(passwordBox, 1, 2);


        Button loginButton = new Button("Login");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.CENTER);
        hbBtn.getChildren().add(loginButton);
        grid.add(hbBtn, 1, 4);
        loginButton.setPrefWidth(170);
        loginButton.setPrefHeight(30);
        loginButton.setStyle("-fx-background-color: #0066ff; -fx-text-fill: #ffffff; -fx-background-radius: 50");
        loginButton.setOnMouseEntered(e ->
                loginButton.setStyle("-fx-background-color: transparent , #064ad6; -fx-cursor: hand; -fx-background-radius: 50"));
        loginButton.setOnMouseClicked(e -> {
            if (emailField.getText().equals("Danilo@gmail.com") && passwordField.getText().equals("123")) {
                primaryStage.close();
            } else {
                System.out.println("Email ou senha incorretos");
            }
        });
        loginButton.setOnMouseExited(e -> loginButton.setStyle("-fx-background-color: #0066ff; -fx-text-fill: #ffffff; -fx-background-radius: 50"));

        // Main layout
        BorderPane borderPane = new BorderPane();
        borderPane.setLeft(imageView);
        borderPane.setCenter(grid);

        Scene scene = new Scene(borderPane, 1000, 600);
        primaryStage.getIcons().add(new Image("/view/resources/img/Logo.png"));
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}

