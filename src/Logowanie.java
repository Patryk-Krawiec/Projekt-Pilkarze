//Projekt: Patryk Krawiec, lab3

import java.sql.Connection;
import java.sql.DriverManager;

public class Logowanie {

    public static Connection getConnection() //metoda z proba nawiazania polaczenia z ponizszym adresem bazy
    {
        Connection con = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/pilkarze", "root", "");
        } catch (Exception ex) {    //wylapanie wyjatku
            System.out.println(ex.getMessage());
        }

        return con;
    }
}
