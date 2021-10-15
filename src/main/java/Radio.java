public class Radio {

    private int radioChannelMin = 0;
    private int radioChannelMax = 9;
    private int currentChannel;

    private int volumeMin = 0;
    private int volumeMax = 10;
    private int currentVolume;



    public void switchToNextChannel() {
        if (getCurrentChannel() == getRadioChannelMax()) {
            setCurrentChannel(radioChannelMin);
        } else if (getCurrentChannel() < getRadioChannelMax()) {
            currentChannel++;
            setCurrentChannel(currentChannel);
        } else {
            setCurrentChannel(radioChannelMax);
        }
    }

    public void switchToPrevChannel() {
        if (getCurrentChannel() == radioChannelMin) {
            setCurrentChannel(radioChannelMax);
        } else if (getCurrentChannel() > radioChannelMin) {
            currentChannel--;
            setCurrentChannel(currentChannel);
        } else {
            setCurrentChannel(radioChannelMin);
        }
    }

    public void increaseVolume() {
        if (currentVolume < volumeMax) {
            currentVolume = currentVolume + 1;
        } else if (currentVolume == volumeMax) {
            currentVolume = getCurrentVolume();
        }
    }

    public void decreaseVolume() {
        if (currentVolume > volumeMin) {
            currentVolume = currentVolume - 1;
        } else if (currentVolume == volumeMin) {
            currentVolume = getCurrentVolume();
        }
    }


    public int getRadioChannelMin() {
        return radioChannelMin;
    }

    public int getRadioChannelMax() {
        return radioChannelMax;
    }


    public int getCurrentChannel() {
        return currentChannel;
    }

    public int getVolumeMin() {
        return volumeMin;
    }

    public void setCurrentChannel(int currentChannel) {
        this.currentChannel = currentChannel;
        if (getCurrentChannel() > radioChannelMax) {
            return;
        }
        if (getCurrentChannel() < radioChannelMin) {
            return;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public int getVolumeMax() {
        return volumeMax;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

}
