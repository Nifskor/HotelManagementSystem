/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dong.hotel.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author heehe
 */
public class ExceptionReportSave {

    private String macosxreport = "/Users/nifskorea/Desktop/DB/exeptionreport.txt";
    private String windowsreport = "C:\\DB\\exeptionreport.txt";
    private String line = "";  // 파일 공백시 
    private String dummy = ""; //temp
    private String oslocation = "";
    SFR100Process fileae = new SFR100Process(); // 파일 정보 가져와서 환경 변수 제어값 확인 

    /* 앞에 예약 클래스에서 넘긴 정보임 */
    public void InChargeInfo(int index, String room, String over, String extra) throws IOException {
        if (fileae.getOssystem() == 1) {
            oslocation = macosxreport;
        } else if (fileae.getOssystem() == 2) {
            oslocation = windowsreport;
        }
        try {
            BufferedReader fileread = new BufferedReader(new FileReader(oslocation)); // 한줄씩 읽어들임 

            for (int i = 0; i < index - 1; i++) {// 배열 감안 하나 빼주고 인덱스 번호 횟수만큼 긁어옴 
                line = fileread.readLine();
                dummy += (line + "\r\n");
            }
            fileread.readLine();
            dummy += (room + " " + over + " " + extra + "\r\n");
            while ((line = fileread.readLine()) != null) { // 파일을 끝까지 읽고 null 리턴까지 계속 반복해서 읽어라 
                dummy += (line + "\r\n");  // 커서를 맨앞으로 보내고 그다음 엔터쳐러 ( 공백 최소화 기법)
            }
            BufferedWriter faw = new BufferedWriter(new FileWriter(oslocation, false));     // 다이렉트로 쓰게 하는거 경로잡을려고 

            faw.write(dummy); //읽어온 정보를 공백없에고 저장한걸 저장함 (최소화기법)
            fileread.close();
            faw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
