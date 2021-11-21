/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dong.hotel.mainmenu;

import dong.hotel.reservation.ReservationMenu;
import dong.hotel.search.Search;
import dong.hotel.check.CheckIN;
import dong.hotel.check.CheckOut;
import dong.hotel.manegement.ManegementMainMenu;
import dong.hotel.login.Login;
import javax.swing.JOptionPane;

/**
 *
 * @author heehe
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
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
        SEARCH_BUTT = new javax.swing.JButton();
        RESERVATION_BUTT = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        CHECKIN_BUTT = new javax.swing.JButton();
        CHECKOUT_BUTT = new javax.swing.JButton();
        EDIT_BUTT = new javax.swing.JButton();
        LOGOUT_BUTT = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("굴림", 1, 25)); // NOI18N
        jLabel1.setText("호텔 관리 시스템");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SEARCH_BUTT.setText("예약 조회");
        SEARCH_BUTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEARCH_BUTTActionPerformed(evt);
            }
        });

        RESERVATION_BUTT.setText("예약");
        RESERVATION_BUTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESERVATION_BUTTActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("굴림", 1, 25)); // NOI18N
        jLabel2.setText("호텔 관리 시스템");

        CHECKIN_BUTT.setText("체크인");
        CHECKIN_BUTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CHECKIN_BUTTActionPerformed(evt);
            }
        });

        CHECKOUT_BUTT.setText("체크아웃");
        CHECKOUT_BUTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CHECKOUT_BUTTActionPerformed(evt);
            }
        });

        EDIT_BUTT.setText("관리 및 보고서");
        EDIT_BUTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDIT_BUTTActionPerformed(evt);
            }
        });

        LOGOUT_BUTT.setText("로그아웃");
        LOGOUT_BUTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGOUT_BUTTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CHECKIN_BUTT, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CHECKOUT_BUTT, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RESERVATION_BUTT, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SEARCH_BUTT, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(EDIT_BUTT, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LOGOUT_BUTT, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(74, 74, 74))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SEARCH_BUTT, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RESERVATION_BUTT, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CHECKOUT_BUTT, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CHECKIN_BUTT, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LOGOUT_BUTT, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EDIT_BUTT, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RESERVATION_BUTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESERVATION_BUTTActionPerformed
        ReservationMenu next = new ReservationMenu();
        next.setVisible(true);
        dispose();
    }//GEN-LAST:event_RESERVATION_BUTTActionPerformed

    private void SEARCH_BUTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEARCH_BUTTActionPerformed
        Search next = new Search();
        next.setVisible(true);
        dispose();
    }//GEN-LAST:event_SEARCH_BUTTActionPerformed

    private void CHECKIN_BUTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHECKIN_BUTTActionPerformed
        CheckIN next = new CheckIN();
        next.setVisible(true);
        dispose();
    }//GEN-LAST:event_CHECKIN_BUTTActionPerformed

    private void CHECKOUT_BUTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHECKOUT_BUTTActionPerformed
        CheckOut next = new CheckOut();
        next.setVisible(true);
        dispose();
    }//GEN-LAST:event_CHECKOUT_BUTTActionPerformed

    private void EDIT_BUTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDIT_BUTTActionPerformed
        // TODO add your handling code here:
        //관리자만 접근가능하도록!
        Login logas = new Login();
        if(logas.getLogintype() ==0){ // 관리자 식별 
            ManegementMainMenu next = new ManegementMainMenu();
        next.setVisible(true);
        dispose();
        }else {
            JOptionPane.showMessageDialog(null, "관리자가 아닌 스태프 권환이므로 접근권환이 없습니다. 관리자에게 문의하십시오. ");
        }
        
    }//GEN-LAST:event_EDIT_BUTTActionPerformed

    private void LOGOUT_BUTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGOUT_BUTTActionPerformed
        // TODO add your handling code here:
        Login next = new Login();
        next.setVisible(true);
        dispose();
    }//GEN-LAST:event_LOGOUT_BUTTActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CHECKIN_BUTT;
    private javax.swing.JButton CHECKOUT_BUTT;
    private javax.swing.JButton EDIT_BUTT;
    private javax.swing.JButton LOGOUT_BUTT;
    private javax.swing.JButton RESERVATION_BUTT;
    private javax.swing.JButton SEARCH_BUTT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
