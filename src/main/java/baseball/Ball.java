package baseball;

import java.util.Objects;

public class Ball {
    private final int number;

    public Ball(int number) {
        this.number = number;
        validateBall();
    }

    public void validateBall() {
        validateRange();
    }

    public void validateRange() {
        if (number < 1 || number > 9) {
            throw new IllegalArgumentException();
        }
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
