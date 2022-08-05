package ru.netology.radio;

public class Radio {

    public int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        currentStation = newCurrentStation;
    }


    public void volumeUp() {
        if (currentVolume < 10 & currentVolume >= 0) {
            currentVolume = currentVolume + 1;
        }

    }

    public void volumeDown() {
        if (currentVolume <= 10 & currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }

    }

    // "next" следующая станция
    public void next() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation < 9) {
            currentStation = currentStation - 1;
        }
        if (currentStation < 0) {
            currentStation = 9;
        }


    }
}