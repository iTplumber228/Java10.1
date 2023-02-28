package ru.netology.javaqamvn.services;

public class Radio {
    private int maxStation = 10;
    private int minStation = 0;
    private int currentStation = minStation;

    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = minVolume;


    public Radio(int minStation, int maxStation) {
        this.minStation = minStation;
        this.maxStation = maxStation;
        this.currentStation = minStation;

    }

    public int getMinStation() {
        return minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int station) {
        if (station >= 0 && station <= 10) {
            this.currentStation = station;
        }
    }

    public void increaseStation() {
        if (currentStation >= maxStation) {
            currentStation = minStation;
        } else {
            currentStation += 1;
        }
    }

    public void decreaseStation() {
        if (currentStation <= minStation) {
            currentStation = maxStation;
        } else {
            currentStation -= 1;
        }
    }

    public void RadioVol(int minVolume, int maxVolume) {

        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
        this.currentVolume = minVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.currentVolume = volume;
        }
    }

    public void increaseVolume() {
        if (currentVolume >= maxVolume) {
            currentVolume = minVolume;
        } else {
            currentVolume += 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume <= minVolume) {
            currentVolume = maxVolume;
        } else {
            currentVolume -= 1;
        }
    }
}



