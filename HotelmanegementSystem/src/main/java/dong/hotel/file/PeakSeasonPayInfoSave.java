/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dong.hotel.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author nifskorea
 */
public class PeakSeasonPayInfoSave {
     /* 환경 변수 */ 
      private String macosxpayinfo = "/Users/nifskorea/Desktop/DB/peakpayinfo.txt";
    private String windowspayinfo = "C:\\DB\\peakpayinfo.txt";
    private String line = "";  // 파일 공백시 
    private String dummy =""; //temp
    SFR100Process fileae = new SFR100Process(); // 파일 정보 가져와서 환경 변수 제어값 확인 
  
     /* 앞에 예약 클래스에서 넘긴 정보임 */ 
     public void InChargeInfo(int index, String room, String people, String roomcharge, String extracharge, String maxpeople,String addreason) throws IOException {
         if(fileae.getOssystem() ==1){
         try {
                BufferedReader fileread = new BufferedReader(new FileReader(macosxpayinfo)); // 한줄씩 읽어들임 
                System.out.println("인덱스번호"+index);
                for(int i =0 ; i <index -1 ; i++ ){// 배열 감안 하나 빼주고 인덱스 번호 횟수만큼 긁어옴 
                  line = fileread.readLine(); 
                   dummy +=(line + "\r\n"); 
                }
                fileread.readLine();
                 dummy += (room + " " + people + " " + roomcharge + " " + extracharge + " " + maxpeople + " "+ addreason + "\r\n");
                while ((line = fileread.readLine()) != null) { // 파일을 끝까지 읽고 null 리턴까지 계속 반복해서 읽어라 
                   dummy +=(line + "\r\n");  // 커서를 맨앞으로 보내고 그다음 엔터쳐러 ( 공백 최소화 기법)
                }
                BufferedWriter faw = new BufferedWriter(new FileWriter( macosxpayinfo,false));     // 다이렉트로 쓰게 하는거 경로잡을려고 
                
                faw.write(dummy); //읽어온 정보를 공백없에고 저장한걸 저장함 (최소화기법)
                fileread.close();
                faw.close();
                  
            }  catch (Exception e) {
                e.printStackTrace();
            }
         
        } 
         
         else if (fileae.getOssystem() == 2) { //windows 
          
         try {
                BufferedReader fileread = new BufferedReader(new FileReader(windowspayinfo)); // 한줄씩 읽어들임 
                
                //for(int i =0 ; i <index -1 ; i++ ){// 배열 감안 하나 빼주고 인덱스 번호 횟수만큼 긁어옴 
                 //   line = fileread.readLine(); 
                //    dummy +=(line + "\r\n"); 
               // }
                fileread.readLine();
                  dummy += (room + " " + people + " " + roomcharge + " " + extracharge + " " + maxpeople + addreason + "\r\n");
                while ((line = fileread.readLine()) != null) { // 파일을 끝까지 읽고 null 리턴까지 계속 반복해서 읽어라 
                   dummy +=(line + "\r\n");  // 커서를 맨앞으로 보내고 그다음 엔터쳐러 ( 공백 최소화 기법)
                }
                BufferedWriter faw = new BufferedWriter(new FileWriter(windowspayinfo,false));     // 다이렉트로 쓰게 하는거 경로잡을려고 
                
                faw.write(dummy); //읽어온 정보를 공백없에고 저장한걸 저장함 (최소화기법)
                fileread.close();
                faw.close();
         }  catch (Exception e) {
                e.printStackTrace();
            }
         
     
} //else if 
     } // mathod close 
      public void fWritea(int index, String room, String people, String roomcharge, String extracharge, String maxpeople,String addreason) throws IOException {
          
          String oslocation ="";
        
        if(fileae.getOssystem() ==1){
            oslocation  = macosxpayinfo;
        }
        else if(fileae.getOssystem() ==2){
             oslocation  = windowspayinfo;
        }
         dummy += (room + " " + people + " " + roomcharge + " " + extracharge + " " + maxpeople + " " + addreason );
         BufferedWriter log = new BufferedWriter(new FileWriter( oslocation,true)); //true
        //PrintWriter pw = new PrintWriter(log,true);
        log.write(dummy+"\n"); // 출력  여유가 된다면 시간기록되게 하는거 한번 고려 
        log.flush(); // 남아있는 데이터를 모두 출력 
        log.close(); // 스트림 클로스 
          }
     public void fWritetwo(int index, String room, String people, String roomcharge, String extracharge, String maxpeople,String addreason) throws IOException {
          // 애는 그 피크페이인포 처리하는애(전용으로1개메소드만사용) 
          String oslocation ="";
        
        if(fileae.getOssystem() ==1){
            oslocation  = macosxpayinfo;
        }
        else if(fileae.getOssystem() ==2){
             oslocation  = windowspayinfo;
        }
         dummy += (room + " " + people + " " + roomcharge + " " + extracharge + " " + maxpeople + " " + addreason+"\n" );
         BufferedWriter log = new BufferedWriter(new FileWriter( oslocation,false)); //true
        //PrintWriter pw = new PrintWriter(log,true);
        log.write(dummy); // 출력  여유가 된다면 시간기록되게 하는거 한번 고려 
        log.flush(); // 남아있는 데이터를 모두 출력 
        log.close(); // 스트림 클로스 
          }
} // class close 
