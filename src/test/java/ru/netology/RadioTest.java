package ru.netology;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RadioTest {

    @Test
    //Переключение радио от 0 до 9
    public void test() {
        Radio rad = new Radio();
        //       rad.currentRadioStation = 10;
        rad.setCurrentRadioStation(4);


        int expected = 4;
        int actual = rad.getCurrentRadioStation();
        assertEquals (expected, actual);

    }

    @Test
    //Кнопка Next
    public void setNextRadioSation(){
    Radio rad = new Radio();

    rad.setCurrentRadioStation(9);
    rad.setNextRadioSation();

    int expected = 0;
    int actual = rad.getCurrentRadioStation();
    assertEquals(expected,actual);
}


    @Test
    //Кнопка Prev
    public void setPrevRadioSation(){
        Radio rad = new Radio();

        rad.setCurrentRadioStation(0);
        rad.setPrevRadioSation();

        int expected = 9;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected,actual);
    }

    @Test

    //Кнопка Volume Up
    public void setVolumeUp(){
        Radio rad = new Radio();

        rad.setCurrentVolume(10);
        rad.setVolumeUp();

        int expected = 10;
        int actual = rad.getCurrentVolume();
        assertEquals(expected,actual);
    }


    @Test
    //Кнопка Volume Down
    public void setVolumeDown(){
        Radio rad = new Radio();

        rad.setCurrentVolume(0);
        rad.setVolumeDown();

        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected,actual);
    }
}