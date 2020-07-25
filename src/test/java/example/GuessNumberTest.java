package example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GuessNumberTest {
    @Test
    void should_return_4A0B_when_answer_is_1234_given_1234() {
        //given
        String inputNumber = "1234";
        String answer = "1234";
        AnswerGenerater answerGenerater = mock(AnswerGenerater.class);
//        given(answerGenerater.generate());
        when(answerGenerater.generate()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(answerGenerater);
        //when
        String actual = guessNumber.guess(inputNumber);
        //then
        Assertions.assertEquals("4A0B", actual);
    }

    @Test
    void should_return_2A2B_when_answer_is_1234_given_1243() {
        //given
        String inputNumber = "1243";
        String answer = "1234";
        AnswerGenerater answerGenerater = mock(AnswerGenerater.class);
        when(answerGenerater.generate()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(answerGenerater);
        //when
        String actual = guessNumber.guess(inputNumber);
        //then
        Assertions.assertEquals("2A2B", actual);
    }

    @Test
    void should_return_0A0B_when_answer_is_1234_given_5678() {
        //given
        String inputNumber = "5678";
        String answer = "1234";
        AnswerGenerater answerGenerater = mock(AnswerGenerater.class);
        when(answerGenerater.generate()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(answerGenerater);
        //when
        String actual = guessNumber.guess(inputNumber);
        //then
        Assertions.assertEquals("0A0B", actual);
    }

    @Test
    void should_return_0A4B_when_answer_is_1234_given_4321() {
        //given
        String inputNumber = "4321";
        String answer = "1234";
        AnswerGenerater answerGenerater = mock(AnswerGenerater.class);
        when(answerGenerater.generate()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(answerGenerater);
        //when
        String actual = guessNumber.guess(inputNumber);
        //then
        Assertions.assertEquals("0A4B", actual);
    }

    @Test
    void should_return_0A2B_when_answer_is_1234_given_2178() {
        //given
        String inputNumber = "2178";
        String answer = "1234";
        AnswerGenerater answerGenerater = mock(AnswerGenerater.class);
        when(answerGenerater.generate()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(answerGenerater);
        //when
        String actual = guessNumber.guess(inputNumber);
        //then
        Assertions.assertEquals("0A2B", actual);
    }

    @Test
    void should_return_1A0B_when_answer_is_1234_given_1567() {
        //given
        String inputNumber = "1567";
        String answer = "1234";
        AnswerGenerater answerGenerater = mock(AnswerGenerater.class);
        when(answerGenerater.generate()).thenReturn(answer);
        GuessNumber guessNumber = new GuessNumber(answerGenerater);
        //when
        String actual = guessNumber.guess(inputNumber);
        //then
        Assertions.assertEquals("1A0B", actual);
    }

    @Test
    void should_return_false_when_input_length_is_shouter_than_4_given_123() {
        //given
        String inputNumber = "123";
        ValidNumber validNumber = new ValidNumber();
        //when
        Boolean actual = validNumber.isValid(inputNumber);
        //then
        Assertions.assertEquals(false, actual);
    }

    @Test
    void should_return_false_when_input_length_is_longer_than_4_given_12345() {
        //given
        String inputNumber = "12345";
        ValidNumber validNumber = new ValidNumber();
        //when
        Boolean actual = validNumber.isValid(inputNumber);
        //then
        Assertions.assertEquals(false, actual);
    }

    @Test
    void should_return_false_when_input_has_same_number_given_1223() {
        //given
        String inputNumber = "1223";
        ValidNumber validNumber = new ValidNumber();
        //when
        Boolean actual = validNumber.isValid(inputNumber);
        //then
        Assertions.assertEquals(false, actual);
    }

    @Test
    void should_return_true_when_generate_answer_given_created_random_answer() {
        //given
        AnswerGenerater createdAnswer = new CreateAnswer();
        ValidNumber validNumber = new ValidNumber();
        //when
        boolean actual = validNumber.isValid(createdAnswer.generate());
        //then
        Assertions.assertTrue(actual);
    }
}
