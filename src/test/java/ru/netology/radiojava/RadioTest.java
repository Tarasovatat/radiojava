package ru.netology.radiojava;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test

    public void shouldNotSetCurrentRadioStationUnderMin() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetCurrentRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(2);

        int expected = 2;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldNotSetCurrentRadioStationAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetNextRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(1);

        radio.next();

        int expected = 2;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetNextRadioStationAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetPrevRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(4);

        radio.prev();

        int expected = 3;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetPrevRadioStationUnderMin() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test

    public void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(8);

        radio.increaseVolume();

        int expected = 9;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test

    public void shouldDecreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(3);

        radio.decreaseVolume();

        int expected = 2;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetCurrentVolumeUnderMin() {


        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetCurrentVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(11);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldIncreaseVolumeIfMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);

        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldDecreaseVolumeIfMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}
