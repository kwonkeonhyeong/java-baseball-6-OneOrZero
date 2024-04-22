package baseball;

import java.util.*;

public class Player implements ConvertToArray{
    Set<Integer> plArray = new LinkedHashSet<>();
    public Integer[] playerNum() {
        System.out.print("숫자를 입력해주세요 : ");
        int plNumber = Integer.parseInt(Console.readLine());
        if(plNumber < 100 || plNumber > 999){
            System.out.println("숫자는 세자리수로 입력되어야 합니다. ");
            throw new IllegalArgumentException();
        } plArray = ConvertToArray.convert(plNumber);
        if (plArray.size() != 3){
            System.out.println("숫자를 중복해서 입력했습니다.");
            throw new IllegalArgumentException();
        }
        Integer[] player = plArray.toArray(new Integer[plArray.size()]);

        return player;
    }
}
