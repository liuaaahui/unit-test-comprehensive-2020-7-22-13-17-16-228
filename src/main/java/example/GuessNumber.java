package example;

public class GuessNumber {
    private static final String ERROR_MESSAGE = "Wrong Input，Input again";
    private static final String STRING_A = "A";
    private static final String STRING_B = "B";
    private final String answer;
    private final ValidNumber validNumber;

    public GuessNumber(AnswerGenerater answerGenerater) {
        this.answer = answerGenerater.generate();
        validNumber = new ValidNumber();
    }

    public String guess(String inputNumber) {
        if (!validNumber.isValid(inputNumber)) return ERROR_MESSAGE;
        return createResult(answer, inputNumber);
    }

    private String createResult(String answer, String inputNumber) {
        int sameNumber = findSameNumber(answer, inputNumber);
        int samePosition = findSamePosition(answer, inputNumber);
        return samePosition + STRING_A + (sameNumber - samePosition) + STRING_B;
    }

    private int findSamePosition(String answer, String inputNumber) {
        int count = 0;
        for (int index = 0; index < answer.length(); index++) {
            if (answer.charAt(index) == inputNumber.charAt(index)) {
                count++;
            }
        }
        return count;
    }

    private int findSameNumber(String answer, String inputNumber) {
        int count = 0;
        for (int index = 0; index < answer.length(); index++) {
            if (answer.indexOf(inputNumber.charAt(index)) != -1) {
                count++;
            }
        }
        return count;
    }
}
