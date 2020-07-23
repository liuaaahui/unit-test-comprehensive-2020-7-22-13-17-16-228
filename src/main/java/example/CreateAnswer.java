package example;

import java.util.Random;

public class CreateAnswer implements AnswerGenerater {
    @Override
    public String generate() {
        Random r = new Random();
        int tag[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        String four = "";
        int temp = 0;
        while (four.length() != 4) {
            temp = r.nextInt(10);
            if (tag[temp] == 0) {
                four += temp;
                tag[temp] = 1;
            }
        }
        System.out.println(four);
        return four;
    }
}
