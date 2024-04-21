package baseball;

import java.util.List;

public class Balls {

    private final List<Ball> balls;

    public Balls(List<Ball> balls) {
        this.balls = balls;
        validateBalls();
    }

    public List<Ball> getBalls() {
        return balls;
    }

    private void validateBalls() {
        validateDuplication();
    }

    private void validateDuplication() {
        int duplicateCount = 2;
        for (Ball ball : balls) {
            if (containCount(ball) == duplicateCount) {
                throw new IllegalArgumentException();
            }
        }
    }

    private int containCount(Ball checkBall) {
        int count = 0;
        for (Ball ball : balls) {
            if (ball.equals(checkBall)) {
                count++;
            }
        }
        return count;
    }
}
