package baseball;

import static baseball.Constants.BALL;
import static baseball.Constants.END_MESSAGE;
import static baseball.Constants.NOTING;
import static baseball.Constants.START_MESSAGE;
import static baseball.Constants.STRIKE;
import static baseball.Constants.STRIKE_AND_BALL;

import java.util.List;

public class Output {
    public void printStartGame() {
        System.out.println(START_MESSAGE);
    }

    public void printEndGame() {
        System.out.println(END_MESSAGE);
    }

    public void printHint(List<JudgementBall> hint) {
        int strike = 0;
        int ball = 0;
        for (JudgementBall judgementBall : hint) {
            if(judgementBall.equals(JudgementBall.STRIKE)) {
                strike++;
            } else if (judgementBall.equals(JudgementBall.BALL)) {
                ball++;
            }
        }

        if(strike + ball == 0) {
            System.out.println(NOTING);
            return;
        }

        if(strike != 0 && ball != 0) {
            System.out.printf(STRIKE_AND_BALL, strike, ball);
        } else if(ball == 0) {
            System.out.printf(STRIKE,strike);
        } else {
            System.out.printf(BALL,ball);
        }
    }
}
