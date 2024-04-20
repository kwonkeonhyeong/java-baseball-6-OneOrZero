package baseball;

import java.sql.SQLOutput;
import java.util.List;

public class Output {
    public void printStartGame() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public void printEndGame() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
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
            System.out.println("낫싱");
            return;
        }

        if(strike != 0 && ball != 0) {
            System.out.printf("%d볼 %d스트라이크\n", strike, ball);
        } else if(ball == 0) {
            System.out.printf("%d스트라이크\n",strike);
        } else {
            System.out.printf("%d볼\n",ball);
        }
    }
}
