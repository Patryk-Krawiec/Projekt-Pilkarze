//Projekt: Patryk Krawiec, lab3

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Pilkarz {

    public void insertUpdateDeletePilkarz(char operation, Integer id, String imie, String nazwisko, String noga, String data, String waga, String wzrost) { //metoda zwracajaca oper., id, itd.
        Connection con = Logowanie.getConnection();
        PreparedStatement ps;

        if (operation == 'i')   //jezeli wywolana operacja to i (czyli insert) wykonuje
        {
            try {
                ps = con.prepareStatement("INSERT INTO pilkarze (Imie, Nazwisko, Lepsza_noga, Data_urodzenia, Waga, Wzrost) VALUES (?,?,?,?,?,?)"); //zapytanie do sql
                ps.setString(1, imie);  //"wysyla" zmienna string imie o indeksacji 1
                ps.setString(2, nazwisko);
                ps.setString(3, noga);
                ps.setString(4, data);
                ps.setString(5, waga);
                ps.setString(6, wzrost);

                if (ps.executeUpdate() > 0) {   //jezeli dana instrukcja zapytania do SQL sie wykonala wyrzuca okno dialogowe
                    JOptionPane.showMessageDialog(null, "Nowy pilkarz dodany");
                }
            } catch (SQLException ex) { //wyjatek
                Logger.getLogger(Pilkarz.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (operation == 'u') { //operacja update
            try {
                ps = con.prepareStatement("UPDATE `pilkarze` SET `Imie`= ?, `Nazwisko`= ?, `Lepsza_noga`= ?, `Data_urodzenia`= ?, `Waga`= ?, `Wzrost`= ? WHERE `Id`= ?");
                ps.setString(1, imie);
                ps.setString(2, nazwisko);
                ps.setString(3, noga);
                ps.setString(4, data);
                ps.setString(5, waga);
                ps.setString(6, wzrost);
                ps.setInt(7, id);

                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Baza pilkarzy zaktualizowana");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Pilkarz.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (operation == 'd') { //operacja delete
            try {
                ps = con.prepareStatement("DELETE FROM `pilkarze` WHERE `Id` = ?");
                ps.setInt(1, id);  

                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Pilkarz usuniety!");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Pilkarz.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void fillPilkarzJtable(JTable table, String valueToSearch) { //metoda wyszukania "String'u" w tabeli
        Connection con = Logowanie.getConnection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM `pilkarze` WHERE CONCAT(`Imie`, `Nazwisko`, `Wzrost`)LIKE ?"); //zapytanie do SQL
            ps.setString(1, "%" + valueToSearch + "%"); //"valueToSearch" - wartosc, której szukamy opisana "%", gdyż w ten sposób SQL wyznacza text, którego szukamy

            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();

            Object[] row;   //tworzymy obiekt z tablica jednowymiarowa
            while (rs.next()) {
                row = new Object[7];
                row[0] = rs.getInt(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                row[6] = rs.getInt(7);

                model.addRow(row);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Pilkarz.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
