package example;

public class GuessNumber {
    private static final String ERROR_MESSAGE = "Wrong Input，Input again";
    private static final String STRING_A = "A";
    private static final String STRING_B = "B";
    private final String answer;
    private ValidNumber validNumber;

    public GuessNumber(AnswerGenerater answerGenerater) {
        this.answer = answerGenerater.generate();
        validNumber = new ValidNumber();
    }

    public String guess(String inputNumber) {
        if (!validNumber.isValid(inputNumber)) return ERROR_MESSAGE;
        return createResult(answer, inputNumber);
    }

    private String createResult(String answer, String inputNumber) {
        int sameNum = sameNumber(answer, inputNumber);
        int samePos = samePosition(answer, inputNumber);
        return samePos + STRING_A + (sameNum - samePos) + STRING_B;
    }

    private int samePosition(String answer, String inputNumber) {
        int count = 0;
        for (int i = 0; i < answer.length(); i++) {
            if (answer.charAt(i) == inputNumber.charAt(i)) {
                count++;
            }
        }
        return count;
    }

    private int sameNumber(String answer, String inputNumber) {
        int count = 0;
        for (int i = 0; i < answer.length(); i++) {
            if (answer.indexOf(inputNumber.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }
}
