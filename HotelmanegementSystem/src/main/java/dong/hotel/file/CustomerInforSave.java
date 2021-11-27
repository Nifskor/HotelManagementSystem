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
     private String macosxcustom = "/Users/nifskorea/Desktop/DB/booking_cus_info.txt";
    private String windowscustom = "C:\\DB\\booking_cus_info.txt";
    private String line = "";  // 파일 공백시 
    private String dump = ""; // 합산 저장용 덤프 변수 

    SFR100Process fileae = new SFR100Process(); // os환경변수 값 리딩 
    
    
   public void AddCustom(String a) throws IOException { // 고객 정보 추가 메소드 
       
       
     //System.out.println(a);
       if(fileae.getOssystem() == 1 ) { //os x 
         //  System.out.println("조건문똑바로들어옴");
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
   
   public void InputGuest( String code ,String name ,String roomNum ,String cusNum ,String cusPhonenum ,String inYear,String inMonth,
              String inDay,String outYear,String outMonth,String outDay,String money,String cardType,
                      String cardNum,String exprMonth,String expYear,String guarantee )throws IOException  { //고객 정보 입력  받아오는거 
           // 다시 정렬함 
               
       if(fileae.getOssystem() == 1 ) { //os x 
           try {
              BufferedReader input = new BufferedReader(new InputStreamReader(new FileInputStream(macosxcustom)));
               BufferedWriter wr = new BufferedWriter(new FileWriter( macosxcustom,false));
            
               // 애는 인덱스에 있는 값을 쓰는거 (인덱스에 위치한 값을 쓴거  코드값 숫자 한줄씩 코드값들어오는 순서대로 기록 
              //for(int i = 0 ; i < Integer.parseInt(code); i++){ //문자  -> 숫자 
              // //   line = input.readLine();
              ////    dump += (line + "\r\n");
             //     System.out.println(line);
                  
            ///  }
              input.readLine(); // 문자열 다시 받아오고 
           
              //추가삽입 
         
              dump += code + "|" + name + "|" + roomNum + "|" + cusNum + "|" + cusPhonenum + "|" + inYear + "|" + inMonth + "|" + 
                      inDay + "|" + outYear + "|" + outMonth + "|" + outDay + "|" + money + "|" + cardType + "|" + cardNum+ "|" +
                      exprMonth + "|" +expYear+ "|" +guarantee+ "|"+ "\r\n"; // cus num 중복으로 2번들어감  나머지 체크후 필요시 들어가야함 
            //  위에 있던거 그대로 합산  앞 인덱싱 자료후 뒤에 다시 추가함 
              System.out.println(dump);
            while ((line = input.readLine()) != null) {
               dump += (line + "\r\n");
                
            }
            
           System.out.println(dump);
            wr.write(dump);
            wr.close();
            input.close();
            
           
           }
          catch(Exception e ) {
                e.printStackTrace();
               
           }
       
   }
       else if (fileae.getOssystem() == 2 ) { // windows 
           
           try {
              BufferedReader input = new BufferedReader(new InputStreamReader(new FileInputStream(windowscustom)));
               BufferedWriter wr = new BufferedWriter(new FileWriter( windowscustom,false));
            
               // 애는 인덱스에 있는 값을 쓰는거 (인덱스에 위치한 값을 쓴거 
              for(int i = 0 ; i < Integer.parseInt(code); i++){ //문자  -> 숫자 
                  line = input.readLine();
                  dump += (line + "\r\n");
                  
                  
              }
              input.readLine(); // 문자열 다시 받아오고 
              
              //추가삽입 
            dump += code + "|" + name + "|" + roomNum + "|" + cusNum + "|" + cusPhonenum + "|" + inYear + "|" + inMonth + "|" + 
                      inDay + "|" + outYear + "|" + outMonth + "|" + outDay + "|" + money + "|" + cardType + "|" + cardNum+ "|" +
                      exprMonth + "|" +expYear+ "|" +guarantee+ "|"+"\n"; // cus num 중복으로 2번들어감  나머지 체크후 필요시 들어가야함 
            //  위에 있던거 그대로 합산  앞 인덱싱 자료후 뒤에 다시 추가함 
             // System.out.println(dump);
            while ((line = input.readLine()) != null) {
                dump += (line + "\r\n");
                
            }
            
            System.out.println(dump);
            wr.write(dump);
           wr.close();
           input.close();
           
           }
           catch(Exception e ) {
               e.printStackTrace();
               
           }
           
       }
       
       
           
       } //InputGuest 끝 
  
   
   public void esstionals( String code,  String name,  String roomNum, String cusNum, String cusPhonenum, String inYear, String inMonth,
           String inDay, String outYear, String outMonth ,String outDay, String money, String cardType , String cardNum, String  exprMonth , 
           String expYear ,String guarantee , int index ) throws IOException { // 안덱싱 정보 추가 
          // windows windowscustom  / mac os x macosxcustom 
     String dump = "";
       if (fileae.getOssystem() == 1 ) {//mac os x 
            
           try{
           BufferedReader input2 = new BufferedReader(new InputStreamReader(new FileInputStream(macosxcustom)));
            BufferedWriter wra = new BufferedWriter(new FileWriter( macosxcustom,false));
           
            for (int i = 0; i < index; i++) {
                line = input2.readLine();
                dump += (line + "\r\n");
            }
           
            input2.readLine();
            
            dump += (code + "|" + name + "|" + roomNum + "|" + cusNum + "|" + cusPhonenum + "|" + inYear + "|" + inMonth + "|" + 
                      inDay + "|" + outYear + "|" + outMonth + "|" + outDay + "|" + money + "|" + cardType + "|" + cardNum+ "|" +
                      exprMonth + "|" +expYear+ "|" +guarantee+ "|"+ "\r\n");
            // 공백없이 바로 문자로 딱딱 가져오기 좋음 
            
            while ((line = input2 .readLine()) != null) {
             
                dump += (line + "\r\n");
            }
            wra.write(dump);
            wra.close();
            input2.close();
           }
           catch(Exception e ){
               e.printStackTrace();
           }
            
            
       }
       else if (fileae.getOssystem() == 2 ){//windows 
           try{
           BufferedReader input2 = new BufferedReader(new InputStreamReader(new FileInputStream(windowscustom)));
            BufferedWriter wra = new BufferedWriter(new FileWriter( windowscustom,false));
           
            for (int i = 0; i < index; i++) {
                line = input2.readLine();
                dump += (line );
            }
           
            input2.readLine();
            
            dump += (code + "|" + name + "|" + roomNum + "|" + cusNum + "|" + cusPhonenum + "|" + inYear + "|" + inMonth + "|" + 
                      inDay + "|" + outYear + "|" + outMonth + "|" + outDay + "|" + money + "|" + cardType + "|" + cardNum+ "|" +
                      exprMonth + "|" +expYear+ "|" +guarantee+ "|"+ "\r\n");
            // 공백없이 바로 문자로 딱딱 가져오기 좋음 
            
            while ((line = input2 .readLine()) != null) {
             
                dump += (line + "\r\n");
            }
            wra.write(dump+ "\n");
            wra.close();
            input2.close();
           }
           catch(Exception e ){
               e.printStackTrace();
           }
            
            
           
       }
       else {
           System.out.println( "시스템 선택이 잘못되었거나 없습니다. ");
       }
       
       
   }

   


}
