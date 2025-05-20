package util;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

import static java.lang.Class.forName;

public class Conexao {

    private String Driver = "com.mysql.cj.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/apphotelaria";
    private String user = "dbaHotel";
    private String password = "dbaHotel123";

    public Connection conectar() {

        Connection condb = null;
        try {
            //especificar a rota do drive a ser carregada (jdbc para sgbd mysql)
            class.forName(Driver);

            condb = DriverManager.getConnection(url, user, password);
            return condb;

    /*iniciar o drive ja carregado
    por meio do metodo gatConection(ip, porta,
     nome do banco, Usuario, senha)
     */
            DriverManager.getConnection("jdc:mysql//127.0.0.1:3306/apphotelaria", "dbaHotel", "dbaHotel123");
        } catch (SQLException erro) {
            System.out.print("Erro ao conectar ao banco de dados" + erro);
            return null;
        } catch (ClassNotFoundException e) {

        }

    }
}
