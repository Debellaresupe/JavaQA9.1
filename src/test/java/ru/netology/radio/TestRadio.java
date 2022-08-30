package ru.netology.radio;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestRadio {

    @Test
    public void shouldSwitchNextStation() {
        Radio fm = new Radio();

        fm.setCurrentStation(8);
        fm.next();

        int expected = 9;
        int actual = fm.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldSwitchNextStationToOne() {
        Radio fm = new Radio(0,0,0,9,0,100);

        fm.setCurrentStation(10);
        fm.next();

        int expected = 1;
        int actual = fm.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldSwitchNextStationToNine() {
        Radio fm = new Radio(0,0,0,9,0,100);

        fm.setCurrentStation(-1);
        fm.prev();

        int expected = 9;
        int actual = fm.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldSwitchToMinStationOverMax() {
        Radio fm = new Radio(0,0,0,9,0,100);

        fm.setCurrentStation(9);
        fm.next();

        int expected = 0;
        int actual = fm.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldSwitchPrevStation() {
        Radio fm = new Radio(0,0,0,9,0,100);

        fm.setCurrentStation(8);
        fm.prev();

        int expected = 7;
        int actual = fm.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldBeSwitchPrevStation() {
        Radio fm = new Radio(0,0,0,9,0,100);

        fm.setCurrentStation(9);
        fm.prev();

        int expected = 8;
        int actual = fm.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSwitchToMaxStationBelowMin() {
        Radio fm = new Radio(0,0,0,9,0,100);

        fm.setCurrentStation(0);
        fm.prev();

        int expected = 9;
        int actual = fm.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldVolumeUp() {
        Radio fm = new Radio(0,0,0,9,0,100);

        fm.setCurrentVolume(8);
        fm.volumeUp();

        int expected = 9;
        int actual = fm.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotVolumeUpOverMax() {
        Radio fm = new Radio(0,0,0,9,0,100);

        fm.setCurrentVolume(100);
        fm.volumeUp();

        int expected = 100;
        int actual = fm.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldBeMax() {
        Radio fm = new Radio(0,0,0,9,0,100);

        fm.setCurrentVolume(100);
        fm.volumeUp();
        fm.volumeUp();

        int expected = 100;
        int actual = fm.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeDown() {
        Radio fm = new Radio(0,0,0,9,0,100);

        fm.setCurrentVolume(10);
        fm.volumeDown();

        int expected = 9;
        int actual = fm.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotVolumeDownBelowMin() {
        Radio fm = new Radio(0,0,0,9,0,100);

        fm.setCurrentVolume(0);
        fm.volumeDown();

        int expected = 0;
        int actual = fm.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldVolumeDownToZero() {
        Radio fm = new Radio(0,0,0,9,0,100);

        fm.setCurrentVolume(1);
        fm.volumeDown();
        fm.volumeDown();

        int expected = 0;
        int actual = fm.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotBeCurrentVolumeDownBelowMin() {
        Radio fm = new Radio(0,0,0,9,0,100);

        fm.setCurrentVolume(-1);
        fm.volumeDown();

        int expected = 0;
        int actual = fm.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldNotBeCurrentVolumeDownOverMax() {
        Radio fm = new Radio(0,0,0,9,0,100);

        fm.setCurrentVolume(110);
        fm.volumeDown();

        int expected = 0;
        int actual = fm.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}
