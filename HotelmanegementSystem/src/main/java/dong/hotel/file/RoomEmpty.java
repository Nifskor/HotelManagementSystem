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
public class RoomEmpty {
 /* 개발 환경 차이로인해 사전 환경 경로 지정 */ 
private String macosxroomstate = "/Users/nifskorea/Desktop/DB/roomState.txt";  // 
private String windowsroomstate = "C:\\DB\\roomState.txt";
 private String line ="";  // 파일 공백시 데이터를 채워줌  
 SFR100Process fileae = new SFR100Process();
    public void outguest(String indexNum, String roomNum) throws IOException {
        String newLine = "";
        if(fileae.getOssystem() == 1) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(macosxroomstate)));
            

            for (int i = 0; i < Integer.parseInt(indexNum) - 1; i++) {
                line = br.readLine();
                newLine += (line + "\r\n");
            }

            br.readLine();
            newLine += (indexNum + " " + roomNum + " empty booker guestNum inDate inTime  realInTime outDate outTime\r\n");

            while ((line = br.readLine()) != null) {
                newLine += (line + "\r\n");
            }

            BufferedWriter fw = new BufferedWriter(new FileWriter(macosxroomstate, false));
            fw.write(newLine);
            
            fw.close();
            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        } else if(fileae.getOssystem() == 2) {
        
              try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(windowsroomstate)));
        

            for (int i = 0; i < Integer.parseInt(indexNum) - 1; i++) {
                line = br.readLine();
                newLine += (line + "\r\n");
            }

            br.readLine();
            newLine += (indexNum + " " + roomNum + " empty booker guestNum inDate inTime  realInTime outDate outTime\r\n");

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
