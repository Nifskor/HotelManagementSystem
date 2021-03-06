/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dong.hotel.check;

import dong.hotel.file.RoomStateSave;
import dong.hotel.file.Sfr200Process;
import dong.hotel.file.Sfr300Process;
import dong.hotel.mainmenu.MainMenu;
import dong.hotel.reservation.CustomerInfor;
import dong.hotel.reservation.ReservationMenu;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nifskorea
 */
public class CheckIN extends javax.swing.JFrame {

    private ArrayList<CustomerInfor> customerinfor = new ArrayList<>();
    private ArrayList<RoomState> roomstate = new ArrayList<>();

    public CheckIN() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ReservationCheckIn = new javax.swing.JDialog();
        CheckIn_panel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        SearchName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        SearchRoom = new javax.swing.JTextField();
        Bsearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        reservationTable = new javax.swing.JTable();
        Back_B = new javax.swing.JButton();
        take_Butt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Not_Reservation_BUTT = new javax.swing.JButton();
        Reservation_BUTT = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        Room_Num = new javax.swing.JTextField();
        Guest_Num = new javax.swing.JTextField();
        Back_BUTT = new javax.swing.JButton();
        CheckIn_BUTT = new javax.swing.JButton();

        ReservationCheckIn.setMinimumSize(new java.awt.Dimension(500, 320));

        jLabel5.setText("??????");

        jLabel6.setText("??????");

