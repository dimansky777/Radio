package ru.netology;

public class Radio {

    private int currentRadioStation;
    private int currentVolume;


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < -1) {
            return;
        }
        if (newCurrentRadioStation > 10) {
            return;
        }

        this.currentRadioStation = newCurrentRadioStation;


    }

    public void setNextRadioStation() {
        if (currentRadioStation <= 9) {
            currentRadioStation = currentRadioStation + 1;
        }
       if (currentRadioStation > 9) {
           currentRadioStation = 0;
        }
    }


    public void setPrevRadioStation() {
        if (currentRadioStation >-1) {
            currentRadioStation = currentRadioStation - 1;
        }
        if (currentRadioStation == -1) {
            currentRadioStation = 9;
        }
    }


/// Volume


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        this.currentVolume = newCurrentVolume;


    }

    public void setVolumeUp() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume == 10) {
            return;
        }
    }


    public void setVolumeDown() {
        if (currentVolume >= 1) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume == 0) {
            return;
        }
    }


}
