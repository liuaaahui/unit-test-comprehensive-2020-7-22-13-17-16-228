package example;

import java.util.Random;

public class CreateAnswer implements AnswerGenerater {
    @Override
    public String generate() {
        Random random = new Random();
        int tag[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        String fourNumber = "";
        int temp = 0;
        while (fourNumber.length() != 4) {
            temp = random.nextInt(10);
            if (tag[temp] == 0) {
                fourNumber += temp;
                tag[temp] = 1;
            }
        }
        System.out.println(fourNumber);
        return fourNumber;
    }
}
