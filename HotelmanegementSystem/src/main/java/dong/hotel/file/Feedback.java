/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dong.hotel.file;

import dong.hotel.management.HotelMoneyInfo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
/**
 *
 * @author heehe
 */
    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template*/

public class Feedback implements Fileinterface {
    
    private ArrayList<String> readInfo = new ArrayList<>();
    private ArrayList<String> feedInfo = new ArrayList<>();
    
    private String macosxfeed = "/Applications/DB/feedback.txt";
    private String windowsfeed = "C:\\DB\\feedback.txt";
    private String line = "";  // 파일 공백시 
    private String oslocation = "";
    SFR100Process fileae = new SFR100Process(); // os환경변수 값 리딩 
    
    @Override
    public void fRead() {
        if (fileae.getOssystem() == 1) {
            oslocation = macosxfeed;
        } else if (fileae.getOssystem() == 2) {
            oslocation = windowsfeed;
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
            oslocation = macosxfeed;
        } else if (fileae.getOssystem() == 2) {
            oslocation = windowsfeed;
        }
        BufferedWriter log = new BufferedWriter(new FileWriter(oslocation, true));
        PrintWriter pw = new PrintWriter(log, true);
        pw.write(a + "\n");
        pw.flush();
        pw.close();
    }

    @Override
    public void sPlite() {
    }
   
    public ArrayList<String> returnFeedInfo() throws IOException {
        return feedInfo;
    }
    
    public void InFeedInfo(String feed) throws IOException {
        if (fileae.getOssystem() == 1) {
            oslocation = macosxfeed;
        } else if (fileae.getOssystem() == 2) {
            oslocation = windowsfeed;
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(oslocation))));
                FileWriter fw = new FileWriter(oslocation, true);
                fw.write(feed+ "\r\n");
                fw.close();
                br.close();                
    }
}

