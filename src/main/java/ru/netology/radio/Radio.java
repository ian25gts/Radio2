package ru.netology.radio;

public class Radio {
    private int currentRadioStationNumber;
    private int currentVolume;
    private int numberRadioStations = 10;
    private int maxNumber;

    public Radio() {
    }

    public Radio(int numberRadioStations) {
        this.numberRadioStations = numberRadioStations;
        this.maxNumber = numberRadioStations - 1;
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
            currentRadioStationNumber = 0;
        }
        this.currentRadioStationNumber = currentRadioStationNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
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