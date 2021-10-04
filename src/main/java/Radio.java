public class Radio {

    private int currentRadioStation = 1;
    private int minRadio = 0;
    private int maxRadio = 9;

    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 10;

    private int theEnteredChanel;


    public int pressNextChannel() {
        currentRadioStation = getCurrentRadioStation();
        if (currentRadioStation >= maxRadio) {
            currentRadioStation = 0;
        } else {
            currentRadioStation++;
        }
        return currentRadioStation;
    }

    public int pressPrevChannel() {
        currentRadioStation = getCurrentRadioStation();
        if (currentRadioStation <= minRadio) {
            currentRadioStation = 9;
        } else {
            currentRadioStation--;
        }
        return currentRadioStation;
    }

    public void setRadioChannel(int radioStationNumber) {
        currentRadioStation = getCurrentRadioStation();
        if ((radioStationNumber < minRadio) || (radioStationNumber > maxRadio)) {
            System.out.println("Выбрано недопустимое значение для радиостанции: " + radioStationNumber);
        } else {
            currentRadioStation = radioStationNumber;
            System.out.println("Текущая радиостанция: " + currentRadioStation);
        }
    }

    public int increaseVolume() {
        currentVolume = getCurrentVolume();
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        return currentVolume;
    }

    public int reduceVolume() {
        currentVolume = getCurrentVolume();
        if (currentVolume > 10) {
            currentVolume = currentVolume - 1;
        }
        return currentVolume;
    }


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

}
