//Projekt: Patryk Krawiec, lab3

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MenadzerPilkarzForm extends javax.swing.JFrame {

    Pilkarz pil = new Pilkarz();

    public MenadzerPilkarzForm() {
        initComponents();
        pil.fillPilkarzJtable(jTable1, ""); //wyswietla tabele z klasy Pilkarz
        ButtonGroup bg = new ButtonGroup();
        bg.add(jRadioButton_Lewa);
        bg.add(jRadioButton_Prawa);
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
        jButtonRemoveButton = new javax.swing.JButton();
        jButtonAddButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jComboBox_Waga = new javax.swing.JComboBox<>();
        jRadioButton_Lewa = new javax.swing.JRadioButton();
        jRadioButton_Prawa = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField_PIL_ID = new javax.swing.JTextField();
        jButtonEditButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField_Val_Find = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButtonRefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Menadzer Pilkarzy");

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

        jButtonRemoveButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonRemoveButton.setText("Usun");
        jButtonRemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveButtonActionPerformed(evt);
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
        jRadioButton_Lewa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_LewaActionPerformed(evt);
            }
        });

        jRadioButton_Prawa.setText("Prawonożny");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("ID:");

        jTextField_PIL_ID.setEditable(false);

        jButtonEditButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonEditButton.setText("Edytuj");
        jButtonEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditButtonActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Imie", "Nazwisko", "Lepsza noga", "Data urodzenia", "Waga", "Wzrost"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTextField_Val_Find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Val_FindActionPerformed(evt);
            }
        });
        jTextField_Val_Find.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_Val_FindKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_Val_FindKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setText("Wprowadz wartosc, ktorej szukasz: ");

        jButtonRefresh.setText("R");
        jButtonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField_Val_Find, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(81, 81, 81)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField_Wzrost, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))))
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
                                                .addComponent(jTextField_Nazwisko, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jTextField_PIL_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(jButtonRemoveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43)
                                        .addComponent(jButtonEditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(jButtonAddButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(330, 330, 330)
                                .addComponent(jLabel1))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonRefresh)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Val_Find, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jTextField_PIL_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonRemoveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAddButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonEditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonRefresh)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_WzrostKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_WzrostKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_WzrostKeyTyped
    public boolean sprawdzText() {
        if (jTextField_Imie.getText().equals("") || jTextField_Nazwisko.getText().equals("") || jTextField_Wzrost.getText().equals("") || jTextField_PIL_ID.getText().equals("") || jDateChooser_Data.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Pola tekstowe nie moga zostac puste!");
            return false;
        } else if (jDateChooser_Data.getDate().compareTo(new Date()) > 0) {
            JOptionPane.showMessageDialog(null, "Nie wybieraj daty urodzenia z przyszlosci!");
            return false;
        } else {
            return true;
        }

    }


    private void jButtonRemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveButtonActionPerformed

        if (jTextField_PIL_ID.getText().equals("")) {   //sprawdza warunek, czy ID nie jest puste
            JOptionPane.showMessageDialog(null, "Nie zaznaczono pilkarza"); //wyrzuca okno dialogowe
        } else {
            int id = Integer.valueOf(jTextField_PIL_ID.getText());  //jezeli znalazlo id, to pobiera je i zapisuje do zmiennej id
            pil.insertUpdateDeletePilkarz('d', id, null, null, null, null, null, null); //na podstawie zmiennej id identyfikuje pilkarza i ustawia wszystkie jego rekordy na puste, korzystajac z operacji "delete" (d) opisanej w klasie Pilkarz
        }
    }//GEN-LAST:event_jButtonRemoveButtonActionPerformed

    private void jButtonAddButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddButton1ActionPerformed
        DodajPilkarzaForm dpf = new DodajPilkarzaForm();    //po kliknieciu przycisku "Dodaj" wyrzuca formularz z klasy "DodajPilkarzaForm"
        dpf.setVisible(true);
        dpf.pack();
        dpf.setLocationRelativeTo(null);
        dpf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }//GEN-LAST:event_jButtonAddButton1ActionPerformed

    private void jButtonEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditButtonActionPerformed

        int id = Integer.valueOf(jTextField_PIL_ID.getText()); //przypisuje id do zmiennej id
        String imie = jTextField_Imie.getText();    //przypisuje do zmiennych wartosci
        String nazwisko = jTextField_Nazwisko.getText();
        String noga = "Lewa";
        if (jRadioButton_Prawa.isSelected()) {
            noga = "Prawa";
        }
        if (sprawdzText()) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String data = dateFormat.format(jDateChooser_Data.getDate());
            String waga = jComboBox_Waga.getSelectedItem().toString();
            String wzrost = jTextField_Wzrost.getText();
            Pilkarz pil = new Pilkarz();
            pil.insertUpdateDeletePilkarz('u', id, imie, nazwisko, noga, data, waga, wzrost); //korzysta z operacji "Update" (u) opisanej w klasie "Pilkarz"
        }

    }//GEN-LAST:event_jButtonEditButtonActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        //metoda, która po kliknieciu w rekord tabeli wypisze jego wartosci do formularza
        int rowIndex = jTable1.getSelectedRow();    //tworzy zmienna w ktorej beda przechowywane rzedy tablei
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();   //tworzy obiekt tabeli

        if (model.getValueAt(rowIndex, 3).toString().equals("Lewa")) {  //sprawdza petla warunkowa i wyswietla te jRButtony, ktore powinny byc zaznaczone
            jRadioButton_Lewa.setSelected(true);
            jRadioButton_Prawa.setSelected(false);
        } else {
            jRadioButton_Prawa.setSelected(true);
            jRadioButton_Lewa.setSelected(false);

        }

        jTextField_PIL_ID.setText(model.getValueAt(rowIndex, 0).toString());
        jTextField_Imie.setText(model.getValueAt(rowIndex, 1).toString());
        jTextField_Nazwisko.setText(model.getValueAt(rowIndex, 2).toString());
        jTextField_Wzrost.setText(model.getValueAt(rowIndex, 6).toString());

        jComboBox_Waga.setSelectedItem(model.getValueAt(rowIndex, 5).toString());

        Date dataur;
        try {
            dataur = new SimpleDateFormat("yyy-MM-dd").parse(model.getValueAt(rowIndex, 4).toString());
            jDateChooser_Data.setDate(dataur);
        } catch (ParseException ex) {
            Logger.getLogger(MenadzerPilkarzForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField_Val_FindKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Val_FindKeyTyped

    }//GEN-LAST:event_jTextField_Val_FindKeyTyped

    private void jTextField_Val_FindKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Val_FindKeyReleased

        jTable1.setModel(new DefaultTableModel(null, new Object[]{"Id", "Imie", "Nazwisko", "Lepsza_noga", "Data_urodzenia", "Waga", "Wzrost"}));

        pil.fillPilkarzJtable(jTable1, jTextField_Val_Find.getText());
    }//GEN-LAST:event_jTextField_Val_FindKeyReleased

    private void jRadioButton_LewaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_LewaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_LewaActionPerformed

    private void jButtonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshActionPerformed
        this.dispose();
        MenadzerPilkarzForm mpf = new MenadzerPilkarzForm();
        mpf.setVisible(true);
        mpf.pack();
        mpf.setLocationRelativeTo(null);
        mpf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButtonRefreshActionPerformed

    private void jTextField_Val_FindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Val_FindActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Val_FindActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenadzerPilkarzForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenadzerPilkarzForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenadzerPilkarzForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenadzerPilkarzForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenadzerPilkarzForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddButton1;
    private javax.swing.JButton jButtonEditButton;
    private javax.swing.JButton jButtonRefresh;
    private javax.swing.JButton jButtonRemoveButton;
    private javax.swing.JComboBox<String> jComboBox_Waga;
    private com.toedter.calendar.JDateChooser jDateChooser_Data;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton_Lewa;
    private javax.swing.JRadioButton jRadioButton_Prawa;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_Imie;
    private javax.swing.JTextField jTextField_Nazwisko;
    private javax.swing.JTextField jTextField_PIL_ID;
    private javax.swing.JTextField jTextField_Val_Find;
    private javax.swing.JTextField jTextField_Wzrost;
    // End of variables declaration//GEN-END:variables
}
