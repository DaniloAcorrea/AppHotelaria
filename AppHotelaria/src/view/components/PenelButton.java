package view.components;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

public class PenelButton extends HBox {

    public PenelButton() {
        Image iconBtnCadastrar = new Image(getClass().getResourceAsStream
                ("/view/resources/img/adicionar.png"));
        Image iconBtnAtualizar = new Image(getClass().getResourceAsStream
                ("/view/resources/img/sincronizar.png"));
        Image iconBtnExcluir = new Image(getClass().getResourceAsStream
                ("/view/resources/img/delet.png"));


        ImageView icon1 = new ImageView(iconBtnCadastrar);
        icon1.setFitWidth(20); //Definição de Largura
        icon1.setFitHeight(20);// Definição de altura
        icon1.setOpacity(1); //Definição de opacidade: 0.0 - invisível / 1.0 - opaco

        Button btnCadastrar = new Button("Cadastrar ", icon1);
        btnCadastrar.setStyle("-fx-background-color: #b3df9e "); //Cor do fundo do botao



        ImageView icon2 = new ImageView(iconBtnAtualizar);
        icon2.setFitWidth(20); //Definição de Largura
        icon2.setFitHeight(20);// Definição de altura
        icon2.setOpacity(1); //Definição de opacidade: 0.0 - invisível / 1.0 - opaco

        Button btnAtualizar = new Button("Atualizar ", icon2);
        btnAtualizar.setStyle("-fx-background-color: #b3df9e ");

        ImageView icon3 = new ImageView(iconBtnExcluir);
        icon3.setFitWidth(20);
        icon3.setFitHeight(20);
        icon3.setOpacity(1);

        Button btnExcluir = new Button("Excluir", icon3);
        btnExcluir.setStyle("-fx-background-color: #fa7574 ");


        setAlignment(Pos.CENTER);
        setSpacing(10);


        getChildren().addAll(btnCadastrar, btnAtualizar, btnExcluir);

    }
}
