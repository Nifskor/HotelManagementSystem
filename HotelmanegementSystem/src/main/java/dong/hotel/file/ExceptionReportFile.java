/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dong.hotel.file;

import dong.hotel.management.ExceptionReportInfo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author nifskorea
 */
//파일 이름 충돌(메니지먼트파트)로인해 오류발생으로 대체 파일임 
public class ExceptionReportFile implements Fileinterface {

    private ArrayList<String> readInfo = new ArrayList();
    private ArrayList<ExceptionReportInfo> exceptionreportinfo = new ArrayList<>();
    
    private String macosxreport = "/Users/nifskorea/Desktop/DB/exeptionreport.txt";
    private String windowsreport = "C:\\DB\\exeptionreport.txt";
    private String line = "";  // 파일 공백시 
    private String oslocation = "";
    SFR100Process fileae = new SFR100Process(); // os환경변수 값 리딩 

    @Override
    public void fRead() {

        if (fileae.getOssystem() == 1) {
            oslocation = macosxreport;
        } else if (fileae.getOssystem() == 2) {
            oslocation = windowsreport;
        }
        try {
            FileReader fileRead = new FileReader(oslocation);
            BufferedReader bfReader = new BufferedReader(fileRead);
            while ((line = bfReader.readLine()) != null) {
                readInfo.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void fWrite(String a) throws IOException {
        if (fileae.getOssystem() == 1) {
            oslocation = macosxreport;
        } else if (fileae.getOssystem() == 2) {
            oslocation = windowsreport;
        }
        BufferedWriter log = new BufferedWriter(new FileWriter(oslocation, true));
        PrintWriter pw = new PrintWriter(log, true);
        pw.write(a + "\n");
        pw.flush();
        pw.close();
    }

    @Override
    public void sPlite() {
        for (int i = 0; i < readInfo.size(); i++) {
            line = readInfo.get(i);
            String[] str = line.split(" ");
            exceptionreportinfo.add(new ExceptionReportInfo(str[0], str[1], str[2], str[3]));
        }
    }

    public ArrayList<ExceptionReportInfo> returnExceptionReportInfo() throws IOException {
        return exceptionreportinfo;
    }
}
