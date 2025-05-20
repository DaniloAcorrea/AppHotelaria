package view;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.image.Image;import javafx.scene.image.ImageView;
import view.components.PenelButton;
import view.components.Sidebar;


public class CadCliente  extends Application{


    public static void main(String[] args) {
       launch(args);//inicializa o JAVAFX

    }
    @Override
    public void start(Stage janela) throws Exception  {
        PenelButton penel = new PenelButton();

        Sidebar menu = new Sidebar();

        //Criaçao de um container principal MainPane
        BorderPane mainPane = new BorderPane();
        mainPane.setLeft(menu);

        //carregar imagem
        Image imgLogo = new Image(getClass().getResourceAsStream
                ("/view/resources/img/Logo.png"));

        Image imgUserBlack = new Image(getClass().getResourceAsStream
                ("/view/resources/img/imgUserBlack.png"));




        //Inserir imagem em container para manipilar tamanho/rendimensionamento

        ImageView ImgUserBlack = new ImageView(imgUserBlack);
        ImgUserBlack.setFitWidth(20);
        ImgUserBlack.setFitHeight(20);

        //titulo
        Label lblTitulo = new Label("Cadastro de Cliente");
        lblTitulo.setAlignment(Pos.CENTER);
        lblTitulo.setStyle("-fx-font-size: 18px; -fx-font-weight: bold"); //tamanho da fonte e cor/negrito



        HBox tituloBox = new HBox(ImgUserBlack, lblTitulo);
        tituloBox.setAlignment(Pos.CENTER);
        tituloBox.setSpacing(10); //Espaço
        tituloBox.setPadding(new Insets (20,20,20,20)); //Espaçamento
        tituloBox.setAlignment(Pos.CENTER);

        Label lblNome = new Label("NOME: ");
        TextField txtNome = new TextField();
        txtNome.setMaxWidth(200);

        Label lblCpf = new Label("CPF: ");
        TextField txtCpf = criarMascaraCampo("###.###.###-##");
        txtCpf.setMaxWidth(200);


        Label lblEmail = new Label("EMAIL: ");
        TextField txtEmail = new TextField();
        txtEmail.setMaxWidth(200);

        ComboBox<String> boxEmail = new ComboBox<>();
        boxEmail.getItems().addAll("@gmail.com", "@outlook.com", "@hotmail.com", "@icloud.com");
        boxEmail.setPromptText("Selecione:");

        Label lblTelefone = new Label("TELEFONE: ");
        TextField txtTelefone = criarMascaraCampo("(##) #####-####");
        txtTelefone.setMaxWidth(200);


        ComboBox<String> boxTelefone = new ComboBox<>();
        boxTelefone.getItems().addAll("(__)___-___");


        GridPane FormGrid = new GridPane();
        FormGrid.add(txtNome, 1, 0);
        FormGrid.add(lblNome, 0, 0);

        FormGrid.add(txtCpf, 1, 1);
        FormGrid.add(lblCpf, 0, 1);

        FormGrid.add(txtTelefone, 1, 3);
        FormGrid.add(lblTelefone, 0, 3);

        FormGrid.add(txtEmail, 1, 2);
        FormGrid.add(lblEmail, 0, 2);
        FormGrid.add(boxEmail, 2, 2); //Selecionar
        FormGrid.setPadding(new Insets(20,20,20,20));

        FormGrid.setAlignment(Pos.CENTER);//Centraliza os elementos
        FormGrid.setHgap(10); // Espaço/Lacuna Horizontal
        FormGrid.setVgap(10); // Espaço/Lacuna Vertical



        //botao so de imagem
        //btnCadastrar.setGraphic(icon);


        VBox layout = new VBox(10,tituloBox,FormGrid, penel); //Layout inteiro
        layout.setAlignment(Pos.CENTER);
        mainPane.setCenter(layout);


        Scene scene = new Scene(mainPane, 650, 500);
        janela.setTitle("Grand hotel"); //Titulo da janela

        //icone da janela

        janela.getIcons().add(imgLogo);
        janela.setScene(scene);
        janela.setResizable(false); //impede ela de redimencionar
        janela.show();
    }


    //Metodo para criar um campo de texto com mascara
    private TextField criarMascaraCampo(String mascara) {
        TextField txtMascara = new TextField();
        txtMascara.textProperty().addListener((observable, oldValue, newValue) ->
        {
            String value = newValue.replaceAll("[^0-9]", "");
            StringBuilder formatacaoCampo = new StringBuilder();
            int index = 0;
            for (char caracter : mascara.toCharArray()) {
                if (caracter == '#') {
                    if (index < value.length()) {
                        formatacaoCampo.append(value.charAt(index));
                        index++;
                    }
                    else {
                        break;
                    }
                }
                else {
                    formatacaoCampo.append(caracter);
                }
            }
            txtMascara.setText(formatacaoCampo.toString());
        });
        return txtMascara;
    }
// the movie database
}
