/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dong.hotel.file;

import dong.hotel.management.LoginDataInfo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author nifskorea
 */
public class CreateStaffId implements Fileinterface {
     ArrayList<String> readInfo = new ArrayList<>();
    ArrayList<LoginDataInfo> staffinfo = new ArrayList<>();
private String macosxbooking = "/Users/nifskorea/Desktop/DB/staffID.txt";  // 
private String windowsbooking = "C:\\DB\\staffID.txt";
 private String line ="";  // 파일 공백시 데이터를 채워줌  
 SFR100Process fileae = new SFR100Process();
    @Override
    public void fWrite(String a) throws IOException {
         String oslocation ="";
        if(fileae.getOssystem() ==1){
            oslocation  = macosxbooking;
        }
        else if(fileae.getOssystem() ==2){
             oslocation  = windowsbooking;
        }
         BufferedWriter log = new BufferedWriter(new FileWriter( oslocation,true));
        //PrintWriter pw = new PrintWriter(log,true);
        log.write(a); // 출력  여유가 된다면 시간기록되게 하는거 한번 고려 
        log.flush(); // 남아있는 데이터를 모두 출력 
        log.close(); // 스트림 클로스 
    }

    @Override
    public void fRead() {
         if(fileae.getOssystem() ==1){
       try{
            BufferedReader fileread = new BufferedReader(new FileReader(macosxbooking)); // 한줄씩 읽어들임 
          while ((line = fileread.readLine())!=null ){ // 파일을 끝까지 읽고 null 리턴까지 계속 반복해서 읽어라 
            readInfo.add(line); // 읽은 정보 기록  
          //  System.out.println(readInfo.get(0));
            //System.out.println(readInfo.size());
       }
    }catch (FileNotFoundException e ){
        e.printStackTrace();
    }catch (IOException e) {
            e.printStackTrace();
        }
        }
        else if(fileae.getOssystem() ==2){
             try{
            BufferedReader fileread = new BufferedReader(new FileReader(windowsbooking)); // 한줄씩 읽어들임 
          while ((line = fileread.readLine())!=null ){ // 파일을 끝까지 읽고 null 리턴까지 계속 반복해서 읽어라 
            readInfo.add(line); // 읽은 정보 기록   
            //System.out.println(line);
       }
    }catch (FileNotFoundException e ){
        e.printStackTrace();
    }catch (IOException e) {
            e.printStackTrace();
        }
            
        }
    }
 @Override
    public void sPlite() {
        String line;
System.out.println(readInfo.size());
        for (int i = 0; i < readInfo.size(); i++) {
            line = readInfo.get(i);
            String[] str = line.split(" ");
            staffinfo.add(new LoginDataInfo(str[0], str[1]));
        }
    }

    public ArrayList<LoginDataInfo> returnStaffInfo() throws IOException {
        return staffinfo;
    }

   
}
