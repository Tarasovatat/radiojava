package ru.netology.radiojava;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test

    public void shouldNotSetCurrentRadioStationAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldNotSetCurrentRadioStationUnderMin() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetNextRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(1);

        radio.next();

        int expected = 2;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetNextRadioStationAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetPrevRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);

        radio.prev();

        int expected = 7;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetPrevRadioStationUnderMin() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);

        radio.prev();

        int expected = 9;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(8);

        radio.increaseVolume();

        int expected = 9;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }


    @Test

    public void shouldDecreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(2);

        radio.decreaseVolume();

        int expected = 1;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldDecreaseVolume2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-3);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldNotIncreaseAboveMaxVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(11);

        radio.maxVolume();

        int expected = 0;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldNotIncreaseAboveMaxVolume2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);

        radio.maxVolume();

        int expected = 10;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldNotDecreaseUnderMinVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-2);

        radio.minVolume();

        int expected = 0;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldNotDecreaseUnderMinVolume2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        radio.minVolume();

        int expected = 0;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldNotDecreaseUnderMinVolume3() {
        Radio radio = new Radio();

        radio.setCurrentVolume(2);

        radio.minVolume();

        int expected = 2;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

}
