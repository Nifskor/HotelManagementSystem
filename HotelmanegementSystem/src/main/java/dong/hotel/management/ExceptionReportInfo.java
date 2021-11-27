/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dong.hotel.management;
/* 이클래스는 예외 정보 처리 보고서 관련 정보를 저장하기위한 클래스입니다 */ 
/**
 *
 * @author nifskorea
 */
public class ExceptionReportInfo {
    private String room;
    private String over;
    private String extra;

    public ExceptionReportInfo(String room, String over, String extra) {
        this.room = room;
        this.over = over;
        this.extra = extra;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getOver() {
        return over;
    }

    public void setOver(String over) {
        this.over = over;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }
    
}
