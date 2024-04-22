package baseball;

import java.util.*;

public class Computer implements ConvertToArray{
    Set<Integer> cpArray = new LinkedHashSet<>();
    public Integer[] computerNum(){
        int cpNumber = Randoms.pickNumberInRange(100, 999);
        cpArray = ConvertToArray.convert(cpNumber);
        Iterator<Integer> iterator = cpArray.iterator();
        while (iterator.hasNext()){
            int i = iterator.next();
            if (i == 0){
                iterator.remove();
            }
        }
        while (cpArray.size() < 3) {
            int num = Randoms.pickNumberInRange(1, 9);
            cpArray.add(num);
        }
        Integer[] com = cpArray.toArray(new Integer[cpArray.size()]);

        return com;
    }
}
