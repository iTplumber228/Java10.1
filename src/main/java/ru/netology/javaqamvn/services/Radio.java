package ru.netology.javaqamvn.services;


public class Radio {


    private int minStation = 0;
    private int maxStation = 9;
    private int currentStation = minStation;

    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = minVolume;

    public Radio() {
        maxStation = 9;
    }

    public Radio(int stationCount) {
        maxStation = stationCount - 1;

    }

    public Radio(int minStation, int maxStation) {
        this.minStation = minStation;
        this.maxStation = maxStation;
        this.currentStation = minStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }

        this.currentVolume = currentVolume;
    }

    public void next() {
        if (currentStation != maxStation) {
            currentStation++;
        } else {
            currentStation = minStation;
        }
    }

    public void prev() {
        if (currentStation != minStation) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public void nextVol() {
        if (currentVolume != maxVolume) {
            currentVolume++;
        } else {
            currentVolume = minVolume;
        }
    }

    public void prevVol() {
        if (currentVolume != minVolume) {
            currentVolume--;
        } else {
            currentVolume = maxVolume;
        }
    }
}
