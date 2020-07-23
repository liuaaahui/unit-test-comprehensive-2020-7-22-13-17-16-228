package example;

public class GuessNumber {
    private final String answer;

    public GuessNumber(String answer) {
        this.answer = answer;
    }

    public String guess(String inputNumber) {
        if(inputNumber.equals(answer)){
            return "4A0B";
        }
        if(totallyDifferent(answer,inputNumber)) return "0A0B";
        if(sameNumberAndDiffPosition(answer,inputNumber)) return "0A4B";
        return "2A2B";
    }

    private boolean sameNumberAndDiffPosition(String answer, String inputNumber) {
        int count = 0;
        for (int i = 0; i < answer.length(); i++) {
            if (answer.charAt(i) == inputNumber.charAt(i)) {
                return false;
            }
            if (answer.indexOf(inputNumber.charAt(i)) != -1) {
                count++;
            }
        }
        return count == 4;
    }

    private boolean totallyDifferent(String answer, String inputNumber) {
        for (int i = 0; i < answer.length(); i++) {
            if (answer.indexOf(inputNumber.charAt(i)) != -1) {
                return false;
            }
        }
        return true;
    }
}
