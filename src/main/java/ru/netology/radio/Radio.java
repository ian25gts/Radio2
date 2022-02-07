package ru.netology.radio;

public class Radio {
    private int currentRadioStationNumber;
    private int currentVolume;
    private int numberRadioStations = 10;
    private int minNumber;
    private int maxNumber = numberRadioStations - 1;
    private int minVolume;
    private int maxVolume = 100;

    public Radio() {
    }

    public Radio(int numberRadioStations) {
        this.numberRadioStations = numberRadioStations;
    }

    public int getMinVolume() {
        return 0;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getMinNumber() {
        return 0;
    }

    public void setMinNumber(int minNumber) {
        this.minNumber = minNumber;
    }

    public int getNumberRadioStations() {
        return numberRadioStations;
    }

    public void setNumberRadioStations(int numberRadioStations) {
        this.numberRadioStations = numberRadioStations;
    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void setToNext() {
        setCurrentRadioStationNumber(currentRadioStationNumber + 1);
    }

    public void setToPrev() {
        setCurrentRadioStationNumber(currentRadioStationNumber - 1);
    }

    public void setCurrentRadioStationNumber(int currentRadioStationNumber) {
        if (currentRadioStationNumber < 0) {
            currentRadioStationNumber = maxNumber;
        }
        if (currentRadioStationNumber > maxNumber) {
            currentRadioStationNumber = minNumber;
        }
        this.currentRadioStationNumber = currentRadioStationNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            currentVolume = minVolume;
        }
        if (currentVolume > 100) {
            currentVolume = maxVolume;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        setCurrentVolume(currentVolume + 1);
    }

    public void reduceVolume() {
        setCurrentVolume(currentVolume - 1);
    }

}