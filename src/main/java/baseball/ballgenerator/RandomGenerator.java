package baseball.ballgenerator;

import baseball.Ball;
import baseball.Balls;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class RandomGenerator implements BallsGenerator {
    public Balls createBalls() {
        List<Integer> computer = new ArrayList<>();
        while (computer.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }

        List<Ball> computerBalls = new ArrayList<>();
        int position = 0;
        for (Integer number : computer) {
            Ball ball = new Ball(number,position++);
            computerBalls.add(ball);
        }

        return new Balls(computerBalls);
    }
}
