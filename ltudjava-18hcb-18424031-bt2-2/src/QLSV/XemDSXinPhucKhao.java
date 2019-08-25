package QLSV;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import DAO.DiemLopMonDAO;
import DAO.LopDAO;
import POJOS.Diemlopmon;
import POJOS.DiemlopmonId;
import POJOS.Lop;
import DAO.TaoPhucKhaoDiemDAO;
import POJOS.Taophuckhaodiem;
import DAO.XinPhucKhaoDiemDAO;
import POJOS.Xinphuckhaodiem;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class XemDSXinPhucKhao extends javax.swing.JFrame {

    static int idpk=0;
    static String malop="";
    static String mamon="";
    static String mssv="";
    static String hoten="";
    static float dgk;
    static float dck;
    static float dk;
    static float dt;
    private String[] columnNames = {
        "STT", "MSSV", "Mã lớp", "Mã môn", "Họ Tên", "Điểm GK", "Điểm CK", "Điểm Khác", "Điểm Tổng", "Lý do", "Tình trạng"
    };
    /**
     * Creates new form QuanLyDiem
     */
    public XemDSXinPhucKhao() {
        initComponents();
        initLayoutid();
        malop="";
    }

    private void initLayoutid() {
        List<Taophuckhaodiem> DS = TaoPhucKhaoDiemDAO.gettaopk();
        if(DS.size()>0)
        {
            DefaultComboBoxModel comboboxModel = new DefaultComboBoxModel();
            //System.out.println("có");
            for (Taophuckhaodiem l : DS) {
                comboboxModel.addElement(l.getId());
            }
            jcb_dot.setModel(comboboxModel);
        } else 
        {
            jcb_dot.setModel(new javax.swing.DefaultComboBoxModel(new String[]{}));
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_kocn = new javax.swing.JButton();
        bt_suadiem = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jcb_dot = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        bt_quayve = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bt_kocn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bt_kocn.setText("Không Cập Nhật");
        bt_kocn.setName("bt_kocn"); // NOI18N
        bt_kocn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_kocnActionPerformed(evt);
            }
        });

        bt_suadiem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bt_suadiem.setText("Sửa Điểm");
        bt_suadiem.setName("bt_suadiem"); // NOI18N
        bt_suadiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_suadiemActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Đợt:");

        jcb_dot.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcb_dot.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcb_dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_dotActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcb_dot, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 616, Short.MAX_VALUE)
                        .addComponent(bt_kocn)
                        .addGap(18, 18, 18)
                        .addComponent(bt_suadiem)
                        .addGap(18, 18, 18)
                        .addComponent(bt_quayve)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_quayve)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bt_suadiem)
                        .addComponent(bt_kocn)
                        .addComponent(jLabel6)
                        .addComponent(jcb_dot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_quayveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_quayveActionPerformed
        // TODO add your handling code here:
        GiaoVu gv = new GiaoVu();
        gv.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bt_quayveActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        //malop =(String) jcb_lop.getSelectedItem();
        //mamon =(String) jcb_mon.getSelectedItem();
        int i=jTable1.getSelectedRow();
        TableModel model=jTable1.getModel();
        mssv=model.getValueAt(i,1).toString();
        mamon=model.getValueAt(i,2).toString();
        malop=model.getValueAt(i,3).toString();
        dgk=Float.parseFloat(model.getValueAt(i,5).toString());
        dck=Float.parseFloat(model.getValueAt(i,6).toString());
        dk=Float.parseFloat(model.getValueAt(i,7).toString());
        dt=Float.parseFloat(model.getValueAt(i,8).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jcb_dotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_dotActionPerformed
        // TODO add your handling code here:
        idpk=(int) jcb_dot.getSelectedItem();
        xemdspk();
    }//GEN-LAST:event_jcb_dotActionPerformed

    private void xemdspk()
    {
        int stt = 1;
        List<Xinphuckhaodiem> dsdlm = XinPhucKhaoDiemDAO.getlistxinpk(idpk);
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(columnNames);
        if(dsdlm.size()>0)
        {
            for (Xinphuckhaodiem dlm : dsdlm){
                String[] rows = new String[11];
                rows[0] = String.valueOf(stt);
                rows[1] = dlm.getId().getMssv();
                rows[2] = dlm.getId().getMamon();
                rows[3] = dlm.getId().getMalop();
                rows[4] = dlm.getHoten();
                rows[5] = dlm.getDiemck().toString();
                rows[6] = dlm.getDiemck().toString();
                rows[7] = dlm.getDiemkhac().toString();
                rows[8] = dlm.getDiemtong().toString();
                rows[9] = dlm.getLido();
                if(Integer.parseInt(dlm.getTinhtrang().toString())==1)
                {
                    rows[10] = "Chưa Xem";
                }
                else if(Integer.parseInt(dlm.getTinhtrang().toString())==2)
                {
                    rows[10] = "Không cập nhật";
                }
                else
                {
                    rows[10] = "Đã cập nhật";
                }
                tableModel.addRow(rows);
                stt++;
            }
            jTable1.setModel(tableModel);
        }
        else
        {
            jTable1.setModel(tableModel);
        }
    }
    
    private void bt_suadiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_suadiemActionPerformed
        // TODO add your handling code here:
        if(!mssv.equals(""))
        {
            SuaDiemSVPK sd =new SuaDiemSVPK();
            sd.setVisible(true);
            this.setVisible(false);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Chưa chọn sinh viện cần sửa.", "Notification", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_bt_suadiemActionPerformed

    private void bt_kocnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_kocnActionPerformed
        if(!mssv.equals(""))
        {
            if(XinPhucKhaoDiemDAO.updatetinhtran(idpk, mssv, mamon, malop, 2)==true);
                {
                    JOptionPane.showMessageDialog(null, "Đã cập nhật sinh viên là không cập nhật thành công.");
                }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Chưa chọn sinh viện không cập nhật.", "Notification", JOptionPane.WARNING_MESSAGE);
        }
        idpk=0;
        mssv="";
    }//GEN-LAST:event_bt_kocnActionPerformed
   
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
            java.util.logging.Logger.getLogger(XemDSXinPhucKhao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XemDSXinPhucKhao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XemDSXinPhucKhao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XemDSXinPhucKhao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new XemDSXinPhucKhao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_kocn;
    private javax.swing.JButton bt_quayve;
    private javax.swing.JButton bt_suadiem;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox jcb_dot;
    // End of variables declaration//GEN-END:variables
}
