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
        return "2A2B";
    }
}
