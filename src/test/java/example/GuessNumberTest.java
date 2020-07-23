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

    @Test
    void should_return_1A0B_when_answer_is_1234_given_1567() {
        //given
        String inputNumber = "1567";
        GuessNumber guessNumber = new GuessNumber("1234");
        //when
        String actual = guessNumber.guess(inputNumber);
        //then
        Assertions.assertEquals("1A0B",actual);
    }

    @Test
    void should_return_false_when_input_length_is_shouter_than_4_given_123() {
        //given
        String inputNumber = "123";
        GuessNumber guessNumber = new GuessNumber("1234");
        //when
        Boolean actual = guessNumber.isValid(inputNumber);
        //then
        Assertions.assertEquals(false,actual);
    }

    @Test
    void should_return_false_when_input_length_is_longer_than_4_given_12345() {
        //given
        String inputNumber = "12345";
        GuessNumber guessNumber = new GuessNumber("1234");
        //when
        Boolean actual = guessNumber.isValid(inputNumber);
        //then
        Assertions.assertEquals(false,actual);
    }

    @Test
    void should_return_false_when_input_has_same_number_given_1223() {
        //given
        String inputNumber = "1223";
        GuessNumber guessNumber = new GuessNumber("1234");
        //when
        Boolean actual = guessNumber.isValid(inputNumber);
        //then
        Assertions.assertEquals(false,actual);
    }
}
