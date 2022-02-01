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

        ///проверка макс громкость=и
        Radio radio4 = new Radio();
        radio4.getMaxVolume();

        assertEquals(100, radio4.getMaxVolume());

        ///проверка макс громкость=и
        Radio radio5 = new Radio();
        radio4.getMaxVolume();

        assertEquals(0, radio5.getMinVolume());

        ///Переключение радио вперед от 0 до 9
        Radio radio6 = new Radio(6,50,10,0,100,0);
        radio6.setNextRadioSation();
        assertEquals(7, radio6.getCurrentRadioStation());

        ///Переключение радио назад от 9 до 0
        Radio radio7 = new Radio(7,50,10,0,100,0);
        radio7.setPrevRadioSation();
        assertEquals(6, radio7.getCurrentRadioStation());

        ///Переключение радио назад от 0 до 9
        Radio radio8 = new Radio(0,50,10,0,100,0);
        radio8.setPrevRadioSation();
        assertEquals(9, radio8.getCurrentRadioStation());

        ///Переключение радио назад от 9 до 0
        Radio radio9 = new Radio(9,50,10,0,100,0);
        radio9.setNextRadioSation();
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
        Radio radio12 = new Radio();
        radio12.setCurrentRadioStation(-1);
        assertEquals(3, radio12.getCurrentRadioStation());
    }


}
