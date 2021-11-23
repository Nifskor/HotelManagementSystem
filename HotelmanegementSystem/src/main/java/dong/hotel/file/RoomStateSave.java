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
public class RoomStateSave {
     public void inguest(String indexNum, String roomNum, String name,String guest,String inDate, String time, String outDate) throws IOException {
        File file = new File("C:\\DB\\roomState.txt");
        String newLine = "";
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            String line;

            for (int i = 0; i < Integer.parseInt(indexNum) - 1; i++) {
                line = br.readLine();
                newLine += (line + "\r\n");
            }

            br.readLine();
            newLine += (indexNum + " " + roomNum + " full "+name+" "+guest+" "+inDate+" 15:00 "+time+" "+outDate+" 11:00\r\n");

            while ((line = br.readLine()) != null) {
                newLine += (line + "\r\n");
            }

            FileWriter fw = new FileWriter("C:\\DB\\roomState.txt");

            fw.write(newLine);
            
            fw.close();
            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
     }
}
