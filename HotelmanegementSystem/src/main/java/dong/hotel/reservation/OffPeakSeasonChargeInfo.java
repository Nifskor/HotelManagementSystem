/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dong.hotel.reservation;
/* 비성수기때 객실요금정보를 저장하는 클래스입니다 */
/**
 *
 * @author nifskorea
 */
public class OffPeakSeasonChargeInfo {
    private String room;            //호실
    private String max;             //최대인원
    private String roomCharge;      //호실비용

    public OffPeakSeasonChargeInfo(String room, String max, String roomCharge) {
        this.room = room;
        this.max = max;
        this.roomCharge = roomCharge;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = max;
    }

    public String getRoomCharge() {
        return roomCharge;
    }

    public void setRoomCharge(String roomCharge) {
        this.roomCharge = roomCharge;
    }
}
