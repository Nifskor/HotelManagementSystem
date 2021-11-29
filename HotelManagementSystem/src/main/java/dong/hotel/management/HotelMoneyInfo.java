/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dong.hotel.management;
/* 이클래스는 호텔 돈에 관련된 정보를 저장하고 있는 클래스입니다 */
/**
 *
 * @author nifskorea
 */
public class HotelMoneyInfo {
    private String room;// 방번호
    private String name;//이름
    private String date;//퇴실일
    private String money;//총요금
    private String type;//결제타입

    public HotelMoneyInfo(String room, String name, String date, String money, String type) {
        this.room = room;
        this.name = name;
        this.date = date;
        this.money = money;
        this.type = type;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    

}
