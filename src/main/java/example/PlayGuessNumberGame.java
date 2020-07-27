package example;

import java.util.Scanner;

public class PlayGuessNumberGame {


    private static final String SPACE_PATTERN = " ";
    private static final String NULL_PATTERN = "";
    private static final int largeTimes = 6;
    private static final String WIN_NUMBER = "4A0B";
    private static final String WIN_MESSAGE = "YOU WIN!";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AnswerGenerater answerGenerater = new CreateAnswer();
        GuessNumber guessNumber = new GuessNumber(answerGenerater);
        for (int times = 0; times < largeTimes; times++) {
            String inputNumber = scanner.nextLine().replaceAll(SPACE_PATTERN, NULL_PATTERN);
            System.out.println(guessNumber.guess(inputNumber));
            if (guessNumber.guess(inputNumber) == WIN_NUMBER){
                System.out.println(WIN_MESSAGE);
                break;
            }
        }
        System.out.println("GAME OVER!");
    }
}
