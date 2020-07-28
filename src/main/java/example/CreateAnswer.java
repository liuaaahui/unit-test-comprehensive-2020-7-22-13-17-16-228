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
        //TODO NAMING
        int temp = 0;
        while (fourNumber.length() != LENGTH) {

            temp = random.nextInt(BOUND_NUMBER);

            if (tag[temp] == 0) {
                fourNumber += temp;
                tag[temp] = 1;
            }
        }
        //TODO DELETE
        System.out.println(fourNumber);
        return fourNumber;
    }
}
