import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class Solution {

    public int solution(int[] A) {

        int pairless = 0;

        Map<Integer, Integer> map = new Hashtable<>();

        for(int element: A) {
            if(map.containsKey(element)) {
                int num = map.get(element);
                map.put(element, ++num);
            } else {
                map.put(element, 1);
            }
        }


        List<Integer> keys = new ArrayList<>(map.keySet());
        for (Integer key: keys) {

            if(map.get(key) %2 != 0) {
                pairless = key;
                break;

            }
        }

        return pairless;

    }// end of method
}