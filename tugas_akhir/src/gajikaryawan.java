
import java.awt.Color;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class gajikaryawan extends javax.swing.JFrame {

    /**
     * Creates new form gajikaryawan
     */
    public gajikaryawan() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_nama = new javax.swing.JTextField();
        txt_nik = new javax.swing.JTextField();
        cmb_jk = new javax.swing.JComboBox<>();
        cmb_jabatan = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmb_jl = new javax.swing.JComboBox<>();
        txt_gaji = new javax.swing.JTextField();
        txt_upah = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_total = new javax.swing.JTextField();
        btn_htg = new javax.swing.JButton();
        btn_keluar = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Nama Karyawan");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel3.setText("NIK");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel4.setText("Jenis Kelamin");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jLabel5.setText("Jabatan");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        txt_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_namaActionPerformed(evt);
            }
        });
        txt_nama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_namaKeyTyped(evt);
            }
        });
        jPanel1.add(txt_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 190, -1));

        txt_nik.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nikKeyTyped(evt);
            }
        });
        jPanel1.add(txt_nik, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 190, -1));

        cmb_jk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Jenis Kelamin--", "Laki-laki", "Perempuan" }));
        jPanel1.add(cmb_jk, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 190, -1));

        cmb_jabatan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Jabatan--", "Manajer", "Karyawan", "Costumer Service", "Security" }));
        cmb_jabatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_jabatanActionPerformed(evt);
            }
        });
        jPanel1.add(cmb_jabatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 190, -1));

        jLabel6.setText("Gaji Pokok");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, -1, -1));

        jLabel7.setText("Jam Lembur");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, -1, -1));

        jLabel8.setText("Upah Lembur");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, -1, 20));

        cmb_jl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Jam Lembur--", "1 Jam", "2 Jam", "3 Jam", "4 Jam", "5 Jam" }));
        cmb_jl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_jlActionPerformed(evt);
            }
        });
        jPanel1.add(cmb_jl, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 180, 200, -1));

        txt_gaji.setEditable(false);
        txt_gaji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_gajiActionPerformed(evt);
            }
        });
        jPanel1.add(txt_gaji, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 110, 200, -1));

        txt_upah.setEditable(false);
        jPanel1.add(txt_upah, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 250, 200, -1));

        jLabel9.setText("Total Gaji");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 460, -1, -1));

        txt_total.setEditable(false);
        jPanel1.add(txt_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, 220, -1));

        btn_htg.setText("Hitung");
        btn_htg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_htgMouseClicked(evt);
            }
        });
        btn_htg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_htgActionPerformed(evt);
            }
        });
        jPanel1.add(btn_htg, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 520, -1, -1));

        btn_keluar.setText("Keluar");
        btn_keluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_keluarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_keluarMouseExited(evt);
            }
        });
        btn_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_keluarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(787, 629, 110, 50));

        btn_reset.setText("Reset");
        btn_reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_resetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_resetMouseExited(evt);
            }
        });
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        jPanel1.add(btn_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 629, 110, 50));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Perhitungan Gaji Karyawan");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(352, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(346, 346, 346))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 931, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_namaActionPerformed

    private void cmb_jabatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_jabatanActionPerformed
        // untuk memnentukan jabatan sesuai gaji
        if (cmb_jabatan.getSelectedItem().equals("--Pilih Jabatan--")){
            txt_gaji.setText("");
        }
        else if (cmb_jabatan.getSelectedItem().equals("Manajer")){
            txt_gaji.setText("5000000");
        }
        else if (cmb_jabatan.getSelectedItem().equals("Karyawan")){
            txt_gaji.setText("2500000");
        }
        else if (cmb_jabatan.getSelectedItem().equals("Costumer Service")){
            txt_gaji.setText("2000000");
        }
        else if (cmb_jabatan.getSelectedItem().equals("Security")){
            txt_gaji.setText("1700000");
        }
    }//GEN-LAST:event_cmb_jabatanActionPerformed

    private void cmb_jlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_jlActionPerformed
        // menentukan upah lembur
        if (cmb_jl.getSelectedItem().equals("--Pilih Jam Lembur--")){
            txt_upah.setText("");
        }
        else if (cmb_jl.getSelectedItem().equals("1 Jam")){
            txt_upah.setText("50000");
        }
        else if (cmb_jl.getSelectedItem().equals("2 Jam")){
            txt_upah.setText("100000");
        }
        else if (cmb_jl.getSelectedItem().equals("3 Jam")){
            txt_upah.setText("150000");
        }
        else if (cmb_jl.getSelectedItem().equals("4 Jam")){
            txt_upah.setText("200000");
        }
        else if (cmb_jl.getSelectedItem().equals("5 Jam")){
            txt_upah.setText("250000");
        }    
    }//GEN-LAST:event_cmb_jlActionPerformed

    private void btn_htgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_htgActionPerformed
        // Menghitung gaji total
        int x=Integer.parseInt(txt_gaji.getText());
        int y=Integer.parseInt(txt_upah.getText());
        int total=x+y;
        txt_total.setText(String.valueOf(total));
        
    }//GEN-LAST:event_btn_htgActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        // TODO add your handling code here:
        txt_nama.setText(null);
        txt_nik.setText(null);
        txt_gaji.setText(null);
        txt_upah.setText(null);
        txt_total.setText(null);
        cmb_jl.setSelectedItem("--Pilih Jam Lembur--");
        cmb_jk.setSelectedItem("--Pilih Jenis Kelamin--");
        cmb_jabatan.setSelectedItem("--Pilih Jabatan--");
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_keluarActionPerformed
        // TODO add your handling code here:
        int answer= JOptionPane.showConfirmDialog(null,"Anda Yakin Keluar","Keluar", JOptionPane.OK_OPTION);
        if(answer==JOptionPane.OK_OPTION){
            dispose();
    }
    }//GEN-LAST:event_btn_keluarActionPerformed

    private void btn_keluarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_keluarMouseEntered
        // TODO add your handling code here:
        btn_keluar.setBackground(Color.red);
    }//GEN-LAST:event_btn_keluarMouseEntered

    private void txt_gajiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_gajiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_gajiActionPerformed

    private void btn_keluarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_keluarMouseExited
        // TODO add your handling code here:
        btn_keluar.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_btn_keluarMouseExited

    private void txt_nikKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nikKeyTyped
        // TODO add your handling code here:
        char enter=evt.getKeyChar();
        if(!(Character.isDigit(enter)))
        {
            evt.consume();
        }
    }//GEN-LAST:event_txt_nikKeyTyped

    private void btn_resetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_resetMouseEntered
        // TODO add your handling code here:
        btn_reset.setBackground(Color.YELLOW);
    }//GEN-LAST:event_btn_resetMouseEntered

    private void btn_resetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_resetMouseExited
        // TODO add your handling code here:
        btn_reset.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_btn_resetMouseExited

    private void btn_htgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_htgMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_htgMouseClicked

    private void txt_namaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_namaKeyTyped
        // TODO add your handling code here:
        char enter=evt.getKeyChar();
        if(!(Character.isAlphabetic(enter)))
        {
            evt.consume();
        }
    }//GEN-LAST:event_txt_namaKeyTyped

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
            java.util.logging.Logger.getLogger(gajikaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gajikaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gajikaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gajikaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gajikaryawan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_htg;
    private javax.swing.JButton btn_keluar;
    private javax.swing.JButton btn_reset;
    private javax.swing.JComboBox<String> cmb_jabatan;
    private javax.swing.JComboBox<String> cmb_jk;
    private javax.swing.JComboBox<String> cmb_jl;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txt_gaji;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_nik;
    private javax.swing.JTextField txt_total;
    private javax.swing.JTextField txt_upah;
    // End of variables declaration//GEN-END:variables
}
