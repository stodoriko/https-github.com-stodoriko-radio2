import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {


    //Если текущая радиостанция - 9 и клиент нажал на кнопку next (следующая) на пульте, то текущей должна стать 0-ая;
    // в остальных случаях радио переключается просто на следующую станцию.
    @Test
    public void shouldComeToBeginningIfChannelAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentChanell(9); // чтобы иметь возможность тестировать на любом канале

        int expected = radio.getRadioChannelMin();
        radio.switchToNextChannel();

        int actual = radio.getCurrentChannel();
        assertEquals(expected, actual);
    }


    // Если текущая радиостанция - 0 и клиент нажал на кнопку prev (предыдущая) на пульте, то текущей должна стать 9-ая;
    // в остальных случаях радиопереключается просто на предыдущую станцию/ (создайте отдельный метод для этой операции)
    @Test
    public void shouldComeToEndIfChannelLessMin() {
        Radio radio = new Radio();

        radio.setCurrentChanell(0);

        int expected = radio.getRadioChannelMax();
        radio.switchToPrevChannel();

        int actual = radio.getCurrentChannel();
        assertEquals(expected, actual);
    }


    // Если уровень громкости звука достиг максимального значения, то дальнейшее нажатие на + не должно ни к чему приводить
    @Test
    public void shouldNotAddingIfMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);

        int expected = radio.getVolumeMax();
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }


    // Если уровень громкости звука достиг минимального значения, то дальнейшее нажатие на - не должно ни к чему приводить
    @Test
    public void shouldNotTurnDownIfMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        int expected = radio.getVolumeMin();
        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

}
