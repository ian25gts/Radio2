package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio box = new Radio();
    Radio box1 = new Radio(20);

    @Test
    public void teacherTest() {
        box1.setCurrentRadioStationNumber(15);
        int expected = 15;
        int actual = box1.getCurrentRadioStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void numberRadioStationsTest() {
        box.setNumberRadioStations(8);
        int expected = 8;
        int actual = box.getNumberRadioStations();
        assertEquals(expected, actual);
    }

    @Test
    public void currentRadioStationNumberZeroTest() {
        box.setCurrentRadioStationNumber(0);
        int expected = 0;
        int actual = box.getCurrentRadioStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void currentRadioStationNumberMaxTest() {
        box.setCurrentRadioStationNumber(9);
        int expected = 9;
        int actual = box.getCurrentRadioStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void setToNextMaxTest() {
        box.setCurrentRadioStationNumber(9);
        box.setToNext();
        int expected = 0;
        int actual = box.getCurrentRadioStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void setToNextMinTest() {
        box.setCurrentRadioStationNumber(0);
        box.setToNext();
        int expected = 1;
        int actual = box.getCurrentRadioStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void setToPrevTest() {
        box.setCurrentRadioStationNumber(0);
        box.setToPrev();
        int expected = 9;
        int actual = box.getCurrentRadioStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    public void soundVolumeTest() {
        box.setCurrentVolume(55);
        int expected = 55;
        int actual = box.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeTest() {
        box.setCurrentVolume(101);
        box.increaseVolume();
        int expected = 100;
        int actual = box.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void reduceVolumeTest() {
        box.setCurrentVolume(55);
        box.reduceVolume();
        int expected = 54;
        int actual = box.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void reduceVolumeMinTest() {
        box.setCurrentVolume(0);
        box.reduceVolume();
        int expected = 0;
        int actual = box.getCurrentVolume();
        assertEquals(expected, actual);
    }
}