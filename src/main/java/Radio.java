public class Radio {
    private int currentStationNumber;
    private int volume;

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }
    public int getVolume() {
        return volume;
    }

    public void setCurrentStationNumber(int newCurrentStationNumber) {
        if (newCurrentStationNumber > 9) {
            return;
        }
        currentStationNumber = newCurrentStationNumber;
    }

    public int nextStationNumber() {
        if (currentStationNumber < 9) {
            currentStationNumber = currentStationNumber + 1;
        } else {
            currentStationNumber = 0;
        }
        return currentStationNumber;
    }

    public int previousStationNumber() {
        if (currentStationNumber >0) {
            currentStationNumber = currentStationNumber - 1;
        } else {
            currentStationNumber = 9;
        }
        return currentStationNumber;

    }
    public void setVolume(int newVolume) {
        if (newVolume > 100) {
            return;
        }
        if (newVolume < 0) {
            return;
        }
        volume = newVolume;
    }

    public int increaseVolume () {
        if (volume < 100) {
            volume = volume + 1;
        } else {
            volume = 100;
        }
        return volume;
    }

    public int decreaseVolume () {
        if (volume > 0) {
            volume = volume - 1;
        } else {
            volume = 0;
        }
        return volume;
    }
}
