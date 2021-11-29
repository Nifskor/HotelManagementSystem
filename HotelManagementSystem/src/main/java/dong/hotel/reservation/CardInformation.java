/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dong.hotel.reservation;

/* 이 클래스는 카드정보를 저장하고있는 클래스입니다 */
/**
 *
 * @author nifskorea
 */
public class CardInformation {

    private String card;            //카드사
    private String cardNum;         //카드 번호
    private String endMonth;        //카드 만료 달
    private String endYear;         //카드 만료 년

    public CardInformation(String card, String cardNum, String endMonth, String endYear) {
        this.card = card;
        this.cardNum = cardNum;
        this.endMonth = endMonth;
        this.endYear = endYear;
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
    
}
