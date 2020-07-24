package example;

import java.util.Scanner;

public class PlayGuessNumberGame {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AnswerGenerater answerGenerater = new CreateAnswer();
        GuessNumber guessNumber = new GuessNumber(answerGenerater);
        for(int i = 0;i<6;i++){
            String inputNumber = scanner.next();
            System.out.println(guessNumber.guess(inputNumber));
            if(guessNumber.guess(inputNumber) == "4A0B") break;
        }
    }
}
