package example;

public class GuessNumber {
    private final String answer;

    public GuessNumber(String answer) {
        this.answer = answer;
    }

    public String guess(String inputNumber) {
        if(!isValid(inputNumber)) return "Wrong Input，Input again";
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

    public Boolean isValid(String inputNumber) {
        if(inputNumber.length() == 4){
            for (int i = 0; i < this.answer.length(); i++) {
                for (int j = 0; j < this.answer.length(); j++) {
                    if (inputNumber.charAt(i) == inputNumber.charAt(j)) {
                        if (i == j) continue;
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }
}