        Bsearch.setText("??????");
        Bsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsearchActionPerformed(evt);
            }
        });

        reservationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "??????", "??????", "??????", "??????", "??????"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        reservationTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(reservationTable);
        if (reservationTable.getColumnModel().getColumnCount() > 0) {
            reservationTable.getColumnModel().getColumn(0).setMinWidth(5);
            reservationTable.getColumnModel().getColumn(0).setPreferredWidth(5);
            reservationTable.getColumnModel().getColumn(1).setMinWidth(5);
            reservationTable.getColumnModel().getColumn(1).setPreferredWidth(5);
            reservationTable.getColumnModel().getColumn(2).setMinWidth(1);
            reservationTable.getColumnModel().getColumn(2).setPreferredWidth(1);
            reservationTable.getColumnModel().getColumn(3).setMinWidth(5);
            reservationTable.getColumnModel().getColumn(3).setPreferredWidth(5);
        }

        Back_B.setText("??????");
        Back_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_BActionPerformed(evt);
            }
        });

        take_Butt.setText("????????????");
        take_Butt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                take_ButtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CheckIn_panelLayout = new javax.swing.GroupLayout(CheckIn_panel);
        CheckIn_panel.setLayout(CheckIn_panelLayout);
        CheckIn_panelLayout.setHorizontalGroup(
            CheckIn_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CheckIn_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Back_B, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(take_Butt, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(CheckIn_panelLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(CheckIn_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(CheckIn_panelLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SearchRoom))
                    .addGroup(CheckIn_panelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SearchName, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(Bsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(CheckIn_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                .addContainerGap())
        );
        CheckIn_panelLayout.setVerticalGroup(
            CheckIn_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CheckIn_panelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(CheckIn_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(SearchName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CheckIn_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CheckIn_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SearchRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Bsearch)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CheckIn_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back_B)
                    .addComponent(take_Butt))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ReservationCheckInLayout = new javax.swing.GroupLayout(ReservationCheckIn.getContentPane());
        ReservationCheckIn.getContentPane().setLayout(ReservationCheckInLayout);
        ReservationCheckInLayout.setHorizontalGroup(
            ReservationCheckInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 483, Short.MAX_VALUE)
            .addGroup(ReservationCheckInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(CheckIn_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ReservationCheckInLayout.setVerticalGroup(
            ReservationCheckInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
            .addGroup(ReservationCheckInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ReservationCheckInLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(CheckIn_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(30, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("??????", 0, 24)); // NOI18N
        jLabel1.setText("?????????");

        Not_Reservation_BUTT.setText("????????? ??????");
        Not_Reservation_BUTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Not_Reservation_BUTTActionPerformed(evt);
            }
        });

        Reservation_BUTT.setText("?????? ??????");
        Reservation_BUTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reservation_BUTTActionPerformed(evt);
            }
        });

        jLabel2.setText("??????");

        jLabel3.setText("??????");

        jLabel4.setText("??????");

        Name.setEditable(false);
        Name.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });

        Room_Num.setEditable(false);

        Guest_Num.setEditable(false);

        Back_BUTT.setText("??????");
        Back_BUTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_BUTTActionPerformed(evt);
            }
        });

        CheckIn_BUTT.setText("?????????");
        CheckIn_BUTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckIn_BUTTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(Back_BUTT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(50, 50, 50)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Room_Num, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(CheckIn_BUTT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Reservation_BUTT, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(Not_Reservation_BUTT)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Guest_Num, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Not_Reservation_BUTT)
                    .addComponent(Reservation_BUTT))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(Room_Num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(Guest_Num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back_BUTT)
                    .addComponent(CheckIn_BUTT))
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Back_BUTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_BUTTActionPerformed
        MainMenu back = new MainMenu();
        back.setVisible(true);
        dispose();
    }//GEN-LAST:event_Back_BUTTActionPerformed

    private void Not_Reservation_BUTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Not_Reservation_BUTTActionPerformed
        ReservationMenu next = new ReservationMenu();
        next.setVisible(true);
        dispose();
    }//GEN-LAST:event_Not_Reservation_BUTTActionPerformed

    private void Reservation_BUTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reservation_BUTTActionPerformed
        //???????????? ???????????? ?????????????????????+ ????????????
        SearchName.setText("");
        SearchRoom.setText("");

        DefaultTableModel reservation = (DefaultTableModel) reservationTable.getModel();
        reservation.setNumRows(0);//reservationTable?????????
        try {
            Sfr200Process cF = new Sfr200Process();
            cF.fRead();
            cF.sPlite();
            customerinfor = cF.returnGuestInfo();

            try {
                //??????????????????
                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                String date = df.format(System.currentTimeMillis());

                Date systemDate = df.parse(date);

                for (int i = 0; i < customerinfor.size(); i++) {
                    //????????? ??????
                    if (customerinfor.get(i).getGuarantee().equals("????????????")) {
                        i++;
                    }
                    String checkIn = String.format("%s-%s-%s", customerinfor.get(i).getcInYear(), customerinfor.get(i).getcInMonth(), customerinfor.get(i).getcInDay());
                    Date inDate = df.parse(checkIn);
                    String checkOut = String.format("%s-%s-%s", customerinfor.get(i).getcOutYear(), customerinfor.get(i).getcOutMonth(), customerinfor.get(i).getcOutDay());
                    String stayDate = String.format("%s ~ %s", checkIn, checkOut);

                    if (inDate.compareTo(systemDate) >= 0) {//?????????????????? ?????????????????? ????????? ????????????
                        //???????????? ??????!
                        reservation.insertRow(reservation.getRowCount(), new Object[]{
                            customerinfor.get(i).getName(),
                            customerinfor.get(i).getRoomNum(),
                            customerinfor.get(i).getCustomerNum(),
                            customerinfor.get(i).getGuarantee(),
                            stayDate
                        });
                    }
                }
            } catch (ParseException ex) {
                Logger.getLogger(CheckIN.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (IOException ex) {
            Logger.getLogger(CheckIN.class.getName()).log(Level.SEVERE, null, ex);
        }
        ReservationCheckIn.setVisible(true);

    }//GEN-LAST:event_Reservation_BUTTActionPerformed

    private void take_ButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_take_ButtActionPerformed
        //???????????? ?????? ????????????!
        DefaultTableModel model = (DefaultTableModel) reservationTable.getModel();

        int nRow = -1;
        int nColumn = -1;

        //??????????????? ????????? ?????????
        nRow = reservationTable.getSelectedRow();
        nColumn = reservationTable.getSelectedColumn();

        if (nRow == -1 && nColumn == -1) {//??????????????????
            JOptionPane.showMessageDialog(null, "??????????????? ??????????????????");
        } else {
            //?????? table????????????
            String name = (String) model.getValueAt(nRow, 0);
            String room = (String) model.getValueAt(nRow, 1);
            String guest = (String) model.getValueAt(nRow, 2);
            String type = (String) model.getValueAt(nRow, 3);
            if (type.equals("????????????")) {//???????????? ?????????
                JOptionPane.showMessageDialog(null, "??????????????? ??????????????????");
                ReservationCheckIn.setVisible(false);
                ReservationMenu next = new ReservationMenu();
                next.setVisible(true);
                dispose();
            } else {
                Name.setText(name);
                Room_Num.setText(room);
                Guest_Num.setText(guest);
                ReservationCheckIn.setVisible(false);
            }
        }
    }//GEN-LAST:event_take_ButtActionPerformed

    private void Back_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_BActionPerformed
        ReservationCheckIn.setVisible(false);
    }//GEN-LAST:event_Back_BActionPerformed

    private void CheckIn_BUTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckIn_BUTTActionPerformed
        //??????????????? ????????? ??????????????????
        //???????????? ????????????
        //???????????? ????????? ????????? ??????
        try {
            String name = Name.getText();
            String room = Room_Num.getText();
            String guest = Guest_Num.getText();

            String time = new SimpleDateFormat("HH:mm").format(System.currentTimeMillis());
            String t = new SimpleDateFormat("HH").format(System.currentTimeMillis());
            Sfr200Process cF = new Sfr200Process();
            cF.fRead();
            cF.sPlite();
            customerinfor = cF.returnGuestInfo();
            Sfr300Process rF = new Sfr300Process();
            rF.fRead();
            rF.sPlite();
            roomstate = rF.returnRoomState();
            String inDate = "";
            String outDate = "";

            for (int i = 0; i < roomstate.size(); i++) {
                if (roomstate.get(i).getRoom().equals(room) && roomstate.get(i).getRoomState().equals("empty") && Integer.parseInt(t) >= 15) {//
                    //??????????????? ????????????3???????????????(+?????????????????? ???????????? ???????????????????????? ????????? ?????????)
                    for (int j = 0; j < customerinfor.size(); j++) {
                        if (customerinfor.get(j).getName().equals(name) && customerinfor.get(j).getRoomNum().equals(room) && customerinfor.get(j).getCustomerNum().equals(guest)) {
                            inDate = String.format("%s-%s-%s", customerinfor.get(j).getcInYear(), customerinfor.get(j).getcInMonth(), customerinfor.get(j).getcInDay());
                            outDate = String.format("%s-%s-%s", customerinfor.get(j).getcOutYear(), customerinfor.get(j).getcOutMonth(), customerinfor.get(j).getcOutDay());
                        }
                    }
                    RoomStateSave checkIn = new RoomStateSave();
                    if (inDate != "" && outDate != "") {
                        checkIn.inguest(roomstate.get(i).getIndex(), room, name, guest, inDate, time, outDate);
                    }
                    JOptionPane.showMessageDialog(null, "????????? ?????????????????????.");
                } else if (roomstate.get(i).getRoom().equals(room) && roomstate.get(i).getRoomState().equals("empty") && Integer.parseInt(t) < 15) {//
                    JOptionPane.showMessageDialog(null, "????????? ????????? ????????? ????????????.", "????????? ??????", JOptionPane.ERROR_MESSAGE);
                } else if (roomstate.get(i).getRoom().equals(room) && roomstate.get(i).getRoomState().equals("full")) {
                    JOptionPane.showMessageDialog(null, "????????? ????????? ????????????.", "????????? ??????", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (IOException ex) {
            Logger.getLogger(CheckIN.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_CheckIn_BUTTActionPerformed

    private void BsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsearchActionPerformed
        //???????????? ??????????????????
        String name = SearchName.getText();
        String room = SearchRoom.getText();
        int caution = -1;
        //room?????? name??? ??????????????? ?????????????????????
        for (int i = 0; i < customerinfor.size(); i++) {
        if (!room.equals("") && !name.equals("")) {
           // for (int i = 0; i < customerinfor.size(); i++) {
                //?????? ?????? ?????? ???????????????
                // if (!room.equals("") && !name.equals("")) {//??? ??? ????????? ??????
                if (customerinfor.get(i).getName().equals(name) && customerinfor.get(i).getRoomNum().equals(room)) {
                    reservationTable.changeSelection(i, 0, false, false);
                    caution = 0;
                    break;

                } else {
                    caution = 1;
              //  }
            }
        } else if (!room.equals("") || !name.equals("")) {//????????? ????????? ??????
           // for (int i = 0; i < customerinfor.size(); i++) {
                if (customerinfor.get(i).getName().equals(name) || customerinfor.get(i).getRoomNum().equals(room)) {
                    reservationTable.changeSelection(i, 0, false, false);
                    caution = 0;
                    break;
                } else {
                    caution = 2;
                }
            }
            //????????? ??????????????? ???????????? ????????? ???????????? ??????
            if (caution == -1) {
                JOptionPane.showMessageDialog(null, "?????? ?????? ????????? ??????????????????");
            } else if (caution == 1) {
                JOptionPane.showMessageDialog(null, "?????? ??? ????????? ????????? ??????????????????");
            } else if (caution == 2) {
                JOptionPane.showMessageDialog(null, "?????? ?????? ????????? ????????? ??????????????????");
            }
      //  }
        }
    }//GEN-LAST:event_BsearchActionPerformed

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

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
            java.util.logging.Logger.getLogger(CheckIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_B;
    private javax.swing.JButton Back_BUTT;
    private javax.swing.JButton Bsearch;
    private javax.swing.JButton CheckIn_BUTT;
    private javax.swing.JPanel CheckIn_panel;
    private javax.swing.JTextField Guest_Num;
    private javax.swing.JTextField Name;
    private javax.swing.JButton Not_Reservation_BUTT;
    private javax.swing.JDialog ReservationCheckIn;
    private javax.swing.JButton Reservation_BUTT;
    private javax.swing.JTextField Room_Num;
    private javax.swing.JTextField SearchName;
    private javax.swing.JTextField SearchRoom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable reservationTable;
    private javax.swing.JButton take_Butt;
    // End of variables declaration//GEN-END:variables
}
