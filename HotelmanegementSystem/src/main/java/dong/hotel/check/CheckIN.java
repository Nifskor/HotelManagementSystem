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

        jLabel5.setText("이름");

        jLabel6.setText("호실");

        Bsearch.setText("검색");
        Bsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsearchActionPerformed(evt);
            }
        });

        reservationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "이름", "호실", "인원", "전화번호", "기간"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        reservationTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(reservationTable);
        if (reservationTable.getColumnModel().getColumnCount() > 0) {
            reservationTable.getColumnModel().getColumn(0).setMinWidth(20);
            reservationTable.getColumnModel().getColumn(0).setPreferredWidth(20);
            reservationTable.getColumnModel().getColumn(1).setMinWidth(15);
            reservationTable.getColumnModel().getColumn(1).setPreferredWidth(15);
            reservationTable.getColumnModel().getColumn(2).setMinWidth(10);
            reservationTable.getColumnModel().getColumn(2).setPreferredWidth(10);
            reservationTable.getColumnModel().getColumn(3).setMinWidth(40);
            reservationTable.getColumnModel().getColumn(3).setPreferredWidth(40);
        }

        Back_B.setText("이전");
        Back_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_BActionPerformed(evt);
            }
        });

        take_Butt.setText("불러오기");
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
                .addGroup(CheckIn_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addComponent(Bsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CheckIn_panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
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
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ReservationCheckInLayout = new javax.swing.GroupLayout(ReservationCheckIn.getContentPane());
        ReservationCheckIn.getContentPane().setLayout(ReservationCheckInLayout);
        ReservationCheckInLayout.setHorizontalGroup(
            ReservationCheckInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
            .addGroup(ReservationCheckInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ReservationCheckInLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(CheckIn_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        ReservationCheckInLayout.setVerticalGroup(
            ReservationCheckInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(ReservationCheckInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ReservationCheckInLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(CheckIn_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("굴림", 0, 24)); // NOI18N
        jLabel1.setText("체크인");

        Not_Reservation_BUTT.setText("비예약 고객");
        Not_Reservation_BUTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Not_Reservation_BUTTActionPerformed(evt);
            }
        });

        Reservation_BUTT.setText("예약 고객");
        Reservation_BUTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reservation_BUTTActionPerformed(evt);
            }
        });

        jLabel2.setText("이름");

        jLabel3.setText("인원");

        jLabel4.setText("호실");

        Name.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Back_BUTT.setText("이전");
        Back_BUTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_BUTTActionPerformed(evt);
            }
        });

        CheckIn_BUTT.setText("체크인");
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
        //예약고객 눌렀을때 예약내역좌라락+ 검색기능
        SearchName.setText("");
        SearchRoom.setText("");

        DefaultTableModel reservation = (DefaultTableModel) reservationTable.getModel();
        reservation.setNumRows(0);//reservationTable초기화
        try {
            Sfr200Process cF = new Sfr200Process();
            cF.fRead();
            cF.sPlite();
            customerinfor = cF.returnGuestInfo();

            try {
                //현재날짜포맷
                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                String date = df.format(System.currentTimeMillis());

                Date systemDate = df.parse(date);

                for (int i = 0; i < customerinfor.size(); i++) {
                    //예약일 포맷
                    String checkIn = String.format("%s-%s-%s", customerinfor.get(i).getcInYear(), customerinfor.get(i).getcInMonth(), customerinfor.get(i).getcInDay());
                    Date inDate = df.parse(checkIn);
                    String checkOut = String.format("%s-%s-%s", customerinfor.get(i).getcOutYear(), customerinfor.get(i).getcOutMonth(), customerinfor.get(i).getcOutDay());
                    String stayDate = String.format("%s ~ %s", checkIn, checkOut);

                    if (inDate.compareTo(systemDate) >= 0) {//두개비교해서 현재날짜보다 과거가 아니라면
                        //테이블에 출력!
                        reservation.insertRow(reservation.getRowCount(), new Object[]{
                            customerinfor.get(i).getName(),
                            customerinfor.get(i).getRoomNum(),
                            customerinfor.get(i).getCustomerNum(),
                            customerinfor.get(i).getPhoneNum(),
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
        //불러오기 버튼 눌렀을때!
        DefaultTableModel model = (DefaultTableModel) reservationTable.getModel();

        int nRow = -1;
        int nColumn = -1;

        //테이블에서 선택된 값으로
        nRow = reservationTable.getSelectedRow();
        nColumn = reservationTable.getSelectedColumn();

        if (nRow == -1 && nColumn == -1) {//선택안된경우
            JOptionPane.showMessageDialog(null, "예약정보를 선택해주세요");
        } else {
            //해당 table값가져옴
            Object nameR = model.getValueAt(nRow, 0);
            Object roomN = model.getValueAt(nRow, 1);
            Object guestN = model.getValueAt(nRow, 2);

            String name = nameR.toString();
            String room = roomN.toString();
            String guest = guestN.toString();

            Name.setText(name);
            Room_Num.setText(room);
            Guest_Num.setText(guest);
            ReservationCheckIn.setVisible(false);
        }
    }//GEN-LAST:event_take_ButtActionPerformed

    private void Back_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_BActionPerformed
        ReservationCheckIn.setVisible(false);
    }//GEN-LAST:event_Back_BActionPerformed

    private void CheckIn_BUTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckIn_BUTTActionPerformed
        //값불러오고 체크인 버튼눌렀을때
        //값없으면 오류출력
        //값있으면 체크인 명단에 입력
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
                if (roomstate.get(i).getRoom().equals(room) && roomstate.get(i).getRoomState().equals("empty") && Integer.parseInt(t) >= 15) {
                    //선택호실이 비어있고3시이후라면(+체크인날짜와 현재날짜 동일하다면이것도 드가면 조을듯)
                    for (int j = 0; j < customerinfor.size(); j++) {
                        if (customerinfor.get(j).getName().equals(name) && customerinfor.get(j).getRoomNum().equals(room) && customerinfor.get(j).getCustomerNum().equals(guest)) {
                            inDate = String.format("%s-%s-%s", customerinfor.get(j).getcInYear(), customerinfor.get(j).getcInMonth(), customerinfor.get(j).getcInDay());
                            outDate = String.format("%s-%s-%s", customerinfor.get(j).getcOutYear(), customerinfor.get(j).getcOutMonth(), customerinfor.get(j).getcOutDay());
                        }
                    }
                    RoomStateSave checkIn = new RoomStateSave();
                    System.out.println("roomstatesave생성자");
                    if (inDate != "" && outDate != "") {
                        checkIn.inguest(roomstate.get(i).getIndex(), room, name, guest, inDate, time, outDate);
                    }
                    JOptionPane.showMessageDialog(null, "체크인 완료되었습니다.");
                } else if (roomstate.get(i).getRoom().equals(room) && roomstate.get(i).getRoomState().equals("empty") && Integer.parseInt(t) < 15) {
                    JOptionPane.showMessageDialog(null, "체크인 가능한 시간이 아닙니다.", "체크인 실패", JOptionPane.ERROR_MESSAGE);
                } else if (roomstate.get(i).getRoom().equals(room) && roomstate.get(i).getRoomState().equals("full")) {
                    JOptionPane.showMessageDialog(null, "체크인 완료된 방입니다.", "체크인 실패", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (IOException ex) {
            Logger.getLogger(CheckIN.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_CheckIn_BUTTActionPerformed

    private void BsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsearchActionPerformed
        //검색하기 버튼눌렀을때
        String name = SearchName.getText();
        String room = SearchRoom.getText();
        int caution = -1;
        //room이랑 name이 빈칸이라면 오류메세지출력
        if (room.equals("") && name.equals("")) {
            JOptionPane.showMessageDialog(null, "이름 또는 호실을 입력해주세요");
        }
        for (int i = 0; i < customerinfor.size(); i++) {
            caution = 0;
            //호실 이름 둘다 입력한경우
            if (!room.equals("") && !name.equals("")) {//둘 다 입력된 경우
                if (customerinfor.get(i).getName().equals(name) && customerinfor.get(i).getRoomNum().equals(room)) {
                    reservationTable.changeSelection(i - 1, 0, false, false);
                    break;

                } else {
                    caution = 1;
                }
            } else if (room.equals("") && !name.equals("")) {//이름만 입력된 경우
                if (customerinfor.get(i).getName().equals(name)) {
                    reservationTable.changeSelection(i - 1, 0, false, false);
                    break;
                } else {
                    caution = 2;
                }
            } else if (!room.equals("") && name.equals("")) {//호실만 입력된경우
                ///////////호실찾는과정에서 오류남///////////////////
                //몇개는 찾고 몇개는 안찾고 지맘대로임 ㅡ3ㅡ 일단 대충은 돌아감 발표할때 돌아가는거로만하면 ㄱㄴ일듯 근데 일단은 안완벽하단뜻.
                if (customerinfor.get(i).getRoomNum().equals(room)) { 
                    reservationTable.changeSelection(i-1, 0, false, false);
                    break;
                } else {
                    caution = 3;
                }
            }

        }
        //잘못된 입력값으로 테이블에 선택이 안된경우 팝업
        if (caution == 1) {
            JOptionPane.showMessageDialog(null, "이름 및 호실을 정확히 입력해주세요");
        } else if (caution == 2) {
            JOptionPane.showMessageDialog(null, "이름을 정확히 입력해주세요");
        } else if (caution == 3) {
            JOptionPane.showMessageDialog(null, "호실을 정확히 입력해주세요");
        }
    }//GEN-LAST:event_BsearchActionPerformed

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
