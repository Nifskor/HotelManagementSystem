/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dong.hotel.file;

import java.io.IOException;
import dong.hotel.file.SFR100Process;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

/**
 *
 * @author nifskorea
 */
public class CustomerInforSave { // 고객 정보 저장 담당 클래스 
    /* os system 환경변수 공간 */ 
     private String macosxcustom = "/Users/nifskorea/Desktop/DB/";
    private String windowscustom = "C:\\DB\\";
    private String line = "";  // 파일 공백시 
    private String dump = ""; // 합산 저장용 덤프 변수 

    SFR100Process fileae = new SFR100Process(); // os환경변수 값 리딩 
    
    
   public void AddCustom(String a) throws IOException { // 고객 정보 추가 메소드 
       
       if(fileae.getOssystem() == 1 ) { //os x 
            BufferedWriter wirtea = new BufferedWriter(new FileWriter(macosxcustom, true));
       // PrintWriter pw = new PrintWriter(log, true);
        wirtea.write(a + "\n");
        wirtea.flush();
        wirtea.close();
       
   }
       else if (fileae.getOssystem() == 2 ) { // windows 
           
            BufferedWriter wirtea = new BufferedWriter(new FileWriter(windowscustom, true));
       // PrintWriter pw = new PrintWriter(log, true);
        wirtea.write(a + "\n");
        wirtea.flush();
        wirtea.close();
       }
       
    }
   
   public void InputGuest( String code,  String name,  String roomNum,  String inYear, String inMonth,String inDay, String outYear, 
                           String outMonth, String outDay, String cusNum , String cusPhonenum,String cardType , String  exprMonth, 
                           String expYear, String guarantee ,String money )throws IOException  { //고객 정보 입력 
   
    
       if(fileae.getOssystem() == 1 ) { //os x 
         /*  try {
              BufferedReader input = new BufferedReader(new InputStreamReader(new FileInputStream(macosxcustom)));
               // 애는 인덱스에 있는 값을 쓰는거 (인덱스에 위치한 값을 쓴거 
              for(int i = 0 ; i < Integer.parseInt(code); i++){ //문자  -> 숫자 
                  line = input.readLine();
                  dump += (line + "\r\n");
                  
                  
              }
              input.readLine(); // 문자열 다시 받아오고 
              
              //추가삽입 
              dump += code + "|" + name + "|" + roomNum + "|" +inYear + "|" +inMonth + "|" + inDay + "|" + outYear + "|" + outMonth + "|" + outDay + "|" +cusNum+ "|" +
                cusPhonenum+"|"+cardType + "|"+ exprMonth +"|"+expYear+"|"+guarantee+"|"+money+"|"; // cus num 중복으로 2번들어감  나머지 체크후 필요시 들어가야함 
            //  위에 있던거 그대로 합산  앞 인덱싱 자료후 뒤에 다시 추가함 
               
           }
           catch() {
               
           }*/
       
   }
       else if (fileae.getOssystem() == 2 ) { // windows 
           
           
       }
           
       }



}
