package ru.netology;

public class Radio {

    private int currentRadioStation=3;
    private int currentVolume=35;
    private int maxStation = 12;
    private int minStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio(){

    }
    public Radio(int currentRadioStation, int currentVolume, int maxStation, int minStation, int maxVolume, int minVolume) {
        this.currentRadioStation = currentRadioStation;
        this.currentVolume = currentVolume;
        this.maxStation = maxStation;
        this.minStation = minStation;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
    }

    public int getCurrentVolume() { return currentVolume; }

    public int getCurrentRadioStation() { return currentRadioStation; }

    public int getMaxStation() { return maxStation; }
    public int getMinStation() { return minStation; }
    public int getMaxVolume() { return maxVolume; }
    public int getMinVolume() { return minVolume; }

    public void setCurrentRadioStation(int newCurrentRadioSation) {
        if (newCurrentRadioSation < 0) {
            return;
        }
        if (newCurrentRadioSation > 9) {
            return;
        }
        this.currentRadioStation = newCurrentRadioSation;


    }

    public void setNextRadioStation() {
        if (currentRadioStation < 10 && currentRadioStation >-1) {
            currentRadioStation = currentRadioStation + 1;
        }
        if (currentRadioStation == 10) {
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


    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        this.currentVolume = newCurrentVolume;


    }

    public void setVolumeUp() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume == 100) {
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
