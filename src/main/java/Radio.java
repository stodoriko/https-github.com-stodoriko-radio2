public class Radio {

    private int radioChannelMin = 0;
    private int radioChannelMax = 9;
    private int currentChanell;

    private int volumeMin = 0;
    private int volumeMax = 10;
    private int currentVolume;



    public void switchToNextChannel() {
        if (getCurrentChannel() < radioChannelMax) {
            setCurrentChanell(currentChanell++);
        } else  if (getCurrentChannel() == radioChannelMax) {
            setCurrentChanell(radioChannelMin);
        }
    }

    public void switchToPrevChannel() {
        if (getCurrentChannel() > radioChannelMin) {
            setCurrentChanell(currentChanell--);
        } else if (getCurrentChannel() == radioChannelMin) {
            setCurrentChanell(radioChannelMax);
        }
    }

    public void increaseVolume() {
        currentVolume = getCurrentVolume();
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        currentVolume = getCurrentVolume();
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }


    public int getRadioChannelMin() {
        return radioChannelMin;
    }

    public int getRadioChannelMax() {
        return radioChannelMax;
    }

    public int getCurrentChannel() {
        return currentChanell;
    }

    public void setCurrentChanell(int currentChanell) {
        this.currentChanell = currentChanell;
    }

    public int getVolumeMin() {
        return volumeMin;
    }

    public void setVolumeMin(int volumeMin) {
        this.volumeMin = volumeMin;
    }

    public int getVolumeMax() {
        return volumeMax;
    }

    public void setVolumeMax(int volumeMax) {
        this.volumeMax = volumeMax;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

}
