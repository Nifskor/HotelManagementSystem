/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dong.hotel.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author nifskorea
 */
public class HotelPay {
    private String macosxreport = "/Users/nifskorea/Desktop/DB/hotelpay.txt";
    private String windowsreport = "C:\\DB\\hotelpay.txt";
    private String line = "";  // 파일 공백시 
    private String oslocation = "";
    SFR100Process fileae = new SFR100Process(); // 파일 정보 가져와서 환경 변수 제어값 확인 

    /* 앞에 예약 클래스에서 넘긴 정보임 */
    public void InChargeInfo(String room, String name, String outDate, String totalFee, String select) throws IOException {
        if (fileae.getOssystem() == 1) {
            oslocation = macosxreport;
        } else if (fileae.getOssystem() == 2) {
            oslocation = windowsreport;
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(oslocation))));
                FileWriter fw = new FileWriter(oslocation, true);
                fw.write(room + " " + name + " " + outDate+ " " + totalFee+ " " + select+ "\r\n");
                fw.close();
                br.close();                
    }
}
