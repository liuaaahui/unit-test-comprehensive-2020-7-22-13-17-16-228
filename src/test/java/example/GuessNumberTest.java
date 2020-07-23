package example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class GuessNumberTest {
    @Test
    void should_return_4A0B_when_answer_is_1234_given_1234() {
        //given
        String inputNumber = "1234";
        GuessNumber guessNumber = new GuessNumber("1234");
        //when
        String actual = guessNumber.guess(inputNumber);
        //then
        Assertions.assertEquals("4A0B",actual);
    }

    @Test
    void should_return_2A2B_when_answer_is_1234_given_1243() {
        //given
        String inputNumber = "1243";
        GuessNumber guessNumber = new GuessNumber("1234");
        //when
        String actual = guessNumber.guess(inputNumber);
        //then
        Assertions.assertEquals("2A2B",actual);
    }

    @Test
    void should_return_0A0B_when_answer_is_1234_given_5678() {
        //given
        String inputNumber = "5678";
        GuessNumber guessNumber = new GuessNumber("1234");
        //when
        String actual = guessNumber.guess(inputNumber);
        //then
        Assertions.assertEquals("0A0B",actual);
    }

    @Test
    void should_return_0A4B_when_answer_is_1234_given_4321() {
        //given
        String inputNumber = "4321";
        GuessNumber guessNumber = new GuessNumber("1234");
        //when
        String actual = guessNumber.guess(inputNumber);
        //then
        Assertions.assertEquals("0A4B",actual);
    }
    @Test
    void should_return_0A2B_when_answer_is_1234_given_2178() {
        //given
        String inputNumber = "2178";
        GuessNumber guessNumber = new GuessNumber("1234");
        //when
        String actual = guessNumber.guess(inputNumber);
        //then
        Assertions.assertEquals("0A2B",actual);
    }

}
