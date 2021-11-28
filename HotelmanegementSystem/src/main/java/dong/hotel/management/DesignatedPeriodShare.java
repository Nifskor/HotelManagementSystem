/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dong.hotel.management;

import dong.hotel.file.Sfr200Process;
import dong.hotel.reservation.CustomerInfor;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nifskorea
 */
public class DesignatedPeriodShare extends javax.swing.JFrame {

    /**
     * Creates new form DesignatedPeriodShare
     */
    public DesignatedPeriodShare() {
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

        jLabel1 = new javax.swing.JLabel();
        outyear2 = new javax.swing.JComboBox<>();
        outmonth1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        outday1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        outyear1 = new javax.swing.JComboBox<>();
        outmonth2 = new javax.swing.JComboBox<>();
        outday2 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        incomeT = new javax.swing.JTable();
        back_Butt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("굴림", 0, 24)); // NOI18N
        jLabel1.setText("객실 수입");

        outyear2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022", "2023" }));

        outmonth1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jButton1.setText("조회");
        jButton1.setActionCommand("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        outday1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel3.setFont(new java.awt.Font("굴림", 0, 14)); // NOI18N
        jLabel3.setText("~");

        outyear1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022", "2023" }));

        outmonth2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        outday2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        incomeT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "날짜", "수입"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        incomeT.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(incomeT);

        back_Butt.setText("이전");
        back_Butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_ButtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(back_Butt, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(outyear1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(outmonth1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(outday1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(outyear2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(outmonth2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(outday2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jLabel1)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(outyear1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outmonth1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outday1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(outyear2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outmonth2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outday2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(back_Butt)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back_ButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_ButtActionPerformed
        ManagementMainMenu back = new ManagementMainMenu();
        back.setVisible(true);
        dispose();
    }//GEN-LAST:event_back_ButtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            //hotelpay읽는 파일처리클래스
            Sfr200Process sr = new Sfr200Process();
            sr.fRead();
            sr.sPlite();

            ArrayList<CustomerInfor>guestInfo = sr.returnGuestInfo();
            
            //콤보박스 입력값
            String oyear1 = outyear1.getSelectedItem().toString();
            String omonth1 = outmonth1.getSelectedItem().toString();
            String oday1 = outday1.getSelectedItem().toString();
            String oyear2 = outyear2.getSelectedItem().toString();
            String omonth2 = outmonth2.getSelectedItem().toString();
            String oday2 = outday2.getSelectedItem().toString();
            //날짜 포맷
            String outDate1=String.format("%s-%s-%s", oyear1,omonth1,oday1);
            String outDate2=String.format("%s-%s-%s", oyear2,omonth2,oday2);
            
            String term = String.format("%s ~ %s", outDate1,outDate2);
            
            DefaultTableModel search = (DefaultTableModel) incomeT.getModel();
            try {
                SimpleDateFormat format = new SimpleDateFormat("yyyy|mm|dd");
                String Indate = oyear2 + "|" + omonth1 + "|" + oday1;
                String Indate1 = oyear1 + "|" + omonth2 + "|" + oday2;
                String ogg = oyear2 + "." + omonth1 + "." + oday1 + "~" + oyear1 + "." + omonth2 + "." + oday2;
                int compare = 0;
                int compare1 = 0;
                float count = 0;
                int fee = 0;
                int checkyear = Integer.parseInt(outyear2.getSelectedItem().toString());
                int checkyear1 = Integer.parseInt(outyear1.getSelectedItem().toString());
                int checkmonth = Integer.parseInt(outmonth1.getSelectedItem().toString());
                int checkmonth1 = Integer.parseInt(outmonth2.getSelectedItem().toString());
                int checkday = Integer.parseInt(outday1.getSelectedItem().toString());
                int checkday1 = Integer.parseInt(outday2.getSelectedItem().toString());
              //  System.out.println(checkyear);
                for (int i = 0; i < guestInfo.size(); i++) {
                    String guestDate = guestInfo.get(i).getcInYear() + "|" + guestInfo.get(i).getcInMonth() + "|" + guestInfo.get(i).getcInDay();
                    System.out.println(guestDate);
                    System.out.println(guestDate);
                    Date guestdate = format.parse(guestDate);
                    compare = Indate.compareTo(guestDate);
                    compare1 = Indate1.compareTo(guestDate);
                     System.out.println(compare);
                    System.out.println(compare1);
                   // System.out.println(guestDate);
                    if (compare <= 0 && compare1 >= 0) {
                        System.out.println(compare1);
                        System.out.println(compare);
                        String pay = guestInfo.get(i).getRoomPrice();
                       // int money = Integer.parseInt(pay);
                        count += 1.0;
                       // fee += money;
                    }
                }
                if (checkyear1 < checkyear) {
                    JOptionPane.showMessageDialog(null, "잘못된 날짜 값 입니다.");
                } else if (checkyear1 == checkyear && checkmonth1 < checkmonth) {
                    JOptionPane.showMessageDialog(null, "잘못된 날짜 값 입니다.");
                } else if (checkyear1 == checkyear && checkmonth1 == checkmonth && checkday1 < checkday) {
                    JOptionPane.showMessageDialog(null, "잘못된 날짜 값 입니다.");
                }
                if (count != 0) {
                    search.insertRow(search.getRowCount(), new Object[]{
                        ogg,
                        count / 100,
                       // fee
                    });
                    
                }
                
            } catch (ParseException e) {
            }
        }
        catch(IOException ex ){
            
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(DesignatedPeriodShare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DesignatedPeriodShare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DesignatedPeriodShare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DesignatedPeriodShare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
 try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DesignatedPeriodShare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DesignatedPeriodShare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DesignatedPeriodShare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DesignatedPeriodShare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                   new DesignatedPeriodShare().setVisible(true);
            }
        });
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_Butt;
    private javax.swing.JTable incomeT;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> outday1;
    private javax.swing.JComboBox<String> outday2;
    private javax.swing.JComboBox<String> outmonth1;
    private javax.swing.JComboBox<String> outmonth2;
    private javax.swing.JComboBox<String> outyear1;
    private javax.swing.JComboBox<String> outyear2;
    // End of variables declaration//GEN-END:variables
}
