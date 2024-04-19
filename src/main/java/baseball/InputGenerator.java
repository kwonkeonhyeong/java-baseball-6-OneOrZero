package baseball;

import java.util.ArrayList;
import java.util.List;

public class InputGenerator {
    private Input input;

    public InputGenerator(Input input) {
        this.input = input;
    }

    public Balls createBalls() {
        List<Ball> ballsStore = new ArrayList<>();

        String inputNumbers = input.inputNumber();
        String[] splitNumbers = inputNumbers.split("");

        for (String number : splitNumbers) {
            ballsStore.add(new Ball(Integer.parseInt(number)));
        }

        return new Balls(ballsStore);
    }
}
