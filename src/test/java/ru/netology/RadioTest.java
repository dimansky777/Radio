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
    //Переключение радио от 0 до 9  return test 1
    public void testReturnPositionBelowZero() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(-2);


        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        assertEquals (expected, actual);

    }
    @Test
    //Переключение радио от 0 до 9  return test 2
    public void testReturnPositionOver9() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(11);


        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        assertEquals (expected, actual);

    }


    @Test
    //Кнопка Next
    public void setNextRadioSation(){
    Radio rad = new Radio();

    rad.setCurrentRadioStation(9);
    rad.setNextRadioStation();

    int expected = 0;
    int actual = rad.getCurrentRadioStation();
    assertEquals(expected,actual);
}

    @Test
    //Кнопка Next тест if currentRadioStation < 10
    public void ifCurrentStationLessTen(){
        Radio rad = new Radio();

        rad.setCurrentRadioStation(7);
        rad.setNextRadioStation();

        int expected =8;
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
    //Кнопка Prev
    public void setPrevRadioStationLessTen(){
        Radio rad = new Radio();

        rad.setCurrentRadioStation(9);
        rad.setPrevRadioSation();

        int expected = 8;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected,actual);
    }

    @Test
    //Кнопка Prev
    public void setPrevRadioSationEqualsMinusOne(){
        Radio rad = new Radio();

        rad.setCurrentRadioStation(-1);
        rad.setPrevRadioSation();

        int expected = 9;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected,actual);
    }
    @Test
    //Кнопка Prev
    public void setPrevRadioSationEqualsTen(){
        Radio rad = new Radio();

        rad.setCurrentRadioStation(10);
        rad.setPrevRadioSation();

        int expected = 9;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected,actual);
    }
    @Test
    //Кнопка Prev
    public void setPrevRadioSationEqualsNine(){
        Radio rad = new Radio();

        rad.setCurrentRadioStation(9);
        rad.setPrevRadioSation();

        int expected = 8;
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

    //Кнопка Volume Up
    public void setVolumeUpToEight(){
        Radio rad = new Radio();

        rad.setCurrentVolume(7);
        rad.setVolumeUp();

        int expected = 8;
        int actual = rad.getCurrentVolume();
        assertEquals(expected,actual);
    }

    @Test
    //Кнопка Volume Down
    public void setVolumeDown(){
        Radio rad = new Radio();

        rad.setCurrentVolume(1);
        rad.setVolumeDown();

        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected,actual);
    }


    @Test
    // Volume test return
    public void setVolumeBelowZero(){
        Radio rad = new Radio();

        rad.setCurrentVolume(-1);
        //rad.setVolumeDown();

        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected,actual);
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
    public void setVolumeToTen(){
        Radio rad = new Radio();

        rad.setCurrentVolume(10);
        rad.setVolumeUp();

        int expected = 10;
        int actual = rad.getCurrentVolume();
        assertEquals(expected,actual);
    }

    @Test
    // Volume test return
    public void currentVolumeLessEleven(){
        Radio rad = new Radio();

        rad.setCurrentVolume(10);
        rad.setVolumeDown();

        int expected = 9;
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
    public void currentVolumeBetweenElevenAndZero(){
        Radio rad = new Radio();

        rad.setCurrentVolume(6);
        rad.setVolumeDown();

        int expected = 5;
        int actual = rad.getCurrentVolume();
        assertEquals(expected,actual);
    }
    @Test
    //Кнопка Next Station
    public void setNextStation() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(7);
        rad.setNextRadioStation();
        int expected = 8;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    //Кнопка Next Station
    public void setNextStation2() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(10);
        rad.setNextRadioStation();
        int expected = 1;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }
    @Test
    //Кнопка Next Station
    public void setNextStation3() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(8);
        rad.setNextRadioStation();
        int expected = 9;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }
    @Test
    //Кнопка Next Station
    public void setNextStation4() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(0);
        rad.setNextRadioStation();
        int expected = 1;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }
    @Test
    //Кнопка Next Station
    public void setNextRadioStation5() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(-1);
        rad.setNextRadioStation();
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }
    @Test
    //Кнопка Next Station
    public void setNextRadioStation6() {
        Radio rad = new Radio();

        rad.setCurrentRadioStation(9);
        rad.setNextRadioStation();
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }
}