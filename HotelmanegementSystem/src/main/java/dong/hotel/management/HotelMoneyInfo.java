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
    private String name;//이름
    private String room;// 방번호
    private String num; 
    private String money;
    private String date;
    private String time;
    private String type;

    public HotelMoneyInfo(String name, String room, String num,String money, String date, String time, String type) {
        this.name = name;
        this.room = room;
        this.num = num;
        this.money = money;
        this.date = date;
        this.time = time;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}


