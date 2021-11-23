/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dong.hotel.check;

/* 이클래스는 호텔 룸 요금을 변경했을때 사용하는 클래스입니다 */
/**
 *
 * @author nifskorea
 */
public class HotelRoomChargeInfor {

    private String room;    //호실
    private String maxNum;  //최대인원
    private String charge;  //1일 요금

    public HotelRoomChargeInfor(String room, String maxNum, String charge) {
        this.room = room;
        this.maxNum = maxNum;
        this.charge = charge;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getMaxNum() {
        return maxNum;
    }

    public void setMaxNum(String maxNum) {
        this.maxNum = maxNum;
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }
}
