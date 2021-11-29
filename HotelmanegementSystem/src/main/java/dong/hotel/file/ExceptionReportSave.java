/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dong.hotel.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;

/**
 *
 * @author heehe
 */
public class ExceptionReportSave {

    private String macosxreport = "/Applications/DB/exeptionreport.txt";
    private String windowsreport = "C:\\DB\\exeptionreport.txt";
    private String line = "";  // 파일 공백시 
    private String oslocation = "";
    SFR100Process fileae = new SFR100Process(); // 파일 정보 가져와서 환경 변수 제어값 확인 

    /* 앞에 예약 클래스에서 넘긴 정보임 */
    public void InChargeInfo(String room, String over, String extra) throws IOException {
        if (fileae.getOssystem() == 1) {
            oslocation = macosxreport;
        } else if (fileae.getOssystem() == 2) {
            oslocation = windowsreport;
        }
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String d = df.format(System.currentTimeMillis());
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(oslocation))));
        FileWriter fw = new FileWriter(oslocation, true);
        fw.write(d + " " + room + " " + over + " " + extra + "\r\n");
        fw.close();
        br.close();

    }
}
