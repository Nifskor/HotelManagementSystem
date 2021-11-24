/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dong.hotel.reservation;
/* 성수기때 적용되는 요금을 보여주는 클래스입니다 */
/**
 *
 * @author nifskorea
 */
public class PeakSeasonChargeInfo {
    /* 성수기 요금 기록 정보 */// -> 비성수기 부분은 제외 모든 요금은 성수기 기준으로 요금 책정 예정 
    
    private int room; // 방 
    private String numpeople; // 사람인원수 
    private String roomcharge; // 방찬거 확인 
    private String extractcharge; //할증요금 
    private String maxpele; //최대인원수 
    
     public PeakSeasonChargeInfo(int room, String numpeople, String roomcharge, String extractcharge, String maxpeple){
        //기본생성자로 피크 요금 방 / 사람인원수 / 방요금 / 할증요금 / 최대 인원수 
        
        this.room = room;
        this.numpeople = numpeople;
        this.roomcharge = roomcharge ;
        this.extractcharge = extractcharge;
        this.maxpele = maxpeple; 
        
        // 기본 초기화 완료 
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public String getNumpeople() {
        return numpeople;
    }

    public void setNumpeople(String numpeople) {
        this.numpeople = numpeople;
    }

    public String getRoomcharge() {
        return roomcharge;
    }

    public void setRoomcharge(String roomcharge) {
        this.roomcharge = roomcharge;
    }

    public String getExtractcharge() {
        return extractcharge;
    }

    public void setExtractcharge(String extractcharge) {
        this.extractcharge = extractcharge;
    }

    public String getMaxpele() {
        return maxpele;
    }

    public void setMaxpele(String maxpele) {
        this.maxpele = maxpele;
    }
    
    
   
    
}
