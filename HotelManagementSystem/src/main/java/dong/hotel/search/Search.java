/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dong.hotel.search;

import dong.hotel.check.RoomState;
import dong.hotel.file.Sfr200Process;
import dong.hotel.file.Sfr300Process;
import dong.hotel.mainmenu.MainMenu;
import dong.hotel.reservation.CustomerInfor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author heehe
 */
public class Search extends javax.swing.JFrame {

    /**
     * Creates new form Search
     */
    public Search() {
        initComponents();
    }
    private ArrayList<CustomerInfor> customerinfo = new ArrayList<>();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nameF = new javax.swing.JTextField();
        roomF = new javax.swing.JTextField();
        phoneF = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        searchT = new javax.swing.JTable();
        Back_Button = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("이름");

        jLabel2.setText("호실");

        jLabel3.setText("전화번호");

        jButton1.setText("검색");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        searchT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "이름", "호실", "인원", "전화번호", "체크인날짜", "체크아웃날짜"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        searchT.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(searchT);
        if (searchT.getColumnModel().getColumnCount() > 0) {
            searchT.getColumnModel().getColumn(0).setMinWidth(20);
            searchT.getColumnModel().getColumn(0).setPreferredWidth(20);
            searchT.getColumnModel().getColumn(1).setMinWidth(15);
            searchT.getColumnModel().getColumn(1).setPreferredWidth(15);
            searchT.getColumnModel().getColumn(2).setMinWidth(10);
            searchT.getColumnModel().getColumn(2).setPreferredWidth(10);
            searchT.getColumnModel().getColumn(4).setMinWidth(30);
            searchT.getColumnModel().getColumn(4).setPreferredWidth(30);
            searchT.getColumnModel().getColumn(5).setMinWidth(30);
            searchT.getColumnModel().getColumn(5).setPreferredWidth(30);
        }

