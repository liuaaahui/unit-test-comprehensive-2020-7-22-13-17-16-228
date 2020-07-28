package example;

import java.util.Random;

public class CreateAnswer implements AnswerGenerater {

    private static final int BOUND_NUMBER = 10;
    private static final int LENGTH = 4;

    @Override
    public String generate() {
        Random random = new Random();
        int[] tag = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        StringBuilder fourNumber = new StringBuilder();
        int tempIndex;
        while (fourNumber.length() != LENGTH) {

            tempIndex = random.nextInt(BOUND_NUMBER);

            if (tag[tempIndex] == 0) {
                fourNumber.append(tempIndex);
                tag[tempIndex] = 1;
            }
        }
        return fourNumber.toString();
    }
}
