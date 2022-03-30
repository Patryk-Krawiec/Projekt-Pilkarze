//Projekt: Patryk Krawiec, lab3

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DodajPilkarzaForm extends javax.swing.JFrame {

    Pilkarz pil = new Pilkarz();

    public DodajPilkarzaForm() {
        initComponents();
        ButtonGroup bg = new ButtonGroup(); //tworzy obiekt klasy ButtonGroup, która powoduje wyłączenie wszystkich butt. jeżeli jeden jest włączony
        bg.add(jRadioButton_Lewa);  //dodanie buttonu do obiektu "bg"
        bg.add(jRadioButton_Prawa);
        jRadioButton_Lewa.setSelected(true);    //ustawia button jako zaznaczony
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_Nazwisko = new javax.swing.JTextField();
        jTextField_Wzrost = new javax.swing.JTextField();
        jTextField_Imie = new javax.swing.JTextField();
        jDateChooser_Data = new com.toedter.calendar.JDateChooser();
        jButtonCancelButton = new javax.swing.JButton();
        jButtonAddButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jComboBox_Waga = new javax.swing.JComboBox<>();
        jRadioButton_Lewa = new javax.swing.JRadioButton();
        jRadioButton_Prawa = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Dodawanie piłkarza");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Imie:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Nazwisko:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Data urodzenia:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Waga:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("Wzrost:");

        jTextField_Wzrost.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_WzrostKeyTyped(evt);
            }
        });

        jButtonCancelButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonCancelButton.setText("Anuluj");
        jButtonCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelButtonActionPerformed(evt);
            }
        });

        jButtonAddButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonAddButton1.setText("Dodaj");
        jButtonAddButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddButton1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("Lepsza noga:");

        jComboBox_Waga.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "40 - 50 kg", "51 - 60 kg", "61 - 70 kg", "71 - 80 kg", "81 - 90 kg", "91 - 100 kg", "101 - 110 kg", "111 - 120 kg" }));

        jRadioButton_Lewa.setText("Lewonożny");

        jRadioButton_Prawa.setText("Prawonożny");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_Wzrost, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonCancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonAddButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(jLabel5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser_Data, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Imie, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_Waga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jRadioButton_Lewa)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRadioButton_Prawa))
                                .addComponent(jTextField_Nazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel1)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_Imie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Nazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jRadioButton_Lewa)
                    .addComponent(jRadioButton_Prawa))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDateChooser_Data, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox_Waga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField_Wzrost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAddButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(103, 103, 103))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelButtonActionPerformed
        this.dispose(); //zamyka po kliknieciu przycisku
    }//GEN-LAST:event_jButtonCancelButtonActionPerformed

    private void jTextField_WzrostKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_WzrostKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) //petla sprawdzajaca czy wpisany znak jest cyfra
        {
            evt.consume();  //pobiera znaki wpisane
        }
    }//GEN-LAST:event_jTextField_WzrostKeyTyped
    public boolean sprawdzText() //metoda sprawdzajaca poprawnosc uzupelnienia pol
    {
        if (jTextField_Imie.getText().equals("") || jTextField_Nazwisko.getText().equals("") || jTextField_Wzrost.getText().equals("") || jDateChooser_Data.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Pola tekstowe nie moga zostac puste!");    //wyswietla okno dialogowe
            return false;
        } else if (jDateChooser_Data.getDate().compareTo(new Date()) > 0) //petla sprawdzajaca czy nie wybrano daty urodzenia z przyszlosci, porownujac date wybrana do daty aktualnej "Date"
        {
            JOptionPane.showMessageDialog(null, "Nie wybieraj daty urodzenia z przyszlosci!");
            return false;
        } else {
            return true;    //jezeli warunki spelnione zwraca "true"
        }

    }

    private void jButtonAddButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddButton1ActionPerformed
        String imie = jTextField_Imie.getText();    //pobiera text do zmiennej
        String nazwisko = jTextField_Nazwisko.getText();
        String noga = "Lewa";   //ustawia zmienna na wartosc "Lewa"
        if (jRadioButton_Prawa.isSelected()) //petla warunkowa, jezeli jRB_Prawa jest zaznaczony to ustawia zmienna na "Prawa"
        {
            noga = "Prawa";
        }
        if (sprawdzText()) //petla warunkowa korzystajaca z metody sprawdzajacej pola
        {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");   //tworzy obiekt
            String data = dateFormat.format(jDateChooser_Data.getDate());
            String waga = jComboBox_Waga.getSelectedItem().toString();
            String wzrost = jTextField_Wzrost.getText();
            Pilkarz pil = new Pilkarz();    //tworzy obiekt z klasy Pilkarz
            pil.insertUpdateDeletePilkarz('i', null, imie, nazwisko, noga, data, waga, wzrost); //korzysta z metody w klasie pilkarz i "wysyla" do niej wartosci zmiennych
            GlownyForm.jLabel_Count.setText("Liczba piłkarzy: " + Integer.toString(MojaFunkcja.countData("pilkarze")));  //sprawdza licznik pilkarzy po dodaniu

            MenadzerPilkarzForm.jTable1.setModel(new DefaultTableModel(null, new Object[]{"Id", "Imie", "Nazwisko", "Lepsza_noga", "Data_urodzenia", "Waga", "Wzrost"}));   
            pil.fillPilkarzJtable(MenadzerPilkarzForm.jTable1, "");
        }
    }//GEN-LAST:event_jButtonAddButton1ActionPerformed


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DodajPilkarzaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DodajPilkarzaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DodajPilkarzaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DodajPilkarzaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DodajPilkarzaForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddButton1;
    private javax.swing.JButton jButtonCancelButton;
    private javax.swing.JComboBox<String> jComboBox_Waga;
    private com.toedter.calendar.JDateChooser jDateChooser_Data;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton_Lewa;
    private javax.swing.JRadioButton jRadioButton_Prawa;
    private javax.swing.JTextField jTextField_Imie;
    private javax.swing.JTextField jTextField_Nazwisko;
    private javax.swing.JTextField jTextField_Wzrost;
    // End of variables declaration//GEN-END:variables
}
