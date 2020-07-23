package example;

public class GuessNumber {
    private final String answer;

    public GuessNumber(String answer) {
        this.answer = answer;
    }

    public String guess(String inputNumber) {
        if (inputNumber.equals(answer)) {
            return "4A0B";
        }
        return createResult(answer, inputNumber);
    }

    private String createResult(String answer, String inputNumber) {
        int sameNum = sameNumber(answer, inputNumber);
        int samePos = samePosition(answer, inputNumber);
        return samePos + "A" + (sameNum-samePos) + "B";
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
