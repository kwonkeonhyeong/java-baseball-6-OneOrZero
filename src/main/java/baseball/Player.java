package baseball;

import java.util.*;

public class Player implements ConvertToArray{
    Set<Integer> plArray = new LinkedHashSet<>();

    public Integer[] playerNum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력해주세요 : ");
        while (true) {
            if (sc.hasNextInt()) {
                int plNumber = sc.nextInt();
                if (plNumber < 100 || plNumber > 999) {
                    System.out.println("숫자는 세자리수로 입력되어야 합니다. ");
                    throw new IllegalArgumentException();
                }
                plArray = ConvertToArray.convert(plNumber);
                if (plArray.size() != 3){
                    System.out.println("숫자를 중복해서 입력했습니다.");
                    throw new IllegalArgumentException();
                }
                Integer[] player = plArray.toArray(new Integer[plArray.size()]);
                return player;
            } else {
                String input = sc.next();
                System.out.println(input + "은(는) 유효한 숫자가 아닙니다.");
                throw new IllegalArgumentException();
            }
        }
    }
}
