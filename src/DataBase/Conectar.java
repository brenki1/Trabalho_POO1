package DataBase;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conectar {
    public static void main(String[] args) {
        Connection connection = null;

        try{
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/TrabalhoPOO", "postgres", "udidecola");
            if(connection != null){
                System.out.println("Conexão realizada com sucesso");
            }
            else{
                System.out.println("Conexão falhou");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }

}
