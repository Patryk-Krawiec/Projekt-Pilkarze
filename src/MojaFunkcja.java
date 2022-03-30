//Projekt: Patryk Krawiec, lab3

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MojaFunkcja {

    public static int countData(String tableName) { //metoda z zwróceniem stanu "licznik" i wywołana w "LogowanieForm"
        int licznik = 0;    //inicjalizuje zmienna licznik i ustawia wartosc 0
        Connection con = Logowanie.getConnection();
        Statement st;   //obiekt przechowujacy instrukcje SQL
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(*) AS 'licznik' FROM " + tableName); //wykonuje zapytanie i zwraca do resultset'a
            while (rs.next()) {
                licznik = rs.getInt(1); //pobiera w kolejnym kroku wartosc na indexie 1 i przypisuje do "licznik" 
            }
        } catch (SQLException ex) { //wylapanie wyjatku
            Logger.getLogger(MojaFunkcja.class.getName()).log(Level.SEVERE, null, ex);
        }

        return licznik; //zwraca licznik
    }
}
