package QLSV;

import javax.swing.JOptionPane;
import java.util.Date;
import POJOS.Taophuckhaodiem;
import DAO.TaoPhucKhaoDiemDAO;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class TaoPhucKhaoDiem extends javax.swing.JFrame {

    /**
     * Creates new form GiaoVu
     */
    public TaoPhucKhaoDiem() {
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

        jDayChooser1 = new com.toedter.calendar.JDayChooser();
        jMonthChooser1 = new com.toedter.calendar.JMonthChooser();
        jPanel14 = new javax.swing.JPanel();
        bt_taopk = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        date_ngaybd = new com.toedter.calendar.JDateChooser();
        date_ngaykt = new com.toedter.calendar.JDateChooser();
        bt_quayve = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bt_taopk.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        bt_taopk.setText("Tạo Phúc Khảo");
        bt_taopk.setName("bt_taopk"); // NOI18N
        bt_taopk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_taopkActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("TẠO PHÚC KHẢO");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Từ Ngày");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Đến Ngày");

        bt_quayve.setText("Quay Về");
        bt_quayve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_quayveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(bt_taopk)
                        .addGap(18, 18, 18)
                        .addComponent(bt_quayve, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel14Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(date_ngaykt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel14Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(date_ngaybd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(6, 6, 6)))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(date_ngaybd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(date_ngaykt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_taopk)
                    .addComponent(bt_quayve))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void bt_taopkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_taopkActionPerformed
        // TODO add your handling code here:
        Date ngaybd= date_ngaybd.getDate();
        Date ngaykt= date_ngaykt.getDate();
        Taophuckhaodiem pk = new Taophuckhaodiem(ngaybd, ngaykt);
        if(TaoPhucKhaoDiemDAO.createtpkd(pk)==true)
        {
            JOptionPane.showMessageDialog(this, "Tạo phúc khảo điểm thành công.");
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Tạo không thành công.");
        }
////        Session s=connection.Controller.getSessionFactory().openSession();
////        //POJOS.Account ac=(POJOS.Account)s.load(POJOS.Account.class, 1);
////        String HQL="from Account where user='"+user+"'";
////        Query q=s.createQuery(HQL);
////        POJOS.Account ac=(POJOS.Account)q.uniqueResult();
////        if(ac.getUser().equalsIgnoreCase("GIAOVU")&&ac.getPassword().equals(pass))
////        {
////            GiaoVu gv = new GiaoVu(this);
////            gv.setVisible(true);
////        }
////        System.out.println(ac.getUser()+","+ac.getPassword());
//        account = AccountDAO.getAccount(user);
//        if(kiemtra(user,pass)==false)
//        {
//            if (account!=null&&user.equalsIgnoreCase("giaovu") && account.getPassword().equals(pass)) {
//                GiaoVu gv = new GiaoVu();
//                gv.setVisible(true);
//                this.setVisible(false);
//            } 
//            else if(account!=null && account.getPassword().equals(pass))
//            {
//                SinhVien sv =new SinhVien();
//                sv.setVisible(true);
//                this.setVisible(false);
//            }
//            else {
//    //            msgErr.append("Tên đăng nhập hoặc mật khẩu chưa đúng.");
//    //            JOptionPane.showMessageDialog(null, msgErr, "Error", JOptionPane.ERROR_MESSAGE);
//                JOptionPane.showMessageDialog(this, "Tên đăng nhập hoặc mật khẩu chưa đúng.");
//            }
//        }
        
    }//GEN-LAST:event_bt_taopkActionPerformed

    private void bt_quayveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_quayveActionPerformed
        // TODO add your handling code here:
        GiaoVu gv = new GiaoVu();
        gv.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bt_quayveActionPerformed
    
    private boolean kiemtra(String user, String pass) {
        boolean kiemtra = false;
        StringBuilder msgErr = new StringBuilder();

        if (user.equals("")) {
            kiemtra = true;
            msgErr.append("Vui lòng nhập user.\n");
        }

        if (pass.equals("")) {
            kiemtra = true;
            msgErr.append("Vui lòng nhập mật khẩu.");
        }
        if(kiemtra==true)
        {
            JOptionPane.showMessageDialog(this, msgErr);
        }
        return kiemtra;
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
            java.util.logging.Logger.getLogger(TaoPhucKhaoDiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaoPhucKhaoDiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaoPhucKhaoDiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaoPhucKhaoDiem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaoPhucKhaoDiem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_quayve;
    private javax.swing.JButton bt_taopk;
    private com.toedter.calendar.JDateChooser date_ngaybd;
    private com.toedter.calendar.JDateChooser date_ngaykt;
    private com.toedter.calendar.JDayChooser jDayChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private com.toedter.calendar.JMonthChooser jMonthChooser1;
    private javax.swing.JPanel jPanel14;
    // End of variables declaration//GEN-END:variables
}