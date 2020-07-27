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
        char inputNumbers[] = inputNumber.toCharArray();
        for (int inputNumIndex = 0; inputNumIndex < inputNumber.length(); inputNumIndex++) {
            if (!Character.isDigit(inputNumbers[inputNumIndex])) {
                return false;
            }
        }
        return true;
    }
}
