package baseball.ballgenerator;

import baseball.Ball;
import baseball.Balls;
import baseball.Input;
import java.util.ArrayList;
import java.util.List;

public class InputGenerator implements BallsGenerator {

    public Balls createBalls() {
        List<Ball> ballsStore = new ArrayList<>();

        Input input = new Input();
        String inputNumbers = input.inputNumber();
        String[] splitNumbers = inputNumbers.split("");
        int position = 0;

        for (String number : splitNumbers) {
            ballsStore.add(new Ball(Integer.parseInt(number),position++));
        }

        return new Balls(ballsStore);
    }
}
