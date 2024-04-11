package DataBase;
import java.sql.Connection;
import java.sql.Statement;

import Classes.*;

public class CriarTabela {

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;

                Conectar obj_Conectar = new Conectar();

        connection = obj_Conectar.get_connection();


        try{

            String query = "create table cliente(sl_no SERIAL primary key, nome varchar(200), dataNas varchar(200), CPF varchar(200), endereco varchar(200), dataCad varchar(200), email varchar(200))";
            statement = connection.createStatement();
            statement.executeUpdate(query);

        }catch(Exception e){
            System.out.println(e);
        }
    }
}
