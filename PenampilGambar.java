// Nama : Tiara Diba
// NIM  : 11200930000017
// Kelas: 2A SI'20

package Frame;

import java.awt.CardLayout;


public class PenampilGambar extends javax.swing.JFrame {

    public PenampilGambar() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPanel = new javax.swing.JPanel();
        btnTheOwlHouse = new javax.swing.JButton();
        btnGravityFalls = new javax.swing.JButton();
        btnSevenDwarfs = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        imagePanel = new javax.swing.JPanel();
        lblSevenDwarfs = new javax.swing.JLabel();
        lblGravityFalls = new javax.swing.JLabel();
        lblTheOwlHouse = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Penampil Gambar");
        setUndecorated(true);

        btnTheOwlHouse.setText("The Owl House");
        btnTheOwlHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTheOwlHouseActionPerformed(evt);
            }
        });
        btnPanel.add(btnTheOwlHouse);

        btnGravityFalls.setText("Gravity Falls");
        btnGravityFalls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravityFallsActionPerformed(evt);
            }
        });
        btnPanel.add(btnGravityFalls);

        btnSevenDwarfs.setText("Seven Dwarfs");
        btnSevenDwarfs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSevenDwarfsActionPerformed(evt);
            }
        });
        btnPanel.add(btnSevenDwarfs);

        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        btnPanel.add(btnExit);

        getContentPane().add(btnPanel, java.awt.BorderLayout.PAGE_START);

        imagePanel.setLayout(new java.awt.CardLayout());

        lblSevenDwarfs.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Pictures\\Saved Pictures\\The 7D.jpg")); // NOI18N
        imagePanel.add(lblSevenDwarfs, "2");

        lblGravityFalls.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Pictures\\Saved Pictures\\Gravity falls.jpg")); // NOI18N
        imagePanel.add(lblGravityFalls, "1");

        lblTheOwlHouse.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Pictures\\Saved Pictures\\The Owl House.jpg")); // NOI18N
        lblTheOwlHouse.setAlignmentX(0.5F);
        imagePanel.add(lblTheOwlHouse, "0\n");

        getContentPane().add(imagePanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTheOwlHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTheOwlHouseActionPerformed
        CardLayout c1 = (CardLayout)(imagePanel.getLayout());
        c1.show(imagePanel, "0");
    }//GEN-LAST:event_btnTheOwlHouseActionPerformed

    private void btnGravityFallsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravityFallsActionPerformed
        CardLayout c1 = (CardLayout)(imagePanel.getLayout());
        c1.show(imagePanel, "1");
    }//GEN-LAST:event_btnGravityFallsActionPerformed

    private void btnSevenDwarfsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSevenDwarfsActionPerformed
        CardLayout c1 = (CardLayout)(imagePanel.getLayout());
        c1.show(imagePanel, "2"); 
    }//GEN-LAST:event_btnSevenDwarfsActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
       System.exit(0); 
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(PenampilGambar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PenampilGambar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PenampilGambar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PenampilGambar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                  new PenampilGambar().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGravityFalls;
    private javax.swing.JPanel btnPanel;
    private javax.swing.JButton btnSevenDwarfs;
    private javax.swing.JButton btnTheOwlHouse;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JLabel lblGravityFalls;
    private javax.swing.JLabel lblSevenDwarfs;
    private javax.swing.JLabel lblTheOwlHouse;
    // End of variables declaration//GEN-END:variables


}
