package baseball;

import static baseball.constants.Constants.BALLS_SIZE;
import static baseball.constants.Constants.EXIT;
import static baseball.constants.Constants.INPUT_NUMBER_MESSAGE;
import static baseball.constants.Constants.INPUT_RESTART_CODE_MESSAGE;
import static baseball.constants.Constants.NUMERIC_REGEX;
import static baseball.constants.Constants.RESTART;

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

    private void validateRestartCode(String code) {
        if(!(code.equals(RESTART) || code.equals(EXIT))) {
            throw new IllegalArgumentException();
        }
    }

    private void validateInputNumber(String value) {
        validateNumeric(value);
        validateInputLength(value);
    }

    private void validateNumeric(String value) {
        if (!value.matches(NUMERIC_REGEX)) {
            throw new IllegalArgumentException();
        }
    }

    private void validateInputLength(String value) {
        if (value.length() != BALLS_SIZE) {
            throw new IllegalArgumentException();
        }
    }
}
