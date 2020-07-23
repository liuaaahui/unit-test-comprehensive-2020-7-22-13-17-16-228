package example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class GuessNumberTest {
    @Test
    void should_return_4A0B_when_answer_is_1234_given_1234() {
        //given
        String inputNumber = "1234";
        //when
        GuessNumber guessNumber = new GuessNumber("1234");
        //then
        String actual = guessNumber.guess(inputNumber);
        Assertions.assertEquals("4A0B",actual);
    }

    @Test
    void should_return_2A2B_when_answer_is_1234_given_1243() {
        //given
        String inputNumber = "1243";
        //when
        GuessNumber guessNumber = new GuessNumber("1234");
        //then
        String actual = guessNumber.guess(inputNumber);
        Assertions.assertEquals("2A2B",actual);
    }
}
