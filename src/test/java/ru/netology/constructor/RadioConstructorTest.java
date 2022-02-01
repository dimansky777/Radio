package ru.netology.constructor;

import org.junit.jupiter.api.Test;
import ru.netology.Radio;

import static org.junit.jupiter.api.Assertions.*;

public class RadioConstructorTest {

    @Test
    public void constructorUse() {
        Radio radio = new Radio(6, 50, 15, 0, 100, 0);
        assertEquals(6, radio.getCurrentRadioStation());
        assertEquals(50, radio.getCurrentVolume());

        Radio radio1 = new Radio();

        assertEquals(3, radio1.getCurrentRadioStation());

        ///проверка максимальной станции
        Radio radio2 = new Radio();
        radio2.getMaxStation();

        assertEquals(12, radio2.getMaxStation());

        ///проверка мин станции
        Radio radio3 = new Radio();
        radio3.getMinStation();

        assertEquals(0, radio3.getMinStation());

        ///проверка макс громкости
        Radio radio4 = new Radio();
        radio4.getMaxVolume();

        assertEquals(100, radio4.getMaxVolume());

        ///проверка макс громкости
        Radio radio5 = new Radio();
        radio4.getMaxVolume();

        assertEquals(0, radio5.getMinVolume());

        ///Переключение радио вперед от 0 до 9
        Radio radio6 = new Radio(6,50,10,0,100,0);
        radio6.setNextRadioStation();
        assertEquals(7, radio6.getCurrentRadioStation());

        ///Переключение радио назад от 9 до 0
        Radio radio7 = new Radio(7,50,10,0,100,0);
        radio7.setPrevRadioStation();
        assertEquals(6, radio7.getCurrentRadioStation());

        ///Переключение радио назад от 0 до 9
        Radio radio8 = new Radio(0,50,10,0,100,0);
        radio8.setPrevRadioStation();
        assertEquals(9, radio8.getCurrentRadioStation());

        ///Переключение радио назад от 9 до 0
        Radio radio9 = new Radio(9,50,10,0,100,0);
        radio9.setNextRadioStation();
        assertEquals(0, radio9.getCurrentRadioStation());

        ///Включение любой станции с 0 до 9
        Radio radio10 = new Radio(7,50,10,0,100,0);
        radio10.setCurrentRadioStation(0);
        assertEquals(0, radio10.getCurrentRadioStation());

        ///Включение станции больше максимоальной 10
        Radio radio11 = new Radio();
        radio11.setCurrentRadioStation(11);
        assertEquals(3, radio11.getCurrentRadioStation());

        ///Включение станции меньше 0
        Radio radio12 = new Radio(0,30,9,0,100,0);
        radio12.setCurrentRadioStation(-1);
        assertEquals(0, radio12.getCurrentRadioStation());

    }
    @Test
    // Volume test return
    public void setVolumeAboveTen(){
        Radio rad = new Radio();

        rad.setCurrentVolume(11);
        //rad.setVolumeDown();

        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected,actual);
    }

    @Test
    // Volume test return
    public void setVolumeTo101(){
        Radio rad = new Radio();

        rad.setCurrentVolume(101);
        rad.setVolumeUp();

        int expected = 101;
        int actual = rad.getCurrentVolume();
        assertEquals(expected,actual);
    }

    @Test
    // Volume test return
    public void currentVolumeLess101(){
        Radio rad = new Radio();

        rad.setCurrentVolume(101);
        rad.setVolumeDown();

        int expected = 100;
        int actual = rad.getCurrentVolume();
        assertEquals(expected,actual);
    }

    @Test
    // Volume test return
    public void currentVolumeEqualsZero(){
        Radio rad = new Radio();

        rad.setCurrentVolume(0);
        rad.setVolumeDown();

        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected,actual);
    }

    @Test
    // Volume test return
    public void currentVolumeBetween101AndZero(){
        Radio rad = new Radio();

        rad.setCurrentVolume(50);
        rad.setVolumeDown();

        int expected = 49;
        int actual = rad.getCurrentVolume();
        assertEquals(expected,actual);
    }

}
