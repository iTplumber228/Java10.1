package ru.netology.javaqamvn.services;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test
    public void testStations() {
        Radio rad = new Radio(0, 10);
        Assertions.assertEquals(0, rad.getMinStation());
        Assertions.assertEquals(10, rad.getMaxStation());
        Assertions.assertEquals(0, rad.getCurrentStation());
    }

    @Test
    void testSetCurrentStation() {
        Radio radio = new Radio(0, 10);
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    void testSetCurrentStationBelowRange() {
        Radio radio = new Radio(0, 10);
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void testSetCurrentStationAboveRange() {
        Radio radio = new Radio(0, 10);
        radio.setCurrentStation(11);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testIncreaseStationWithinRange() {
        Radio radio = new Radio(0, 10);

        radio.setCurrentStation(5);
        radio.increaseStation();
        assertEquals(6, radio.getCurrentStation());

        radio.setCurrentStation(10);
        radio.increaseStation();
        assertEquals(0, radio.getCurrentStation());
    }
    @Test
    public void testDecreaseStationBelowMin() {
        Radio radio = new Radio(0, 10);
        radio.setCurrentStation(0);
        radio.decreaseStation();
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    public void testDecreaseStationAboveMin() {
        Radio radio = new Radio(0, 10);
        radio.setCurrentStation(5);
        radio.decreaseStation();
        assertEquals(4, radio.getCurrentStation());
    }
    @Test
    public void testVolume() {
        Radio rad = new Radio(0, 100);
        Assertions.assertEquals(0, rad.getMinVolume());
        Assertions.assertEquals(100, rad.getMaxVolume());
        Assertions.assertEquals(0, rad.getCurrentVolume());
    }
    @Test
    void testSetCurrentVolume() {
        Radio radio = new Radio(0, 100);
        radio.setCurrentVolume(58);
        assertEquals(58, radio.getCurrentVolume());
    }

    @Test
    void testSetCurrentVolumeBelowRange() {
        Radio radio = new Radio(0, 100);
        radio.setCurrentVolume(-15);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void testSetCurrentVolumeAboveRange() {
        Radio radio = new Radio(0, 100);
        radio.setCurrentVolume(111);
        assertEquals(0, radio.getCurrentVolume());
    }
    @Test
    public void testIncreaseVolumeWithinRange() {
        Radio radio = new Radio(0, 100);

        radio.setCurrentVolume(59);
        radio.increaseVolume();
        assertEquals(60, radio.getCurrentVolume());

        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
    @Test
    public void testDecreaseVolumeBelowMin() {
        Radio radio = new Radio(0, 100);
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void testDecreaseVolumeAboveMin() {
        Radio radio = new Radio(0, 100);
        radio.setCurrentVolume(49);
        radio.decreaseStation();
        assertEquals(49, radio.getCurrentVolume());
    }

}