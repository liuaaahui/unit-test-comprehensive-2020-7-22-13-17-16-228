package example;

import java.util.Random;

public class CreateAnswer implements AnswerGenerater {

    private static final int BOUND_NUMBER = 10;
    private static final int LENGTH = 4;

    @Override
    public String generate() {
        Random random = new Random();
        int tag[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        String fourNumber = "";
        int tempIndex = 0;
        while (fourNumber.length() != LENGTH) {

            tempIndex = random.nextInt(BOUND_NUMBER);

            if (tag[tempIndex] == 0) {
                fourNumber += tempIndex;
                tag[tempIndex] = 1;
            }
        }
        //TODO DELETE
        System.out.println(fourNumber);
        return fourNumber;
    }
}
