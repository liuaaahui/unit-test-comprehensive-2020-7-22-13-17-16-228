package example;

public class ValidNumber {
    public Boolean isValid(String inputNumber) {
        if (isAllNumber(inputNumber) && inputNumber.length() == 4) {
            for (int inputNumberIndex = 0; inputNumberIndex < inputNumber.length(); inputNumberIndex++) {
                for (int innerInputNumberIndex = 0; innerInputNumberIndex < inputNumber.length(); innerInputNumberIndex++) {
                    if (inputNumber.charAt(inputNumberIndex) == inputNumber.charAt(innerInputNumberIndex)) {
                        if (inputNumberIndex == innerInputNumberIndex) continue;
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
