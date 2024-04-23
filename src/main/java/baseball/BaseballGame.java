package baseball;

import static baseball.constants.Constants.RESTART;

import baseball.ballgenerator.BallsGenerator;
import baseball.ballgenerator.InputGenerator;
import baseball.ballgenerator.RandomGenerator;
import baseball.constants.JudgementBall;
import java.util.List;

public class BaseballGame {

    private final Input input;
    private final Output output;
    private String code;

    public BaseballGame() {
        input = new Input();
        output = new Output();
    }

    public void gameCycle() {
        output.printStartGame();
        BallsGenerator computerGenerator = new RandomGenerator();
        BallsGenerator playerGenerator = new InputGenerator();

        Balls computerBalls = computerGenerator.createBalls();
        List<JudgementBall> hint;

        do {
            Balls playerBalls = playerGenerator.createBalls();
            Referee referee = new Referee(computerBalls, playerBalls);
            hint = referee.provideHint();
            output.printHint(hint);
        } while (checkFinish(hint));
        output.printEndGame();
        code = input.inputRestartCode();
    }

    public boolean checkRestart() {
        return code.equals(RESTART);
    }

    private boolean checkFinish(List<JudgementBall> hint) {
        return hint.contains(JudgementBall.BALL) || hint.contains(JudgementBall.OUT);
    }
}
