package baseball;

import camp.nextstep.edu.missionutils.Console;

public class Input {
    public String inputNumber() {
        System.out.print("숫자를 입력해주세요 : ");
        String ballNumber = Console.readLine();
        validateInputNumber(ballNumber);
        return ballNumber;
    }

    public String inputRestartCode() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String code = Console.readLine();
        validateRestartCode(code);
        return code;
    }

    public void validateRestartCode(String code) {
        if(!(code.equals("1") || code.equals("2"))) {
            throw new IllegalArgumentException();
        }
    }

    public void validateInputNumber(String value) {
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
