package baseball;

import camp.nextstep.edu.missionutils.Console;

public class Input {
    public String inputNumber() {
        System.out.print("숫자를 입력해주세요 : ");
        String ballNumber = Console.readLine();
        validateInputValue(ballNumber);
        return ballNumber;
    }

    public void validateInputValue(String value) {
        validateNumeric(value);
        validateInputLength(value);
    }

    public void validateNumeric(String value) {
        if (!value.matches("^[0-9]*$")) {
            throw new IllegalArgumentException();
        }
    }

    public void validateInputLength(String value) {
        if (value.length() != 3) {
            throw new IllegalArgumentException();
        }
    }
}
