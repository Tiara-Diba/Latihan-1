// Nama : Tiara Diba
// NIM  : 11200930000017
// Kelas: 2A SI'20

package AplikasiKonversiSuhu;

public class KonversiSuhu extends javax.swing.JFrame {
    
public Double input;
public Double Celcius;
public Double Fahrenheit;
public Double Reamur;
public Double Kelvin;
public String HasilCelcius;
public String HasilFahrenheit;
public String HasilReamur;
public String HasilKelvin;
    public KonversiSuhu() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2_Close = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtSuhuAwal = new javax.swing.JTextField();
        btnCelcius = new javax.swing.JRadioButton();
        btnFahrenheit = new javax.swing.JRadioButton();
        btnReamur = new javax.swing.JRadioButton();
        btnKelvin = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCelcius = new javax.swing.JTextField();
        txtFahrenheit = new javax.swing.JTextField();
        txtReamur = new javax.swing.JTextField();
        txtKelvin = new javax.swing.JTextField();
        btnHapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(400, 450));
        setSize(new java.awt.Dimension(400, 450));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255), 2));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 40));

        jLabel1.setFont(new java.awt.Font("Poor Richard", 0, 24)); // NOI18N
        jLabel1.setText("Aplikasi Konversi Suhu");

        jLabel2_Close.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel2_Close.setText("X");
        jLabel2_Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2_CloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel2_Close, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2_Close, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 50);

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 255), 2));
        jPanel2.setMinimumSize(new java.awt.Dimension(400, 370));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 370));

        jLabel4.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel4.setText("Suhu");

        btnCelcius.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup1.add(btnCelcius);
        btnCelcius.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        btnCelcius.setText("Celcius");
        btnCelcius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCelciusActionPerformed(evt);
            }
        });

        btnFahrenheit.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup1.add(btnFahrenheit);
        btnFahrenheit.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        btnFahrenheit.setText("Fahrenheit");
        btnFahrenheit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFahrenheitActionPerformed(evt);
            }
        });

        btnReamur.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup1.add(btnReamur);
        btnReamur.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        btnReamur.setText("Reamur");
        btnReamur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReamurActionPerformed(evt);
            }
        });

        btnKelvin.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup1.add(btnKelvin);
        btnKelvin.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        btnKelvin.setText("Kelvin");
        btnKelvin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKelvinActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Californian FB", 0, 18)); // NOI18N
        jLabel5.setText("Hasil");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel6.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        jLabel6.setText("Celcius");

        jLabel7.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        jLabel7.setText("Fahrenheit");

        jLabel8.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        jLabel8.setText("Reamur");

        jLabel9.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        jLabel9.setText("Kelvin");

        btnHapus.setFont(new java.awt.Font("Garamond", 0, 14)); // NOI18N
        btnHapus.setText("Reset");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtSuhuAwal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnHapus)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(btnCelcius)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnFahrenheit)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnReamur)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnKelvin))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtKelvin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(txtReamur, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtFahrenheit, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCelcius, javax.swing.GroupLayout.Alignment.LEADING)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSuhuAwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCelcius)
                    .addComponent(btnFahrenheit)
                    .addComponent(btnReamur)
                    .addComponent(btnKelvin))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(txtCelcius, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFahrenheit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtReamur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKelvin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addComponent(btnHapus)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 40, 400, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCelciusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCelciusActionPerformed
        input=Double.parseDouble(txtSuhuAwal.getText());
        
        Celcius= input;
        Fahrenheit= Celcius* 1.8 + 32;
        Reamur= Celcius * 0.8;
        Kelvin= Celcius + 273.15;
        
        HasilCelcius = Double.toString(Celcius);
        txtCelcius.setText(HasilCelcius);
        HasilFahrenheit = Double.toString(Fahrenheit);
        txtFahrenheit.setText(HasilFahrenheit);
        HasilReamur = Double.toString(Reamur);
        txtReamur.setText(HasilReamur);
        HasilKelvin = Double.toString(Kelvin);
        txtKelvin.setText(HasilKelvin);  
    }//GEN-LAST:event_btnCelciusActionPerformed

    private void btnFahrenheitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFahrenheitActionPerformed
       input=Double.parseDouble(txtSuhuAwal.getText());
        
        Fahrenheit= input;
        Celcius= (Fahrenheit-32)/1.8;
        Reamur= (Fahrenheit-32)/2.25;
        Kelvin=(Fahrenheit-459.67)/1.8;
        
        HasilCelcius = Double.toString(Celcius);
        txtCelcius.setText(HasilCelcius);
        HasilFahrenheit = Double.toString(Fahrenheit);
        txtFahrenheit.setText(HasilFahrenheit);
        HasilReamur = Double.toString(Reamur);
        txtReamur.setText(HasilReamur);
        HasilKelvin = Double.toString(Kelvin);
        txtKelvin.setText(HasilKelvin);   
    }//GEN-LAST:event_btnFahrenheitActionPerformed

    private void btnReamurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReamurActionPerformed
        input=Double.parseDouble(txtSuhuAwal.getText());
        
        Reamur= input;
        Celcius= Reamur/0.8;
        Fahrenheit= (Reamur - 7.5)*24/7+32;
        Kelvin= Reamur/0.8 + 273.15;

   
        HasilCelcius = Double.toString(Celcius);
        txtCelcius.setText(HasilCelcius);
        HasilFahrenheit = Double.toString(Fahrenheit);
        txtFahrenheit.setText(HasilFahrenheit);
        HasilReamur = Double.toString(Reamur);
        txtReamur.setText(HasilReamur);
        HasilKelvin = Double.toString(Kelvin);
        txtKelvin.setText(HasilKelvin);        
    }//GEN-LAST:event_btnReamurActionPerformed

    private void btnKelvinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKelvinActionPerformed
        input=Double.parseDouble(txtSuhuAwal.getText());
        
        Kelvin= input;
        Celcius= Kelvin-273.15;
        Fahrenheit= Kelvin*1.8-459.67;
        Reamur= (Kelvin-273.15)*0.8;
        
        HasilCelcius = Double.toString(Celcius);
        txtCelcius.setText(HasilCelcius);
        HasilFahrenheit = Double.toString(Fahrenheit);
        txtFahrenheit.setText(HasilFahrenheit);
        HasilReamur = Double.toString(Reamur);
        txtReamur.setText(HasilReamur);
        HasilKelvin = Double.toString(Kelvin);
        txtKelvin.setText(HasilKelvin);
    }//GEN-LAST:event_btnKelvinActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        txtCelcius.setText("");
        txtFahrenheit.setText("");
        txtReamur.setText("");
        txtKelvin.setText("");
        txtSuhuAwal.setText("");
        txtSuhuAwal.requestFocus();
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void jLabel2_CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2_CloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2_CloseMouseClicked

   
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
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KonversiSuhu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnCelcius;
    private javax.swing.JRadioButton btnFahrenheit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JRadioButton btnKelvin;
    private javax.swing.JRadioButton btnReamur;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2_Close;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtCelcius;
    private javax.swing.JTextField txtFahrenheit;
    private javax.swing.JTextField txtKelvin;
    private javax.swing.JTextField txtReamur;
    private javax.swing.JTextField txtSuhuAwal;
    // End of variables declaration//GEN-END:variables
}
