/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dong.hotel.file;

import dong.hotel.management.HotelMoneyInfo;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author nifskorea
 */
public class HotelMoneyData implements Fileinterface {
    
    private ArrayList<String> readinfo = new ArrayList<>();
    private ArrayList<HotelMoneyInfo> hotelmoneyInfo = new ArrayList<>();
/*
    public void fRead() {
      try {
            File Atext = new File("C:\\DB\\hotelmoney.txt");
           FileReader textRead = new FileReader(Atext);
            BufferedReader bfReader = new BufferedReader(textRead);
            String line = "";
           // while ((line = bfReader.readLine()) != null) {
                readinfo.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("파일이 존재하지않습니다. 경로를 확인해주세요");
       // } catch (IOException e) {
            e.printStackTrace();
        }
    }

     public void sPlite()  {
        String line;
        for (int i = 0; i < readinfo.size(); i++) {
            line = readinfo.get(i);
            String[] str = line.split(" ");
            hotelmoneyInfo.add(new HotelMoneyInfo(str[0], str[1], str[2], str[3], str[4], str[5], str[6]));
        }
    }

    public ArrayList<HotelMoneyInfo> returnHotelMoneyInfo() throws IOException {
        return hotelmoneyInfo;
    }

    public void FWrite(String a) throws IOException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    @Override
    public void fWrite(String a) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
*/

    @Override
    public void fRead() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void fWrite(String a) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sPlite() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
