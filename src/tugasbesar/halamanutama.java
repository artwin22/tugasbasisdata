/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbesar;

import barang.tampilandatabarang;
import login.login;
import member.tampilandatamember;
import pegawai.tampilandatapegawai;
import relasi.melayani;
import relasi.mensupplai;
import relasi.riwayat;
import supplier.tampilandatasupplier;

/**
 *
 * @author Kuroko
 */
public class halamanutama extends javax.swing.JFrame {

    /**
     * Creates new form halamanutama
     */
    public halamanutama() {
        login log = new login();
        initComponents();
        setLocationRelativeTo(null);
    }
    
//    public void login(String id, String pass){
//        String jabatan = "";
//        
//        try {
//            Statement stat = (Statement)koneksi.getKoneksi().createStatement();
//            String sql = "SELECT jabatan FROM pegawai WHERE id_pegawai = '" + id
//                    + "' AND nama_pegawai = '" + pass + "'";
//            ResultSet res = stat.executeQuery(sql);
//            res.next();
//            jabatan = res.getString("jabatan");
//            
//        } catch (SQLException err){
//            JOptionPane.showMessageDialog(null, err.getMessage());
//        }
//        
//        if(jabatan.equals("Direktur") || jabatan.equals("Manager")){
//            
//        } else {
//            Supplai.setVisible(false);
//            transaksi.setVisible(false);
//            riwayat.setVisible(false);
//        }
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        transaksi = new javax.swing.JButton();
        riwayat = new javax.swing.JButton();
        datapegawai = new javax.swing.JButton();
        datamember = new javax.swing.JButton();
        databarang = new javax.swing.JButton();
        datasupplier = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        Supplai = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("MV Boli", 0, 11)); // NOI18N
        jLabel1.setText("Toko GADA - Institut Teknologi Sumatera");

        transaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/dollar-symbol.png"))); // NOI18N
        transaksi.setText("Data Transaksi");
        transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transaksiActionPerformed(evt);
            }
        });

        riwayat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/line-chart.png"))); // NOI18N
        riwayat.setText("Riwayat Transaksi");
        riwayat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                riwayatActionPerformed(evt);
            }
        });

        datapegawai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/businessman.png"))); // NOI18N
        datapegawai.setText("Data Pegawai");
        datapegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datapegawaiActionPerformed(evt);
            }
        });

        datamember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/workers-team.png"))); // NOI18N
        datamember.setText("Data Member");
        datamember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datamemberActionPerformed(evt);
            }
        });

        databarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/suitcase.png"))); // NOI18N
        databarang.setText("Data Barang");
        databarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                databarangActionPerformed(evt);
            }
        });

        datasupplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/businessmen-disussing.png"))); // NOI18N
        datasupplier.setText("Data Supplier");
        datasupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datasupplierActionPerformed(evt);
            }
        });

        keluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Exit.png"))); // NOI18N
        keluar.setText("Exit");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });

        Supplai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/networking.png"))); // NOI18N
        Supplai.setText("Data Stok Barang");
        Supplai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupplaiActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jLabel2.setText("Dari kami, Oleh Kita, Untuk Semua");

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/businessman.png"))); // NOI18N
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(88, 88, 88))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(databarang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(datamember, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(datapegawai, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(datasupplier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Supplai, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(logout)
                                        .addGap(14, 14, 14)
                                        .addComponent(keluar))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(riwayat, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(116, 116, 116))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(datasupplier)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(transaksi)
                            .addComponent(datapegawai))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(riwayat)
                            .addComponent(datamember))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Supplai)
                            .addComponent(databarang))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(keluar)
                            .addComponent(logout))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void riwayatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_riwayatActionPerformed
        // TODO add your handling code here:
        dispose();
        new riwayat().setVisible(true);
    }//GEN-LAST:event_riwayatActionPerformed

    private void databarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_databarangActionPerformed
        // TODO add your handling code here:
        dispose();
        new tampilandatabarang().setVisible(true);
    }//GEN-LAST:event_databarangActionPerformed

    private void datamemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datamemberActionPerformed
        // TODO add your handling code here:
        dispose();
        new tampilandatamember().setVisible(true);
    }//GEN-LAST:event_datamemberActionPerformed

    private void datapegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datapegawaiActionPerformed
        // TODO add your handling code here:
        dispose();
        new tampilandatapegawai().setVisible(true);
    }//GEN-LAST:event_datapegawaiActionPerformed

    private void datasupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datasupplierActionPerformed
        // TODO add your handling code here:
        dispose();
        new tampilandatasupplier().setVisible(true);
    }//GEN-LAST:event_datasupplierActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_keluarActionPerformed

    private void SupplaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupplaiActionPerformed
        // TODO add your handling code here:
        dispose();
        new mensupplai().setVisible(true);
    }//GEN-LAST:event_SupplaiActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        dispose();
        new login().setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transaksiActionPerformed
        // TODO add your handling code here:
        
        dispose();
        new melayani().setVisible(true);
    }//GEN-LAST:event_transaksiActionPerformed

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
            java.util.logging.Logger.getLogger(halamanutama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(halamanutama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(halamanutama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(halamanutama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new halamanutama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Supplai;
    private javax.swing.JButton databarang;
    private javax.swing.JButton datamember;
    private javax.swing.JButton datapegawai;
    private javax.swing.JButton datasupplier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton keluar;
    private javax.swing.JButton logout;
    private javax.swing.JButton riwayat;
    private javax.swing.JButton transaksi;
    // End of variables declaration//GEN-END:variables
}
