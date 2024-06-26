package DataBase;
import Classes.Cliente;

import java.sql.Connection;
import java.sql.Statement;

public class EditaTabela {

    public static void inserir(Cliente cliente) {
        Connection connection = null;
        Statement statement = null;
        Conectar obj_Conectar = new Conectar();
        connection = obj_Conectar.get_connection();
        try{
            String query = "insert into cliente(nome, dataNas, CPF, endereco, dataCad, email) values('"+cliente.getNome()+"', '"+cliente.getDataNascimento()+"', '"+cliente.getCPF()+"', '"+cliente.getEndereco()+"', '"+cliente.getDataCad()+"', '"+cliente.getEmail()+"')";
            statement = connection.createStatement();
            statement.executeUpdate(query);
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public static void deletar(String CPF) {
        Connection connection = null;
        Statement statement = null;
        Conectar obj_Conectar = new Conectar();
        connection = obj_Conectar.get_connection();
        try{
            String query = "delete from cliente where CPF = '"+CPF+"'";
            statement = connection.createStatement();
            statement.executeUpdate(query);
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public static void atualizar(Cliente cliente) {
        Connection connection = null;
        Statement statement = null;
        Conectar obj_Conectar = new Conectar();
        connection = obj_Conectar.get_connection();
        try{
            String query = "update cliente set nome = '"+cliente.getNome()+"', dataNas = '"+cliente.getDataNascimento()+"', endereco = '"+cliente.getEndereco()+"', dataCad = '"+cliente.getDataCad()+"', email = '"+cliente.getEmail()+"' where CPF = '"+cliente.getCPF()+"'";
            statement = connection.createStatement();
            statement.executeUpdate(query);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
