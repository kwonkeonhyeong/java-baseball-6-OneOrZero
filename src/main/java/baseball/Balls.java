package baseball;

import java.util.List;

public class Balls {
    private final List<Ball> balls;

    public Balls(List<Ball> balls) {
        this.balls = balls;
        validateBalls();
    }

    public void validateBalls() {
        validateDuplication();
    }

    public void validateDuplication() {
        for (Ball ball : balls) {
            if(containCount(ball) == 2) {
                throw new IllegalArgumentException();
            }
        }
    }

    public int containCount(Ball checkBall) {
        int count = 0;
        for (Ball ball : balls) {
            if(ball.equals(checkBall)) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        return "Balls{" +
                "balls=" + balls +
                '}';
    }
}
