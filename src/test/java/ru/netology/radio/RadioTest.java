package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void currentRadioStationNumberZeroTest() {
        Radio box = new Radio();

        box.setCurrentRadioStationNumber(0);

        int expected = 0;
        int actual = box.getCurrentRadioStationNumber();

        assertEquals(expected, actual);
    }

    @Test
    public void currentRadioStationNumberMaxTest() {
        Radio box = new Radio();

        box.setCurrentRadioStationNumber(9);

        int expected = 9;
        int actual = box.getCurrentRadioStationNumber();

        assertEquals(expected, actual);
    }

    @Test
    public void setToNextMaxTest() {
        Radio box = new Radio();
        box.setCurrentRadioStationNumber(9);

        box.setToNext();

        int expected = 0;
        int actual = box.getCurrentRadioStationNumber();

        assertEquals(expected, actual);
    }

    @Test
    public void setToNextMinTest() {
        Radio box = new Radio();
        box.setCurrentRadioStationNumber(0);

        box.setToNext();

        int expected = 1;
        int actual = box.getCurrentRadioStationNumber();

        assertEquals(expected, actual);
    }

    @Test
    public void setToPrevTest() {
        Radio box = new Radio();
        box.setCurrentRadioStationNumber(0);

        box.setToPrev();

        int expected = 9;
        int actual = box.getCurrentRadioStationNumber();

        assertEquals(expected, actual);
    }

    @Test
    public void soundVolumeTest() {
        Radio box = new Radio();

        box.setCurrentVolume(10);

        int expected = 10;
        int actual = box.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeTest() {
        Radio box = new Radio();
        box.setCurrentVolume(10);

        box.increaseVolume();

        int expected = 10;
        int actual = box.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void reduceVolumeTest() {
        Radio box = new Radio();
        box.setCurrentVolume(10);

        box.reduceVolume();

        int expected = 9;
        int actual = box.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void reduceVolumeMinTest() {
        Radio box = new Radio();
        box.setCurrentVolume(0);

        box.reduceVolume();

        int expected = 0;
        int actual = box.getCurrentVolume();

        assertEquals(expected, actual);
    }
}