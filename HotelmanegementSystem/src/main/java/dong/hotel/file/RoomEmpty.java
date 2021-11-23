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
public class RoomEmpty {

    public void Outguest(String indexNum, String roomNum) throws IOException {
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
            newLine += (indexNum + " " + roomNum + " empty booker guestNum inDate inTime  realInTime outDate outTime\r\n");

            while ((line = br.readLine()) != null) {
                newLine += (line + "\r\n");
            }

            FileWriter fw = new FileWriter("C:\\DB\\roomState.txt");

            fw.write(newLine);
            fw.flush();
            fw.close();

            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
