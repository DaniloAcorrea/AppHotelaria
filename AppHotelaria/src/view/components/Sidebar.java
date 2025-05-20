package view.components;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;



public class Sidebar extends VBox {
    public Button btnCliente = new Button("Clientes");
    public Button btnFuncionarios = new Button("Funcionarios");
    public Button btnReserva = new Button("Reserva");
    public Button btnRelatorio = new Button("Relatorio");
    public Button btnQuarto = new Button("Quartos");


    public Sidebar() {

        Image iconFuncionario = new Image(getClass().getResourceAsStream
                ("/view/resources/img/icon-funcionario.png"));
        Image iconCliente = new Image(getClass().getResourceAsStream
                ("/view/resources/img/icon-cliente.png"));
        Image iconQuarto = new Image(getClass().getResourceAsStream
                ("/view/resources/img/icon-quarto.png"));
        Image iconReserva = new Image(getClass().getResourceAsStream
                ("/view/resources/img/icon-reserva.png"));
        Image iconRelatorio = new Image(getClass().getResourceAsStream
                ("/view/resources/img/icon-relatorio.png"));

        //criando a fonte
        Font fontRegular = Font.loadFont(getClass().getResourceAsStream("/view/resources/fontes/RobotoMono-Bold.ttf"), 14);

        Font fontNegrito = Font.loadFont(getClass().getResourceAsStream("/view/resources/fontes/RobotoMono-Italic.ttf"), 15);


        ImageView viewiconFuncionario = new ImageView(iconFuncionario);
        viewiconFuncionario.setFitHeight(20);
        viewiconFuncionario.setFitWidth(20);

        ImageView viewiconCliente = new ImageView(iconCliente);
        viewiconCliente.setFitHeight(20);
        viewiconCliente.setFitWidth(20);

        ImageView viewiconQuarto = new ImageView(iconQuarto);
        viewiconQuarto.setFitHeight(20);
        viewiconQuarto.setFitWidth(20);

        ImageView viewiconReserva = new ImageView(iconReserva);
        viewiconReserva.setFitHeight(20);
        viewiconReserva.setFitWidth(20);

        ImageView viewiconRelatorio = new ImageView(iconRelatorio);
        viewiconRelatorio.setFitHeight(20);
        viewiconRelatorio.setFitWidth(20);

        //estilização do botões (fundo transparentes)
        String styleButton = "-fx-background-color: transparent;" +
                            "-fx-border-color: transparent;" +
                            "-fx-graphic-text-gap: 10px;"+
                            "-fx-alignment: center;" +
                            "-fx-cursor: hand;";

        btnFuncionarios.setStyle(styleButton);
        btnQuarto.setStyle(styleButton);
        btnReserva.setStyle(styleButton);
        btnCliente.setStyle(styleButton);
        btnRelatorio.setStyle(styleButton);
        btnFuncionarios.setGraphic(viewiconFuncionario);
        btnCliente.setGraphic(viewiconCliente);
        btnQuarto.setGraphic(viewiconQuarto);
        btnReserva.setGraphic(viewiconReserva);
        btnRelatorio.setGraphic(viewiconRelatorio);


        //obijetivo: ao passar o mouse, trocar cor de fundo e borda transparente
        btnFuncionarios.setOnMouseEntered(event ->
                btnFuncionarios.setStyle(styleButton.replace("transparent", "blue")));


        btnFuncionarios.setOnMouseExited(event -> btnFuncionarios.setStyle(styleButton));

        //quarto
        btnQuarto.setOnMouseEntered(event -> btnQuarto.setStyle(styleButton.replace("transparent", "blue")));
                btnQuarto.setOnMouseExited(event -> btnQuarto.setStyle(styleButton));

        btnQuarto.setOnMouseExited(event -> btnQuarto.setStyle(styleButton));
        //reserva
        btnReserva.setOnMouseEntered(event -> btnReserva.setStyle(styleButton.replace("transparent", "blue")));
                       btnReserva.setOnMouseExited(event -> btnReserva.setStyle(styleButton));

         btnReserva.setOnMouseExited(event -> btnReserva.setStyle(styleButton));

         btnCliente.setOnMouseEntered(event -> btnCliente.setStyle(styleButton.replace("transparent", "blue")));
                            btnCliente.setOnMouseExited(event -> btnCliente.setStyle(styleButton));

            btnCliente.setOnMouseExited(event -> btnCliente.setStyle(styleButton));

            btnRelatorio.setOnMouseEntered(event -> btnRelatorio.setStyle(styleButton.replace("transparent", "blue")));
                            btnRelatorio.setOnMouseExited(event -> btnRelatorio.setStyle(styleButton));
            btnRelatorio.setOnMouseExited(event -> btnRelatorio.setStyle(styleButton));





        setSpacing(15);
        setPadding(new Insets(20));
        setStyle("-fx-background-color: #f0f0f0");

        Label lblMenu = new Label("Grand Hotel");
        lblMenu.setStyle("-fx-text-fill: blue");


        lblMenu.setFont(Font.font(fontRegular.getFamily(), 28));

        setStyle("-fx-background-color: #d6d6d6; -fx-padding: 48px;");

        /*btnCliente.setMaxWidth(Double.MAX_VALUE);
        btnRelatorio.setMaxWidth(Double.MAX_VALUE);
        btnReserva.setMaxWidth(Double.MAX_VALUE);
        btnQuarto.setMaxWidth(Double.MAX_VALUE);*/

        getChildren().addAll(lblMenu, btnCliente, btnFuncionarios, btnQuarto, btnReserva, btnRelatorio);

    }

}
