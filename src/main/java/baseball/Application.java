package baseball;

import java.util.*;


public class Application {
    public static  void main(String[] args) {
        // TODO: 프로그램 구현
        System.out.println("숫자 야구 게임을 시작합니다.");
        Scanner sc = new Scanner(System.in);
        Computer computer = new Computer();
        Player player = new Player();
        boolean gameRestart = true;
        while (gameRestart) {
            Integer[] computerNumber = computer.computerNum();
            System.out.println("컴퓨터 번호 : " + Arrays.toString(computerNumber));
            boolean again = true;

            while (again) {
                Integer[] playerNumber = player.playerNum();
                System.out.println("유저 번호 : " + Arrays.toString(playerNumber));
                Score.score(computerNumber, playerNumber);

                if (Score.strike == 3) {
                    again = false;
                }
            }

            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2을 입력하세요.");
            int answer = sc.nextInt();
            if (answer == 1) {
                gameRestart = true;
            } else if (answer == 2) {
                gameRestart = false;
            } else {
                System.out.println("잘못된 입력으로 게임을 종료합니다.");
                break;
            }
        }
    }
}