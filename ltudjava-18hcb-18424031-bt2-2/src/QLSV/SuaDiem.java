/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLSV;

import DAO.DiemLopMonDAO;
import POJOS.Diemlopmon;
import POJOS.DiemlopmonId;
import javax.swing.JOptionPane;
import static QLSV.QuanLyDiem.malop;
import static QLSV.QuanLyDiem.mamon;
import static QLSV.QuanLyDiem.mssv;
import static QLSV.QuanLyDiem.hoten;

/**
 *
 * @author CPU12407-local
 */
public class SuaDiem extends javax.swing.JDialog {

//    CalenderCourse cCourse = null;
//    Student sd = null;
    /**
     * Creates new form updateScoreStudent
     */
    public SuaDiem() {
        initComponents();
        txt_mssv.setText(mssv);
        txt_hoten.setText(hoten);
        txt_mssv.setEnabled(false);
        txt_hoten.setEnabled(false);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_mssv = new javax.swing.JTextField();
        txt_hoten = new javax.swing.JTextField();
        txt_dgk = new javax.swing.JTextField();
        txt_dck = new javax.swing.JTextField();
        txt_dk = new javax.swing.JTextField();
        txt_dt = new javax.swing.JTextField();
        bt_suadiem = new javax.swing.JButton();
        bt_quayve = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CẬP NHẬT ĐIỂM");
        jLabel5.setToolTipText("");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("MSSV:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Họ và tên:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Điểm GK:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Điểm CK:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Điểm khác:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Điểm tổng:");

        txt_mssv.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txt_hoten.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txt_dgk.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txt_dck.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txt_dk.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txt_dt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        bt_suadiem.setText("Sửa");
        bt_suadiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_suadiemActionPerformed(evt);
            }
        });

        bt_quayve.setText("Quay Về");
        bt_quayve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_quayveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(bt_suadiem, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_quayve, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8))
                            .addGap(30, 30, 30)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_dt, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_dk, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_dck, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_dgk, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_hoten, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_mssv, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_mssv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_hoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_dgk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_dck, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_dk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_dt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_suadiem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_quayve, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_suadiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_suadiemActionPerformed
        if (kiemtra()==true)
        {
            if (!malop.isEmpty()&&!mssv.isEmpty()) {
                float dgk = Float.parseFloat(txt_dgk.getText());
                float dck = Float.parseFloat(txt_dck.getText());
                float dk = Float.parseFloat(txt_dk.getText());
                float dt = Float.parseFloat(txt_dt.getText());
                DiemlopmonId dlmid = new DiemlopmonId(malop, mamon, mssv);
                Diemlopmon dlm = new Diemlopmon(dlmid, dgk, dck, dk, dt);
                if(DiemLopMonDAO.update(dlm)==true)
                {
                    JOptionPane.showMessageDialog(null, "Sủa điểm thành công.");
                    txt_mssv.setText("");
                }else{
                    JOptionPane.showMessageDialog(null, "Sủa điểm không thành công.");
                }
            }
        }
    }//GEN-LAST:event_bt_suadiemActionPerformed

    private void bt_quayveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_quayveActionPerformed
        // TODO add your handling code here:
        QuanLyDiem qld = new QuanLyDiem();
        qld.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bt_quayveActionPerformed

    private boolean kiemtra() {
        boolean validate = true;
        float dgk = 0;
        float dck = 0;
        float dk = 0;
        float dt = 0;
        StringBuilder msgErr = new StringBuilder();

        if (txt_dgk.getText().equals("")) {
            validate = false;
            msgErr.append("Điểm giữa kỳ không thể trông");
            msgErr.append("\n");
        } else {
            dgk = Float.parseFloat(txt_dgk.getText());
            if (dgk > 10 || dgk < 0) {
                validate = false;
                msgErr.append("Điểm giữa kỳ không hợp lệ, điểm phải từ 0 đến 10.");
                msgErr.append("\n");
            }
        }

        if (txt_dck.getText().equals("")) {
            validate = false;
            msgErr.append("Điểm cuối kỳ không thể trông");
            msgErr.append("\n");
        } else {
            dck = Float.parseFloat(txt_dck.getText());
            if (dck > 10 || dck < 0) {
                validate = false;
                msgErr.append("Điểm cuối kỳ không hợp lệ, điểm phải từ 0 đến 10.");
                msgErr.append("\n");
            }
        }

        if (txt_dk.getText().equals("")) {
            validate = false;
            msgErr.append("Điểm khác không thể trông");
            msgErr.append("\n");
        } else {
            dk = Float.parseFloat(txt_dk.getText());
            if (dk > 10 || dk < 0) {
                validate = false;
                msgErr.append("Điểm khác không hợp lệ, điểm phải từ 0 đến 10.");
                msgErr.append("\n");
            }
        }

        if (txt_dt.getText().equals("")) {
            validate = false;
            msgErr.append("Điểm tổng không thể trông");
            msgErr.append("\n");
        } else {
            dt = Float.parseFloat(txt_dt.getText());
            if (dt > 10 || dt < 0) {
                validate = false;
                msgErr.append("Điểm tổng kỳ không hợp lệ, điểm phải từ 0 đến 10.");
                msgErr.append("\n");
            }
        }

        if (validate == false) {
            JOptionPane.showMessageDialog(null, msgErr, "Error", JOptionPane.ERROR_MESSAGE);
        }

        return validate;
    }

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
            java.util.logging.Logger.getLogger(SuaDiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuaDiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuaDiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuaDiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuaDiem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_quayve;
    private javax.swing.JButton bt_suadiem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txt_dck;
    private javax.swing.JTextField txt_dgk;
    private javax.swing.JTextField txt_dk;
    private javax.swing.JTextField txt_dt;
    private javax.swing.JTextField txt_hoten;
    private javax.swing.JTextField txt_mssv;
    // End of variables declaration//GEN-END:variables
}
