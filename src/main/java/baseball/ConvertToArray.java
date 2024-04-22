package baseball;
import java.util.*;

public interface ConvertToArray {
    static Set<Integer> convert(int num) {
        String numStr = String.valueOf(num);
        Set<Integer> listNum = new LinkedHashSet<>();
        for (int i = 0; i < numStr.length(); i++) {
            int nums = numStr.charAt(i) - '0';
            listNum.add(nums);
        }
        return listNum;
    }
}