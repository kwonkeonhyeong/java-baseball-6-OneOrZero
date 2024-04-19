package baseball;

import java.util.Arrays;

public class Score {
    public static int nothing;
    public static int ball;
    public static int strike;

    public static void score(Integer[] computerNumber, Integer[] playerNumber) {
        nothing = 0;
        ball = 0;
        strike = 0;
        for (int i =0; i<playerNumber.length; i++){
            if (computerNumber[i] != playerNumber[i]){
                if(Arrays.asList(playerNumber).contains(computerNumber[i])){
                    ball++;
                }else{
                    nothing ++;
                }
            }else{
                strike++;
            }
        }
        switch (strike) {
            case 0 :
                if (ball>0){
                    System.out.println(ball + "볼");
                }else{
                    System.out.println("낫싱");
                } break;

            case 1 :
            case 2 :
                if (ball>0){
                    System.out.println(ball + "볼" + " " + strike + "스트라이크");
                }else{
                    System.out.println(strike + "스트라이크");
                } break;
            case 3 :
                System.out.println(strike + "스트라이크");
                System.out.print("3개의 숫자를 모두 맞히셨습니다!");
                System.out.println("게임 종료");
        }
    }
}
