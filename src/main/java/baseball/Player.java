package baseball;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Integer> number;

    public Player() {
        number = new ArrayList<>();
    }

    public List<Integer> getNumber() {
        return number;
    }

    public void guessNumber() {
        while (true) {
            System.out.println("숫자를 입력해주세요: ");
            String input = Console.readLine().trim();

            if (input.length() != 3) {
                System.out.println("숫자는 3자리를 입력해야 합니다.");
                throw new IllegalArgumentException();
            }

            for (int i = 0; i < input.length(); i++) {
                char digit = input.charAt(i);
                if (!Character.isDigit(digit)) {
                    System.out.println("숫자가 아닌 문자가 포함되어 있습니다.");
                    number.clear();
                    throw new IllegalArgumentException();
                }
                int num = Character.getNumericValue(digit);
                number.add(num);
            }

            break;
        }
    }
}
