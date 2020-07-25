package example;

public class ValidNumber {
    public Boolean isValid(String inputNumber) {
        if (isAllNumber(inputNumber)) return false;
        if (inputNumber.length() == 4) {
            for (int i = 0; i < inputNumber.length(); i++) {
                for (int j = 0; j < inputNumber.length(); j++) {
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

    private boolean isAllNumber(String inputNumber) {
        char inputNum[] = inputNumber.toCharArray();
        for (int i = 0; i < inputNumber.length(); i++) {
            if (!Character.isDigit(inputNum[i])) {
                return false;
            }
        }
        return true;
    }
}
