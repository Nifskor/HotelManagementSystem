/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dong.hotel.file;

import java.io.IOException;

/**
 *
 * @author nifskorea
 */
public interface Fileinterface { // 추상클래스에 인터페이스 구현 
    
    void fRead();
    void fWrite()throws IOException;
    void sPlite();
}
