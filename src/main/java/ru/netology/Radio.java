package ru.netology;

public class Radio {

    private int currentRadioStation;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioSation) {
        if (newCurrentRadioSation < 0) {
            return;
        }
        if (newCurrentRadioSation > 9) {
            return;
        }
        this.currentRadioStation = newCurrentRadioSation;


    }

    public void setNextRadioSation() {
        if (currentRadioStation < 10) {
            currentRadioStation = currentRadioStation + 1;
        }
        if (currentRadioStation == 10) {
            currentRadioStation = 0;
        }
    }


    public void setPrevRadioSation() {
        if (currentRadioStation < 10) {
            currentRadioStation = currentRadioStation - 1;
        }
        if (currentRadioStation == -1) {
            currentRadioStation = 9;
        }
    }


/// Volume

    private int currentVolume;

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
        if (currentVolume < 11) {
            currentVolume = currentVolume * 0;
        }
        if (currentVolume == 0) {
            return;
        }
    }


}
