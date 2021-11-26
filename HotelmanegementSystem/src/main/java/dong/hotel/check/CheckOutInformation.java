/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dong.hotel.check;
/* 이클래스는 체크 아웃을  정보를 처리하는 클래스입니다 */
/**
 *
 * @author nifskorea
 */
public class CheckOutInformation {
    private String no;
    private String index;           //인덱스
    private String room;            //호실
    private String roomState;       //방상태
    private String booker;          //예약자명
    private String guestNum;        //인원
    private String inDate;          //체크인 날짜
    private String cInTime;         //체크인 시간
    private String realInTime;      //실제 체크인 시간
    private String cOutDate;        //체크아웃 날짜
    private String outTime;         //체크아웃 시간
    private String realOutTime;     //실제 체크아웃 시간

    // sfr300Process 생성자
    public CheckOutInformation(String index, String room, String roomState, String booker, String guestNum, 
            String inDate, String cInTime, String realInTime, String cOutDate, String outTime, String realOutTime) {
        this.index = index;
        this.room = room;
        this.roomState = roomState;
        this.booker = booker;
        this.guestNum = guestNum;
        this.inDate = inDate;
        this.cInTime = cInTime;
        this.realInTime = realInTime;
        this.cOutDate = cOutDate;
        this.outTime = outTime;
        this.realOutTime = realOutTime;
    }
    // sfr400Process 생성자

    public CheckOutInformation(String no, String room, String roomState, String booker, String guestNum, String inDate, String cInTime, String realInTime, String cOutDate, String outTime) {
        this.no = no;
        this.room = room;
        this.roomState = roomState;
        this.booker = booker;
        this.guestNum = guestNum;
        this.inDate = inDate;
        this.cInTime = cInTime;
        this.realInTime = realInTime;
        this.cOutDate = cOutDate;
        this.outTime = outTime;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
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

    public String getInDate() {
        return inDate;
    }

    public void setInDate(String inDate) {
        this.inDate = inDate;
    }

    public String getcInTime() {
        return cInTime;
    }

    public void setcInTime(String cInTime) {
        this.cInTime = cInTime;
    }

    public String getRealInTime() {
        return realInTime;
    }

    public void setRealInTime(String realInTime) {
        this.realInTime = realInTime;
    }

    public String getcOutDate() {
        return cOutDate;
    }

    public void setcOutDate(String cOutDate) {
        this.cOutDate = cOutDate;
    }

    public String getOutTime() {
        return outTime;
    }

    public void setOutTime(String outTime) {
        this.outTime = outTime;
    }

    public String getRealOutTime() {
        return realOutTime;
    }

    public void setRealOutTime(String realOutTime) {
        this.realOutTime = realOutTime;
    }
}