        Back_Button.setText("이전");
        Back_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_ButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("고객 정보 검색 ");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nameF)
                                    .addComponent(roomF)
                                    .addComponent(phoneF, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                                .addGap(41, 41, 41)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addComponent(Back_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 144, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roomF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(phoneF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Back_Button)
                .addGap(16, 16, 16))
        );

        jLabel1.getAccessibleContext().setAccessibleName("iLabel1");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Back_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_ButtonActionPerformed
        // TODO add your handling code here:
        MainMenu back = new MainMenu();
        back.setVisible(true);
        dispose();
    }//GEN-LAST:event_Back_ButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Sfr200Process ciF = new Sfr200Process();
            ciF.fRead();
            ciF.sPlite();
            customerinfo = ciF.returnGuestInfo();

            String name = nameF.getText();
            String room = roomF.getText();
            String phone = phoneF.getText();
            String outDate = "";
            String inDate = "";
            int caution = -1;

            DefaultTableModel search = (DefaultTableModel) searchT.getModel();
            search.setNumRows(0);

            for (int i = 0; i < customerinfo.size(); i++) {
                if(customerinfo.get(i).getGuarantee().equals("예약취소")){
                        i++;
                    }
                //호실 이름 둘다 입력한경우
                if (!room.equals("") && !name.equals("") && !phone.equals("")) {
                    if (customerinfo.get(i).getName().equals(name) && customerinfo.get(i).getRoomNum().equals(room) && customerinfo.get(i).getPhoneNum().equals(phone)) {
                        inDate = String.format("%s-%s-%s", customerinfo.get(i).getcInYear(), customerinfo.get(i).getcInMonth(), customerinfo.get(i).getcInDay());
                        outDate = String.format("%s-%s-%s", customerinfo.get(i).getcOutYear(), customerinfo.get(i).getcOutMonth(), customerinfo.get(i).getcOutDay());
                        search.insertRow(search.getRowCount(), new Object[]{
                            customerinfo.get(i).getName(), customerinfo.get(i).getRoomNum(), customerinfo.get(i).getCustomerNum(),
                            customerinfo.get(i).getPhoneNum(), inDate, outDate});
                        caution = 0;
                    }
                } //이름 폰번호 입력된 경우
                else if (room.equals("") && !name.equals("") && !phone.equals("")) {
                    if (customerinfo.get(i).getName().equals(name) && customerinfo.get(i).getPhoneNum().equals(phone)) {
                        inDate = String.format("%s-%s-%s", customerinfo.get(i).getcInYear(), customerinfo.get(i).getcInMonth(), customerinfo.get(i).getcInDay());
                        outDate = String.format("%s-%s-%s", customerinfo.get(i).getcOutYear(), customerinfo.get(i).getcOutMonth(), customerinfo.get(i).getcOutDay());
                        search.insertRow(search.getRowCount(), new Object[]{
                            customerinfo.get(i).getName(), customerinfo.get(i).getRoomNum(), customerinfo.get(i).getCustomerNum(),
                            customerinfo.get(i).getPhoneNum(), inDate, outDate});
                        caution = 0;
                    }
                } //호실 이름 입력된경우
                else if (!room.equals("") && !name.equals("") && phone.equals("")) {
                    if (customerinfo.get(i).getName().equals(name) && customerinfo.get(i).getRoomNum().equals(room)) {
                        inDate = String.format("%s-%s-%s", customerinfo.get(i).getcInYear(), customerinfo.get(i).getcInMonth(), customerinfo.get(i).getcInDay());
                        outDate = String.format("%s-%s-%s", customerinfo.get(i).getcOutYear(), customerinfo.get(i).getcOutMonth(), customerinfo.get(i).getcOutDay());
                        search.insertRow(search.getRowCount(), new Object[]{
                            customerinfo.get(i).getName(), customerinfo.get(i).getRoomNum(), customerinfo.get(i).getCustomerNum(),
                            customerinfo.get(i).getPhoneNum(), inDate, outDate});
                        caution = 0;
                    }
                } //호실 폰번호 입력된경우
                else if (!room.equals("") && name.equals("") && !phone.equals("")) {
                    if (customerinfo.get(i).getRoomNum().equals(room) && customerinfo.get(i).getPhoneNum().equals(phone)) {
                        inDate = String.format("%s-%s-%s", customerinfo.get(i).getcInYear(), customerinfo.get(i).getcInMonth(), customerinfo.get(i).getcInDay());
                        outDate = String.format("%s-%s-%s", customerinfo.get(i).getcOutYear(), customerinfo.get(i).getcOutMonth(), customerinfo.get(i).getcOutDay());
                        search.insertRow(search.getRowCount(), new Object[]{
                            customerinfo.get(i).getName(), customerinfo.get(i).getRoomNum(), customerinfo.get(i).getCustomerNum(),
                            customerinfo.get(i).getPhoneNum(), inDate, outDate});
                        caution = 0;
                    }
                } //한가지만 입력된경우
                else {
                    if (customerinfo.get(i).getName().equals(name) || customerinfo.get(i).getRoomNum().equals(room) || customerinfo.get(i).getPhoneNum().equals(phone)) {
                        inDate = String.format("%s-%s-%s", customerinfo.get(i).getcInYear(), customerinfo.get(i).getcInMonth(), customerinfo.get(i).getcInDay());
                        outDate = String.format("%s-%s-%s", customerinfo.get(i).getcOutYear(), customerinfo.get(i).getcOutMonth(), customerinfo.get(i).getcOutDay());
                        search.insertRow(search.getRowCount(), new Object[]{
                            customerinfo.get(i).getName(), customerinfo.get(i).getRoomNum(), customerinfo.get(i).getCustomerNum(),
                            customerinfo.get(i).getPhoneNum(), inDate, outDate});
                        caution = 0;
                    }
                }
            }
            
            //잘못된 입력값 팝업
            if (caution != 0) {
                JOptionPane.showMessageDialog(null, "검색 내용을 정확히 입력해주세요");
            }

        } catch (IOException ex) {
            Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_Button;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameF;
    private javax.swing.JTextField phoneF;
    private javax.swing.JTextField roomF;
    private javax.swing.JTable searchT;
    // End of variables declaration//GEN-END:variables
}
