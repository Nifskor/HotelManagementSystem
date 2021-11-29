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
public class HotelServiceCertainPeriod extends javax.swing.JFrame {

    /**
     * Creates new form HotelServiceCertainPeriod
     */
    public HotelServiceCertainPeriod() {
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

        jLabel2 = new javax.swing.JLabel();
        Checkinyear = new javax.swing.JComboBox<>();
        Checkinmonth = new javax.swing.JComboBox<>();
        Checkinday = new javax.swing.JComboBox<>();
        Checkinyear1 = new javax.swing.JComboBox<>();
        Checkinmonth1 = new javax.swing.JComboBox<>();
        Checkinday1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        looktable = new javax.swing.JTable();
        Back_B = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("굴림", 0, 20)); // NOI18N
        jLabel2.setText("지정기간점유율");

        Checkinyear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022", "2023" }));

        Checkinmonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        Checkinday.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        Checkinyear1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022", "2023" }));

        Checkinmonth1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        Checkinday1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jButton1.setText("조회");
        jButton1.setActionCommand("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("굴림", 0, 14)); // NOI18N
        jLabel3.setText("~");

        looktable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "날짜", "점유율"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        looktable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(looktable);

        Back_B.setText("이전");
        Back_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_BActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Back_B, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Checkinyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Checkinmonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Checkinday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(Checkinyear1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Checkinmonth1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Checkinday1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jLabel2)))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                    .addGap(21, 21, 21)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Checkinmonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Checkinday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Checkinyear1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Checkinmonth1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Checkinday1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(Checkinyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addComponent(Back_B)
                .addGap(81, 81, 81))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(121, 121, 121)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(109, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Back_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_BActionPerformed
        ManagementMainMenu back = new ManagementMainMenu();
        back.setVisible(true);
        dispose();
    }//GEN-LAST:event_Back_BActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // 조회시 나오는 버튼 부분 
        try {
            Sfr200Process sr = new Sfr200Process();
            sr.fRead();
            sr.sPlite();

            ArrayList<CustomerInfor>guestInfo = sr.returnGuestInfo();
            String year = Checkinyear.getSelectedItem().toString();
            String month = Checkinmonth.getSelectedItem().toString();
            String day = Checkinday.getSelectedItem().toString();
            String year1 = Checkinyear1.getSelectedItem().toString();
            String month1 = Checkinmonth1.getSelectedItem().toString();
            String day1 = Checkinday1.getSelectedItem().toString();

            DefaultTableModel search;
            search = (DefaultTableModel) looktable.getModel();
            try {
                SimpleDateFormat format = new SimpleDateFormat("yyyy|mm|dd");
                String Indate = year + "|" + month + "|" + day;
                String Indate1 = year1 + "|" + month1 + "|" + day1;
                String ogg = year + "." + month + "." + day + "~" + year1 + "." + month1 + "." + day1;
                int compare = 0;
                int compare1 = 0;
                float count = 0;
                int fee = 0;
                int checkyear = Integer.parseInt(Checkinyear.getSelectedItem().toString());
                int checkyear1 = Integer.parseInt(Checkinyear1.getSelectedItem().toString());
                int checkmonth = Integer.parseInt(Checkinmonth.getSelectedItem().toString());
                int checkmonth1 = Integer.parseInt(Checkinmonth1.getSelectedItem().toString());
                int checkday = Integer.parseInt(Checkinday.getSelectedItem().toString());
                int checkday1 = Integer.parseInt(Checkinday1.getSelectedItem().toString());
              //  System.out.println(checkyear);
                for (int i = 0; i < guestInfo.size(); i++) {
                    if(guestInfo.get(i).getGuarantee().equals("예약취소")){
                        i++;
                    }
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
        // endline 
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
         try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HotelServiceCertainPeriod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HotelServiceCertainPeriod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HotelServiceCertainPeriod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HotelServiceCertainPeriod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new HotelServiceCertainPeriod().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_B;
    private javax.swing.JComboBox<String> Checkinday;
    private javax.swing.JComboBox<String> Checkinday1;
    private javax.swing.JComboBox<String> Checkinmonth;
    private javax.swing.JComboBox<String> Checkinmonth1;
    private javax.swing.JComboBox<String> Checkinyear;
    private javax.swing.JComboBox<String> Checkinyear1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable looktable;
    // End of variables declaration//GEN-END:variables
}