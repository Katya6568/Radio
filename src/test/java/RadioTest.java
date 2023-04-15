import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(10);

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStationNumber() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(7);

        int expected = 8;
        int actual = radio.nextStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotIncreaseStationNumberAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(9);

        int expected = 0;
        int actual = radio.nextStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseStationNumber() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(9);

        int expected = 8;
        int actual = radio.previousStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotDecreaseStationNumberBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(0);

        int expected = 9;
        int actual = radio.previousStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.setVolume(90);

        int expected = 91;
        int actual = radio.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotIncreaseVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setVolume(100);

        int expected = 100;
        int actual = radio.increaseVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();

        radio.setVolume(25);

        int expected = 24;
        int actual = radio.decreaseVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetVolumeBelowMinIfCurrentMin() {
        Radio radio = new Radio();

        radio.setVolume(0);

        int expected = 0;
        int actual = radio.decreaseVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setVolume(110);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetVolumeBelowMin() {
        Radio radio = new Radio();

        radio.setVolume(-1);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }
}



