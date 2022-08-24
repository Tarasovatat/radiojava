package ru.netology.radiojava;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int maxRadioStation;
    private int minRadioStation;

    public Radio() {
        maxRadioStation = 9;
    }

    public Radio(int countOfRadioStations) {
        maxRadioStation = countOfRadioStations - 1;
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

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < minRadioStation) {
            return;
        }
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void next() {
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation++;
        } else {
            currentRadioStation = minRadioStation;
        }
    }

    public void prev() {
        if (currentRadioStation > minRadioStation) {
            currentRadioStation--;
        } else {
            currentRadioStation = maxRadioStation;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
        setCurrentVolume(currentVolume);
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        setCurrentVolume(currentVolume);
    }

}

