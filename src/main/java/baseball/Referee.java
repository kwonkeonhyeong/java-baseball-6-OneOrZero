package baseball;


import static baseball.constants.JudgementBall.BALL;
import static baseball.constants.JudgementBall.OUT;
import static baseball.constants.JudgementBall.STRIKE;

import baseball.constants.JudgementBall;
import java.util.ArrayList;
import java.util.List;

public class Referee {

    private final Balls computerBalls;
    private final Balls playerBalls;

    public Referee(Balls computerBalls, Balls playerBalls) {
        this.computerBalls = computerBalls;
        this.playerBalls = playerBalls;
    }

    public List<JudgementBall> provideHint() {
        List<JudgementBall> hint = new ArrayList<>();
        for (Ball ball : playerBalls.getBalls()) {
            hint.add(judgeBall(computerBalls, ball));
        }
        return hint;
    }

    private JudgementBall judgeBall(Balls computerBalls, Ball playBall) {
        List<Ball> balls = computerBalls.getBalls();
        for (int i = 0; i < balls.size(); i++) {
            Ball ball = balls.get(i);
            if(ball.equals(playBall) && ball.checkPosition(playBall)) {
                return STRIKE;
            } else if (ball.equals(playBall) && !ball.checkPosition(playBall)) {
                return BALL;
            }
        }
        return OUT;
    }
}

