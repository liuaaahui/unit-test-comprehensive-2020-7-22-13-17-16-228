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
        return "2A2B";
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
