package baseball;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        System.out.println("게임을 시작합니다.");
        Input input = new Input();
        InputGenerator inputGenerator = new InputGenerator(input);
        System.out.println(inputGenerator.createBalls());
    }
}
