/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dong.hotel.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author nifskorea
 */
/* 환경변수 추가해야함 */ 
public class RoomStateSave {
             /* 개발 환경 차이로인해 사전 환경 경로 지정 */ 
private String macosxroomstata = "/Users/nifskorea/Desktop/DB/roomState.txt";  // 
private String windowsroomstate = "C:\\DB\\roomState.txt";
 private String line ="";  // 파일 공백시 데이터를 채워줌  
 SFR100Process fileae = new SFR100Process();
 
     public void inguest(String indexNum, String roomNum, String name,String guest,String inDate, String time, String outDate) throws IOException {
      if(fileae.getOssystem() ==1 ){
        String newLine = "";
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(macosxroomstata)));
           
            for (int i = 0; i < Integer.parseInt(indexNum) - 1; i++) {
                line = br.readLine();
                newLine += (line + "\r\n");
            }

            br.readLine();
            newLine += (indexNum + " " + roomNum + " full "+name+" "+guest+" "+inDate+" 15:00 "+time+" "+outDate+" 11:00\r\n");

            while ((line = br.readLine()) != null) {
                newLine += (line + "\r\n");
            }

            
            BufferedWriter fw = new BufferedWriter(new FileWriter(macosxroomstata, false));
            fw.write(newLine);
            
            fw.close();
            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
      } 
      else if (fileae.getOssystem() ==2 ){
           String newLine = "";
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(windowsroomstate)));
           
            for (int i = 0; i < Integer.parseInt(indexNum) - 1; i++) {
                line = br.readLine();
                newLine += (line + "\r\n");
            }

            br.readLine();
            newLine += (indexNum + " " + roomNum + " full "+name+" "+guest+" "+inDate+" 15:00 "+time+" "+outDate+" 11:00\r\n");

            while ((line = br.readLine()) != null) {
                newLine += (line + "\r\n");
            }

            
            BufferedWriter fw = new BufferedWriter(new FileWriter(windowsroomstate, false));
            fw.write(newLine);
            
            fw.close();
            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
      }
     }
}
