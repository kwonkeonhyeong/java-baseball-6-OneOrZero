package baseball;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Application {
    // AI 선택한 숫자 저장 리스트
    private List<Integer> aiNumbers = new ArrayList<>();
    private Scanner key = new Scanner(System.in);

    // 게임 시작
    public void startGame() {
        System.out.println("숫자 야구 게임을 시작!!!.");
        while (true) {
            // 컴퓨터 숫자 생성함
            aiRandom();
            boolean Finished = false;
            // 내가 정답을 맞출 때까지 게임 반복함
            while (!Finished) {
                System.out.print("숫자를 입력해주세요 : ");
                String input = key.nextLine();
                try {
                    // 내가 입력한 숫자 결과
                    Finished = checkGuess(input);
                } catch (IllegalArgumentException e) {
                    // 잘못된 입력
                    System.out.println(e.getMessage());
                    return;
                }
            }
            // 게임 재시작 or 종료
            System.out.println("1번 : 게임 새로하기 , 2번 게임 종료 ");
            String option = key.nextLine();
            if (!"1".equals(option)) {
                System.out.println("---게임 종료---");
                break;
            }
        }
    }

    // AI 숫자 3개를 랜덤 뽑기
    private void aiRandom() {
        aiNumbers.clear();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        for (int i = 0; i < 3; i++) {
            aiNumbers.add(numbers.get(i));
        }
    }

    // 내가 입력한 숫자를 검색하고 힌트를 제공함
    private boolean checkGuess(String input) {
        if (input.length() != 3) {
            throw new IllegalArgumentException("세자리 입력하세요.");
        }

        int strikes = 0;
        int balls = 0;
        for (int i = 0; i < 3; i++) {
            int number = Character.getNumericValue(input.charAt(i));
            if (number < 1 || number > 9) {
                throw new IllegalArgumentException("1에서 9까지 숫자 입력하세요.");
            }
            if (number == aiNumbers.get(i)) {
                strikes++; // 스트라이크 판단
            } else if (aiNumbers.contains(number)) {
                balls++; // 볼 판단
            }
        }

        // 결과
        if (strikes == 0 && balls == 0) {
            System.out.println("낫싱");
        } else if (strikes == 3) {
            System.out.println("3스트라이크\n3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            return true; // 게임 종료 조건
        } else {
            System.out.println(balls + "볼 " + strikes + "스트라이크");
        }
        return false;
    }

    public static void main(String[] args) {
        Application game = new Application();
        game.startGame(); // 게임 시작
    }
}
