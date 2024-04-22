package baseball;

import camp.nextstep.edu.missionutils.Console;

public class Application {

    public static void main(String[] args) {
        boolean restart = true;
        while (restart) {
            System.out.println("숫자 야구 게임을 시작합니다.");

            Computer computer = new Computer();
            computer.generateNumber();

            boolean correct = false;
            while (!correct) {
                Player player = new Player();
                try {
                    player.guessNumber();
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                    return;
                }
                correct = computer.checkAnswer(player.getNumber());
            }

            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");

            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            String input = Console.readLine();
            int choice = Integer.parseInt(input);

<<<<<<< HEAD
            if (choice != 1) {
=======
            if (choice == 2) {
>>>>>>> origin/yujin
                restart = false;
            }
        }
    }
}
