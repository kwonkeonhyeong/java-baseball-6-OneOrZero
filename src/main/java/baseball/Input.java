package baseball;

import static baseball.Constants.BALLS_SIZE;
import static baseball.Constants.EXIT;
import static baseball.Constants.INPUT_NUMBER_MESSAGE;
import static baseball.Constants.INPUT_RESTART_CODE_MESSAGE;
import static baseball.Constants.NUMERIC_REGEX;
import static baseball.Constants.RESTART;

import camp.nextstep.edu.missionutils.Console;

public class Input {
    public String inputNumber() {
        System.out.print(INPUT_NUMBER_MESSAGE);
        String ballNumber = Console.readLine();
        validateInputNumber(ballNumber);
        return ballNumber;
    }

    public String inputRestartCode() {
        System.out.println(INPUT_RESTART_CODE_MESSAGE);
        String code = Console.readLine();
        validateRestartCode(code);
        return code;
    }

    public void validateRestartCode(String code) {
        if(!(code.equals(RESTART) || code.equals(EXIT))) {
            throw new IllegalArgumentException();
        }
    }

    public void validateInputNumber(String value) {
        validateNumeric(value);
        validateInputLength(value);
    }

    public void validateNumeric(String value) {
        if (!value.matches(NUMERIC_REGEX)) {
            throw new IllegalArgumentException();
        }
    }

    public void validateInputLength(String value) {
        if (value.length() != BALLS_SIZE) {
            throw new IllegalArgumentException();
        }
    }
}
