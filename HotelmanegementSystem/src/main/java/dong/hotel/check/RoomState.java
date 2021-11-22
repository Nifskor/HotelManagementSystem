/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dong.hotel.check;
/* 이클래스는 룸 상태를 나타내는 클래스입니다 */
/**
 *
 * @author nifskorea
 */
public class RoomState {
    private String index;           //인덱스
    private String room;            //호실
    private String roomState;       //방상태
    private String booker;          //예약자명
    private String guestNum;        //인원
    private String cInDate;         //체크인 날짜
    private String cOutTime;        //체크아웃 시간

    public RoomState(String index, String room, String roomState, String booker, String guestNum, String cInDate, String cOutTime) {
        this.index = index;
        this.room = room;
        this.roomState = roomState;
        this.booker = booker;
        this.guestNum = guestNum;
        this.cInDate = cInDate;
        this.cOutTime = cOutTime;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getRoomState() {
        return roomState;
    }

    public void setRoomState(String roomState) {
        this.roomState = roomState;
    }

    public String getBooker() {
        return booker;
    }

    public void setBooker(String booker) {
        this.booker = booker;
    }

    public String getGuestNum() {
        return guestNum;
    }

    public void setGuestNum(String guestNum) {
        this.guestNum = guestNum;
    }

    public String getcInDate() {
        return cInDate;
    }

    public void setcInDate(String cInDate) {
        this.cInDate = cInDate;
    }

    public String getcOutTime() {
        return cOutTime;
    }

    public void setcOutTime(String cOutTime) {
        this.cOutTime = cOutTime;
    }
}
