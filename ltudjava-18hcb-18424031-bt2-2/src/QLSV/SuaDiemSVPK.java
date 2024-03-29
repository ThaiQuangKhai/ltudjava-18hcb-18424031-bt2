package QLSV;

import DAO.DiemLopMonDAO;
import DAO.XinPhucKhaoDiemDAO;
import POJOS.Diemlopmon;
import POJOS.DiemlopmonId;
import POJOS.Xinphuckhaodiem;
import POJOS.XinphuckhaodiemId;
import javax.swing.JOptionPane;
import static QLSV.SinhVienXemDiem.idpk;
import static QLSV.SinhVienXemDiem.malop;
import static QLSV.SinhVienXemDiem.mamon;
import static QLSV.SinhVienXemDiem.mssv;
import static QLSV.SinhVienXemDiem.hoten;
import static QLSV.SinhVienXemDiem.dgk;
import static QLSV.SinhVienXemDiem.dck;
import static QLSV.SinhVienXemDiem.dk;
import static QLSV.SinhVienXemDiem.dt;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class SuaDiemSVPK extends javax.swing.JFrame {

    /**
     * Creates new form GiaoVu
     */
    public SuaDiemSVPK() {
        initComponents();
        txt_mssv.setText(mssv);
        txt_hoten.setText(hoten);
        txt_mamon.setText(mamon);
        txt_dgk.setText(String.valueOf(dgk));
        txt_dck.setText(String.valueOf(dck));
        txt_dk.setText(String.valueOf(dk));
        txt_dt.setText(String.valueOf(dt));
        txt_mssv.setEnabled(false);
        txt_hoten.setEnabled(false);
        txt_mamon.setEnabled(false);
        txt_dgk.setEditable(false);
        txt_dck.setEditable(false);
        txt_dk.setEditable(false);
        txt_dt.setEditable(false);
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
        txt_mssv = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_hoten = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_mamon = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_dgk1 = new javax.swing.JTextField();
        txt_dgk = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_dck = new javax.swing.JTextField();
        txt_dck1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_dk = new javax.swing.JTextField();
        txt_dk1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_dt = new javax.swing.JTextField();
        txt_dt1 = new javax.swing.JTextField();
        bt_capnhat = new javax.swing.JButton();
        bt_quayve = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CẬP NHẬT ĐIỂM PHÚC KHẢO");
        jLabel5.setToolTipText("");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("MSSV:");

        txt_mssv.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Họ và tên:");

        txt_hoten.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Mã môn:");

        txt_mamon.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Cập nhật");

        txt_dgk1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txt_dgk.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Điểm GK:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Điểm CK:");

        txt_dck.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txt_dck1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Điểm khác:");

        txt_dk.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txt_dk1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Điểm tổng:");

        txt_dt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txt_dt1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        bt_capnhat.setText("Cập Nhật");
        bt_capnhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_capnhatActionPerformed(evt);
            }
        });

        bt_quayve.setText("Quay Về");
        bt_quayve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_quayveActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setText("Hiện tại");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("Điểm:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel12))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel9))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txt_dt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                                            .addComponent(txt_dk, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_dck, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_dgk, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txt_dt1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                                            .addComponent(txt_dk1, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_dck1, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_dgk1)))
                                    .addComponent(txt_hoten)
                                    .addComponent(txt_mamon)
                                    .addComponent(txt_mssv)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel5)))
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(bt_capnhat, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(bt_quayve, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                    .addComponent(jLabel3)
                    .addComponent(txt_mamon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jLabel12))
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_dgk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(txt_dgk1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_dck, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_dk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_dt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(txt_dck1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_dk1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_dt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_capnhat, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_quayve, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_capnhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_capnhatActionPerformed
        if (kiemtra()==true)
        {
            if (!malop.isEmpty()&&!mssv.isEmpty()) {
                float dgk = Float.parseFloat(txt_dgk1.getText());
                float dck = Float.parseFloat(txt_dck1.getText());
                float dk = Float.parseFloat(txt_dk1.getText());
                float dt = Float.parseFloat(txt_dt1.getText());
                DiemlopmonId dlmid = new DiemlopmonId(malop, mamon, mssv);
                Diemlopmon dlm = new Diemlopmon(dlmid, dgk, dck, dk, dt);
                if(DiemLopMonDAO.update(dlm)==true)
                {
                    if(XinPhucKhaoDiemDAO.updatetinhtran(idpk, mssv, mamon, malop, 3)==true);
                    {
                        JOptionPane.showMessageDialog(null, "Sủa và cập nhật tình trạng thành công");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Sủa điểm không thành công.");
                }
            }
        }
    }//GEN-LAST:event_bt_capnhatActionPerformed

    private void bt_quayveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_quayveActionPerformed
        // TODO add your handling code here:
        XemDSXinPhucKhao qld = new XemDSXinPhucKhao();
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

        if (txt_dgk1.getText().equals("")) {
            validate = false;
            msgErr.append("Điểm giữa kỳ không thể trông");
            msgErr.append("\n");
        } else {
            dgk = Float.parseFloat(txt_dgk1.getText());
            if (dgk > 10 || dgk < 0) {
                validate = false;
                msgErr.append("Điểm giữa kỳ không hợp lệ, điểm phải từ 0 đến 10.");
                msgErr.append("\n");
            }
        }

        if (txt_dck1.getText().equals("")) {
            validate = false;
            msgErr.append("Điểm cuối kỳ không thể trông");
            msgErr.append("\n");
        } else {
            dck = Float.parseFloat(txt_dck1.getText());
            if (dck > 10 || dck < 0) {
                validate = false;
                msgErr.append("Điểm cuối kỳ không hợp lệ, điểm phải từ 0 đến 10.");
                msgErr.append("\n");
            }
        }

        if (txt_dk1.getText().equals("")) {
            validate = false;
            msgErr.append("Điểm khác không thể trông");
            msgErr.append("\n");
        } else {
            dk = Float.parseFloat(txt_dk1.getText());
            if (dk > 10 || dk < 0) {
                validate = false;
                msgErr.append("Điểm khác không hợp lệ, điểm phải từ 0 đến 10.");
                msgErr.append("\n");
            }
        }

        if (txt_dt1.getText().equals("")) {
            validate = false;
            msgErr.append("Điểm tổng không thể trông");
            msgErr.append("\n");
        } else {
            dt = Float.parseFloat(txt_dt1.getText());
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
            java.util.logging.Logger.getLogger(XinPhucKhao1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XinPhucKhao1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XinPhucKhao1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XinPhucKhao1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuaDiemSVPK().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_capnhat;
    private javax.swing.JButton bt_quayve;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt_dck;
    private javax.swing.JTextField txt_dck1;
    private javax.swing.JTextField txt_dgk;
    private javax.swing.JTextField txt_dgk1;
    private javax.swing.JTextField txt_dk;
    private javax.swing.JTextField txt_dk1;
    private javax.swing.JTextField txt_dt;
    private javax.swing.JTextField txt_dt1;
    private javax.swing.JTextField txt_hoten;
    private javax.swing.JTextField txt_mamon;
    private javax.swing.JTextField txt_mssv;
    // End of variables declaration//GEN-END:variables
}
