package baseball;

import static baseball.Constants.MAX_NUMBER;
import static baseball.Constants.MIN_NUMBER;

import java.util.Objects;

public class Ball {
    private final int number;
    private final int position;

    public Ball(int number, int position) {
        this.number = number;
        this.position = position;
        validateBall();
    }

    public void validateBall() {
        validateRange();
    }

    public void validateRange() {
        if (number < MIN_NUMBER || number > MAX_NUMBER) {
            throw new IllegalArgumentException();
        }
    }

    public Boolean checkPosition(Ball checkBall) {
        if(checkBall.getPosition() == position) {
            return true;
        }
        return false;
    }

    private int getPosition() {
        return position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Ball ball)) {
            return false;
        }
        return number == ball.number;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(number);
    }
}
