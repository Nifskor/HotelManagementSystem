/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dong.hotel.file;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import dong.hotel.manegement.LoginDataInfo;
/* 이클래스는 직원 , 관리자 아이디 패스워드 분활 처리하는 클래스입니다 */
/**
 *
 * @author nifskorea
 */



public class SFR100Process implements Fileinterface ,Cloneable{
    /* 개발 환경 차이로인해 사전 환경 경로 지정 */ 
String macosxadmin = "/Users/nifskorea/Desktop/DB/adminID.txt"; 
String macosxstaffid = " "; 
String windowsadminid = " ";
String windowsstaffid = " ";
String macosloginlog = " ";
String windowsloginlog = " ";

String line ="";  // 파일 공백시 
int ossystem = 1 ; // 코드 환경 변수 제어문 (맥 1 / 윈도우 2 )
// ---------------------------------------------------
// 배열 지정공간  // ArrayList<>(); 이게 이번버젼의 문법 
ArrayList<String> readinformaton = new ArrayList<String>(); // 문장형 타입으로 고정 설정 
ArrayList<LoginDataInfo> logininformation = new ArrayList<LoginDataInfo>(); // logindatainfo클래스에 데이터형 타입 설정 

    @Override
    public void fRead() {
       /* 자체적으로 예외 상황 만들어서 try catch 문으로 구성 예외 처리를 해주는거지 사용자가 직접 */
       if (ossystem == 1 ){ // mac ox x 
       try { // 오류가 발생할수있는 코드 
           BufferedReader fileread = new BufferedReader(new FileReader(macosxadmin)); // 한줄씩 읽어들임 
          while ((line = fileread.readLine())!=null ){ // 파일을 끝까지 읽고 null 리턴까지 계속 반복해서 읽어라 
              readinformaton.add(line);
          }
          
       }catch(FileNotFoundException a) { // 오류가 발생해서 예외처리하는 구문 
          a.printStackTrace(); //에러의 발생근원지를 찾아서 단계별로 에러를 출력합니다.
          System.out.println("파일이 존재하지않습니다 경로를 확인해주세요 ");
       
       }catch(IOException e ) { // 입출력 예외상황 발생 
           e.printStackTrace();
           
       }
        try { // 오류가 발생할수있는 코드 
           BufferedReader fileread = new BufferedReader(new FileReader(macosxstaffid)); // 한줄씩 읽어들임 
          while ((line = fileread.readLine())!=null ){ // 파일을 끝까지 읽고 null 리턴까지 계속 반복해서 읽어라 
              readinformaton.add(line);
          }
          
       }catch(FileNotFoundException a) { // 오류가 발생해서 예외처리하는 구문 
          a.printStackTrace(); //에러의 발생근원지를 찾아서 단계별로 에러를 출력합니다.
          System.out.println("파일이 존재하지않습니다 경로를 확인해주세요 ");
       
       }catch(IOException e ) { // 입출력 예외상황 발생 
           e.printStackTrace();
           
       }
       }
       else if(ossystem == 2) { // windows system 
           try { // 오류가 발생할수있는 코드 
           BufferedReader fileread = new BufferedReader(new FileReader(windowsadminid)); // 한줄씩 읽어들임 
          while ((line = fileread.readLine())!=null ){ // 파일을 끝까지 읽고 null 리턴까지 계속 반복해서 읽어라 
              readinformaton.add(line);
          }
          
       }catch(FileNotFoundException a) { // 오류가 발생해서 예외처리하는 구문 
          a.printStackTrace(); //에러의 발생근원지를 찾아서 단계별로 에러를 출력합니다.
          System.out.println("파일이 존재하지않습니다 경로를 확인해주세요 ");
       
       }catch(IOException e ) { // 입출력 예외상황 발생 
           e.printStackTrace();
           
       }
        try { // 오류가 발생할수있는 코드 
           BufferedReader fileread = new BufferedReader(new FileReader(windowsstaffid)); // 한줄씩 읽어들임 
          while ((line = fileread.readLine())!=null ){ // 파일을 끝까지 읽고 null 리턴까지 계속 반복해서 읽어라 
              readinformaton.add(line);
          }
          
       }catch(FileNotFoundException a) { // 오류가 발생해서 예외처리하는 구문 
          a.printStackTrace(); //에러의 발생근원지를 찾아서 단계별로 에러를 출력합니다.
          System.out.println("파일이 존재하지않습니다 경로를 확인해주세요 ");
       
       }catch(IOException e ) { // 입출력 예외상황 발생 
           e.printStackTrace();
           
        }
       }
      }
       
    

    @Override
    public void fWrite(String a) throws IOException {
       /* 오류가 발생했을때 ioexception 에서 오류처리를 던지는경우고 */ 
       String oslocation ="";
       if(ossystem ==1){
      oslocation = macosloginlog;
  
       }
       else if (ossystem ==2 ){
           oslocation = windowsloginlog;
          
       }
      BufferedWriter log = new BufferedWriter(new FileWriter( oslocation,false));
        //PrintWriter pw = new PrintWriter(log,true);
        log.write(a+"\n"); // 출력 
        log.flush(); // 남아있는 데이터를 모두 출력 
        log.close(); // 스트림 클로스 
      
       
    }
   
    public void AWrite (String a) throws IOException { //admin 패스워드 아이디 기록 
         String oslocation ="";
       if(ossystem ==1){
      oslocation = macosxadmin;
  
       }
       else if (ossystem ==2 ){
           oslocation = windowsadminid;
          
       }
     BufferedWriter log = new BufferedWriter(new FileWriter( oslocation,false));
        //PrintWriter pw = new PrintWriter(log,true);
        log.write(a+"\n"); // 출력 
        log.flush(); // 남아있는 데이터를 모두 출력 
        log.close(); // 스트림 클로스 
      
    }

    public void SWrite (String a )throws IOException {
          String oslocation ="";
       if(ossystem ==1){
      oslocation = macosxstaffid;
  
       }
       else if (ossystem ==2 ){
           oslocation = windowsstaffid;
          
       }
        BufferedWriter log = new BufferedWriter(new FileWriter( oslocation,false));
        //PrintWriter pw = new PrintWriter(log,true);
        log.write(a+"\n"); // 출력 
        log.flush(); // 남아있는 데이터를 모두 출력 
        log.close(); // 스트림 클로스 
    }
    
    @Override
    public void sPlite() {
        String line;
        
        for(int i = 0 ; i <readinformaton.size(); i ++){
            
            line  = readinformaton.get(i);
            String[] str = line.split(" "); // 공백 문자열을 기준으로 문자열을 분리한다 값분리 
            logininformation.add(new LoginDataInfo(str[0],str[1])); //0 번째 아이디 2 패스워드 
            System.out.printf("%s,%s",str[0],str[1]);
        }
       
    }
   
    public ArrayList<LoginDataInfo> returnLoginDataInfo() throws IOException {
        return logininformation;
    }
    
}
