import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test
    public void pressNextChannel() {
        Radio radio = new Radio();
        int actual = radio.pressNextChannel();
        System.out.println("Текущая радиостанция: " + actual);
    }

    @Test
    public void pressPrevChannel() {
        Radio radio = new Radio();
        int actual = radio.pressPrevChannel();
        System.out.println("Текущая радиостанция: " + actual);
    }

    @Test
    public void setRadioChannel() {
        Radio radio = new Radio();
        radio.setRadioChannel(-1);
    }

    @Test
    public void increaseVolume() {
        Radio radio = new Radio();
        int actual = radio.increaseVolume();
        System.out.println("Текущий уровень звука: " + actual);
    }

    @Test
    public void reduceVolume() {
        Radio radio = new Radio();
        int actual = radio.increaseVolume();
        System.out.println("Текущий уровень звука: " + actual);
    }

}
