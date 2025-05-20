package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.application.Application;
import view.components.PenelButton;
import view.components.Sidebar;

public class CadUsuario extends Application {
    public static void main(String[] args) {launch(args);}

    //Layout inteiro
    public void start(Stage janela) throws Exception {

        PenelButton button = new PenelButton();


        Sidebar menu = new Sidebar();
        BorderPane mainPane = new BorderPane();
        mainPane.setLeft(menu);

        Label lblNome = new Label("Insira seu nome: ");
        TextField txtNome = new TextField();

        Label lblEmal = new Label("E-mail: ");
        TextField txtEmail = new TextField();

        Label lblSetor = new Label("informe seu setor: ");

        ComboBox<String> BoxSetor = new ComboBox<>();
        BoxSetor.setPromptText("Selecione:");

        BoxSetor.getItems().addAll("TI", "Segurança", "Cozinha", "Teste", "Adimin", "Foger");


        GridPane FormGrid = new GridPane();
        FormGrid.add(txtNome, 1, 0);
        FormGrid.add(lblNome, 0, 0);

        FormGrid.add(txtEmail, 1, 1);
        FormGrid.add(lblEmal, 0, 1);

        FormGrid.add(BoxSetor, 1, 3);
        FormGrid.add(lblSetor, 0, 3);
        FormGrid.setPadding(new Insets(20,20,20,20));

        FormGrid.setHgap(10);
        FormGrid.setVgap(10);
        FormGrid.setAlignment(Pos.CENTER);

        FormGrid.add(button, 1, 4);

        StackPane layoutImg = new StackPane();
        layoutImg.setStyle("-fx-background-image: url('/view/resources/img/');-fx-background-repeat: stretch; -fx-background-size: cover;");




       //Layout inteiro
        VBox layout = new VBox(10, FormGrid);
        layout.setAlignment(Pos.CENTER);
        mainPane.setCenter(layout);
        mainPane.setCenter(layoutImg);
        layoutImg.getChildren().add(layout);

       Scene scene = new Scene(mainPane, 750, 400);
        janela.setTitle("Hotel ibis");
        janela.setScene(scene);
        janela.show();
    }
}
