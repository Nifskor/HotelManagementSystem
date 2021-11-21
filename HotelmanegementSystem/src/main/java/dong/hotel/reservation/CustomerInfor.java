/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dong.hotel.reservation;
/* 이클래스는 고객정보를 저장하고있는 클래스입니다 */
/**
 *
 * @author nifskorea
 */
public class CustomerInfor {
    private String chechkNum;       //고유확인번호
    private String name;            //예약고객명
    private String roomNum;         //호실
    private String customerNum;     //인원
    private String phoneNum;        //폰번
    private String cInYear;         //체크인 년
    private String cInMonth;        //체크인 월
    private String cInDay;          //체크인 일
    private String cOutYear;        //체크아웃 년
    private String cOutMonth;       //체크아웃 월
    private String cOutDay;         //체크아웃 일
    private String roomPrice;       //객실가격
    private String address;         //주소
    private String card;            //카드사
    private String cardNum;         //카드 번호
    private String endMonth;        //카드 만료 달
    private String endYear;         //카드 만료 년
    private String guarantee;       //보증여부

    public CustomerInfor(String chechkNum, String name, String roomNum, String customerNum, String phoneNum, 
            String cInYear, String cInMonth, String cInDay, String cOutYear, String cOutMonth, String cOutDay, 
            String roomPrice, String address, String card, String cardNum, String endMonth, String endYear, String guarantee) {
        this.chechkNum = chechkNum;
        this.name = name;
        this.roomNum = roomNum;
        this.customerNum = customerNum;
        this.phoneNum = phoneNum;
        this.cInYear = cInYear;
        this.cInMonth = cInMonth;
        this.cInDay = cInDay;
        this.cOutYear = cOutYear;
        this.cOutMonth = cOutMonth;
        this.cOutDay = cOutDay;
        this.roomPrice = roomPrice;
        this.address = address;
        this.card = card;
        this.cardNum = cardNum;
        this.endMonth = endMonth;
        this.endYear = endYear;
        this.guarantee = guarantee;
    }

    public String getChechkNum() {
        return chechkNum;
    }

    public void setChechkNum(String chechkNum) {
        this.chechkNum = chechkNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(String roomNum) {
        this.roomNum = roomNum;
    }

    public String getCustomerNum() {
        return customerNum;
    }

    public void setCustomerNum(String customerNum) {
        this.customerNum = customerNum;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getcInYear() {
        return cInYear;
    }

    public void setcInYear(String cInYear) {
        this.cInYear = cInYear;
    }

    public String getcInMonth() {
        return cInMonth;
    }

    public void setcInMonth(String cInMonth) {
        this.cInMonth = cInMonth;
    }

    public String getcInDay() {
        return cInDay;
    }

    public void setcInDay(String cInDay) {
        this.cInDay = cInDay;
    }

    public String getcOutYear() {
        return cOutYear;
    }

    public void setcOutYear(String cOutYear) {
        this.cOutYear = cOutYear;
    }

    public String getcOutMonth() {
        return cOutMonth;
    }

    public void setcOutMonth(String cOutMonth) {
        this.cOutMonth = cOutMonth;
    }

    public String getcOutDay() {
        return cOutDay;
    }

    public void setcOutDay(String cOutDay) {
        this.cOutDay = cOutDay;
    }

    public String getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(String roomPrice) {
        this.roomPrice = roomPrice;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public String getEndMonth() {
        return endMonth;
    }

    public void setEndMonth(String endMonth) {
        this.endMonth = endMonth;
    }

    public String getEndYear() {
        return endYear;
    }

    public void setEndYear(String endYear) {
        this.endYear = endYear;
    }

    public String getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(String guarantee) {
        this.guarantee = guarantee;
    }
    
}
