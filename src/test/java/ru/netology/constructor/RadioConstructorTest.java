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
        Radio radio6 = new Radio(6, 50, 10, 0, 100, 0);
        radio6.setNextRadioStation();
        assertEquals(7, radio6.getCurrentRadioStation());

        ///Переключение радио назад от 9 до 0
        Radio radio7 = new Radio(7, 50, 10, 0, 100, 0);
        radio7.setPrevRadioStation();
        assertEquals(6, radio7.getCurrentRadioStation());

        ///Переключение радио назад от 0 до 9
        Radio radio8 = new Radio(0, 50, 10, 0, 100, 0);
        radio8.setPrevRadioStation();
        assertEquals(9, radio8.getCurrentRadioStation());

        ///Переключение радио назад от 9 до 0
        Radio radio9 = new Radio(9, 50, 10, 0, 100, 0);
        radio9.setNextRadioStation();
        assertEquals(0, radio9.getCurrentRadioStation());

        ///Включение любой станции с 0 до 9
        Radio radio10 = new Radio(7, 50, 10, 0, 100, 0);
        radio10.setCurrentRadioStation(0);
        assertEquals(0, radio10.getCurrentRadioStation());

        ///Включение станции больше максимоальной 10
        Radio radio11 = new Radio();
        radio11.setCurrentRadioStation(11);
        assertEquals(3, radio11.getCurrentRadioStation());

        ///Включение станции меньше 0
        Radio radio12 = new Radio(0, 30, 9, 0, 100, 0);
        radio12.setCurrentRadioStation(-1);
        assertEquals(0, radio12.getCurrentRadioStation());

    }

    @Test

    //Кнопка Volume Up
    public void setVolumeUp() {
        Radio rad = new Radio();

        rad.setCurrentVolume(99);
        rad.setVolumeUp();

        int expected = 100;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test

    //Кнопка Volume Up
    public void setVolumeUpToEight() {
        Radio rad = new Radio();

        rad.setCurrentVolume(7);
        rad.setVolumeUp();

        int expected = 8;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    //Кнопка Volume Down
    public void setVolumeDown() {
        Radio rad = new Radio();

        rad.setCurrentVolume(1);
        rad.setVolumeDown();

        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    //Кнопка Volume Down
    public void setVolumeDownToZero() {
        Radio rad = new Radio();

        rad.setCurrentVolume(0);
        rad.setVolumeDown();

        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    //Кнопка Volume Down
    public void setVolumeDownTo1() {
        Radio rad = new Radio();

        rad.setCurrentVolume(2);
        rad.setVolumeDown();

        int expected = 1;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    // Volume test return
    public void setVolumeBelowZero() {
        Radio rad = new Radio();

        rad.setCurrentVolume(0);
        rad.setVolumeDown();

        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    // Volume test return
    public void setVolumeToMinusOne() {
        Radio rad = new Radio();

        rad.setCurrentVolume(-1);
        rad.setVolumeDown();

        int expected = 34;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    // Volume test return
    public void setVolumeAbove100() {
        Radio rad = new Radio();

        rad.setCurrentVolume(101);

        int expected = 35;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    // Volume test return
    public void setVolumeTo100() {
        Radio rad = new Radio();

        rad.setCurrentVolume(100);
        rad.setVolumeUp();

        int expected = 100;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    // Volume test return
    public void currentVolumeLessEleven() {
        Radio rad = new Radio();

        rad.setCurrentVolume(100);
        rad.setVolumeDown();

        int expected = 99;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    // Volume test return
    public void currentVolumeEqualsZero() {
        Radio rad = new Radio();

        rad.setCurrentVolume(0);
        rad.setVolumeDown();

        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    // Volume test return
    public void currentVolumeBetweenElevenAndZero() {
        Radio rad = new Radio();

        rad.setCurrentVolume(6);
        rad.setVolumeDown();

        int expected = 5;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    //Кнопка Volume Up
    public void setNextStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(7);
        rad.setNextRadioStation();
        int expected = 8;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    //Кнопка Volume Up
    public void setNextStation2() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(-1);
        rad.setNextRadioStation();
        int expected = 4;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void constructorUse1() {
        Radio radio = new Radio(-1, 50, 15, 0, 100, 0);
        radio.setNextRadioStation();
        assertEquals(-1, radio.getCurrentRadioStation());
    }

    @Test
    public void constructorUse2() {
        Radio radio = new Radio(0, 50, 15, 0, 100, 0);
        radio.setNextRadioStation();
        assertEquals(1, radio.getCurrentRadioStation());
    }


    @Test
    public void constructorUse3() {
        Radio radio = new Radio(8, 50, 15, 0, 100, 0);
        radio.setNextRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void constructorUse4() {
        Radio radio = new Radio(1, 50, 15, 0, 100, 0);
        radio.setNextRadioStation();
        assertEquals(2, radio.getCurrentRadioStation());
    }

    @Test
    public void constructorUse5() {
        Radio radio = new Radio(10, 50, 10, 0, 100, 0);
        radio.setNextRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }


    @Test
    public void constructorUse6() {
        Radio radio = new Radio(8, 50, 15, 0, 100, 0);
        radio.setPrevRadioStation();
        assertEquals(7, radio.getCurrentRadioStation());

    }

    @Test
    public void constructorUse7() {
        Radio radio = new Radio(1, 50, 15, 0, 100, 0);
        radio.setPrevRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());

    }

    @Test
    public void constructorUse8() {
        Radio radio = new Radio(-1, 50, 15, 0, 100, 0);
        radio.setPrevRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());

    }

    @Test
    public void constructorUse9() {
        Radio radio = new Radio(0, 50, 15, 0, 100, 0);
        radio.setPrevRadioStation();
        assertEquals(9, radio.getCurrentRadioStation());

    }
}