package DataBase;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conectar {


    public Connection get_connection() {
        Connection connection = null;
        String url = "jdbc:postgresql://localhost:5432/TrabalhoPOO";
        String user = "postgres";
        String password = "udidecola";


        try{
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, user, password);
            if(connection != null){
                System.out.println("Conexão realizada com sucesso");
            }
            else{
                System.out.println("Conexão falhou");
            }
        }catch (Exception e){
            System.out.println(e);
        }

        return connection;
    }

}
