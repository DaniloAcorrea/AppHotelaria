package util;

import java.sql.Connection;

public class testeConexao {
    public static void main(String[] args) {
        Conexao conexaoDB = new Conexao();
        Connection conexao = conexaoDB.conectar();
        if(conexao != null){
            System.out.printf("conexão realizada com sucesso");
            try{
                conexao.close();
                System.out.printf("conexão encerrada");

            }catch (Exception erro){
                System.out.println("Erro ao encerrar a conexão"+ erro) ;
            }
        }else {
            System.out.printf("erro ao conectar");
        }
    }

}
