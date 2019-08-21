package QLSV;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import DAO.TkbDAO;
import POJOS.Tkb;
import POJOS.TkbId;
import DAO.LopDAO;
import POJOS.Lop;
import DAO.MonDAO;
import POJOS.Mon;
import javax.swing.DefaultComboBoxModel;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class QuanLyTKB extends javax.swing.JFrame {

    private String[] columnNames = {
        "STT", "Mã Lớp", "Mã Môn", "Tên Môn", "Phòng"
    };
    
    /**
     * Creates new form QuanLyTKB
     */
    public QuanLyTKB() {
        initComponents();
        initLayoutlop();
    }

    private void initLayoutlop() {
        List<Lop> DSLop = LopDAO.getlistlop();
        if(DSLop.size()>0)
        {
            DefaultComboBoxModel comboboxModel = new DefaultComboBoxModel();
            //System.out.println("có");
            for (Lop l : DSLop) {
                Lop _l = LopDAO.getlop(l.getMalop());
                comboboxModel.addElement(l.getMalop());
            }
            jcb_loptkb.setModel(comboboxModel);
        } else 
        {
            jcb_loptkb.setModel(new javax.swing.DefaultComboBoxModel(new String[]{}));
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

        bt_importtkb = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        bt_themsv = new javax.swing.JButton();
        bt_xoasv = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jcb_lop = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jcb_mon = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jcb_loptkb = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bt_importtkb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bt_importtkb.setText("Import TKB");
        bt_importtkb.setName("bt_importtkb"); // NOI18N
        bt_importtkb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_importtkbActionPerformed(evt);
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
        jScrollPane1.setViewportView(jTable1);

        bt_themsv.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bt_themsv.setText("Thêm Sinh Viên");
        bt_themsv.setName("bt_themsv"); // NOI18N

        bt_xoasv.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bt_xoasv.setText("Xóa Sinh Viên");
        bt_xoasv.setName("bt_xoasv"); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Lớp:");

        jcb_lop.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcb_lop.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Môn:");

        jcb_mon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcb_mon.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Lớp:");

        jcb_loptkb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcb_loptkb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcb_loptkb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_loptkbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(12, 12, 12)
                        .addComponent(jcb_lop, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addGap(12, 12, 12)
                        .addComponent(jcb_mon, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_themsv)
                        .addGap(18, 18, 18)
                        .addComponent(bt_xoasv))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_importtkb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jcb_loptkb, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jcb_loptkb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bt_importtkb))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jcb_mon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jcb_lop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bt_xoasv)
                        .addComponent(bt_themsv)
                        .addComponent(jLabel6)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_importtkbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_importtkbActionPerformed
        // TODO add your handling code here:
        ChosseFile("Choose file import");
    }//GEN-LAST:event_bt_importtkbActionPerformed

    private void jcb_loptkbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_loptkbActionPerformed
        // TODO add your handling code here:
        String malop =(String) jcb_loptkb.getSelectedItem();
        if (!malop.equals("null")) {
            xemtkb(malop);
        } else {
            JOptionPane.showMessageDialog(null, "Chưa có danh sách lớp học.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jcb_loptkbActionPerformed

    private void xemtkb(String malop) {
        int stt = 1;
        List<Tkb> dstkb = TkbDAO.getlisttkb(malop);
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(columnNames);
        for (Tkb sv : dstkb) {
            String[] rows = new String[5];
            rows[0] = String.valueOf(stt);
            rows[1] = sv.getId().getMalop();
            rows[2] = sv.getId().getMamon();
            rows[3] = sv.getTenmon();
            rows[4] = sv.getPhong();
            tableModel.addRow(rows);
            stt++;
        }
        jTable1.setModel(tableModel);
    }
    
    private void ChosseFile(String choose_file_import) {
        JFileChooser fileChooser = new JFileChooser();
        //fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            insertdata(selectedFile);
            //System.out.println("Selected file: " + selectedFile.getAbsolutePath());
        }
    }
    
    private void insertdata(File selectedFile) {
        String csvFile = selectedFile.toString();
        String cvsSplitBy = ",";
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(csvFile));
            String line = "";
            int d=0;
            String mamonnoinsert="";
            try {
                if((line = br.readLine()) != null)
                {
                    String[] l = line.split(cvsSplitBy);
                    String malop = l[0].toString();
                    if(LopDAO.getlop(malop)!= null)
                    {
                        JOptionPane.showMessageDialog(this, "Chưa insert lớp "+malop+".");
                    }
                    else
                    {
                        while ((line = br.readLine()) != null) {                   
                            String [] tkb = line.split(cvsSplitBy);
                            TkbId id = new TkbId(malop, tkb[0]);
                            Tkb kb=new Tkb(id, tkb[1], tkb[2]);
                            Mon m=new Mon(tkb[0], tkb[1]);
                            if(MonDAO.getmon(m.getMamon())==null)
                            {
                                MonDAO.createmon(m);
                            }
                            if(TkbDAO.createtkb(kb)==true)
                            {
                                d++;       
                            }   
                            else
                            {
                                mamonnoinsert=tkb[1]+",";
                            }
                        }
                        JOptionPane.showMessageDialog(this, "Đã insert "+d+" môn.\nMôn chưa đưa vào:");
//                        GiaoVu gv = new GiaoVu();
//                        gv.setVisible(true);
//                        this.setVisible(false);
                    }
                }
                
            } catch (IOException ex) {
                Logger.getLogger(QuanLyLop.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(QuanLyLop.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            java.util.logging.Logger.getLogger(QuanLyTKB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyTKB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyTKB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyTKB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyTKB().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_importtkb;
    private javax.swing.JButton bt_themsv;
    private javax.swing.JButton bt_xoasv;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JComboBox jcb_lop;
    private javax.swing.JComboBox jcb_loptkb;
    private javax.swing.JComboBox jcb_mon;
    // End of variables declaration//GEN-END:variables
}
