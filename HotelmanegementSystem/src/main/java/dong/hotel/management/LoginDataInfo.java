/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dong.hotel.management;

/* 이클래스는 사용자 아이디 패스워드를 가지고와서 현재 있는 여기에 id ps 워드를 저장하여 사용하는 id ps 저장 전용 정보클래스입니다 */
/**
 *
 * @author nifskorea
 */
public class LoginDataInfo {

    private String id;
    private String ps;

    public LoginDataInfo(String id, String ps) { // 기본 생성자 로 값 초기화 
        this.id = id;
        this.ps = ps;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPs() {
        return ps;
    }

    public void setPs(String ps) {
        this.ps = ps;
    }

}
