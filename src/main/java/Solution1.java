import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Ikechi Ucheagwu
 * @created 14/04/2023 - 11:18
 * @project AssecoInterview
 */

public class Solution1 {

    public static void main(String[] args) {

        Solution1 obj = new Solution1();
        int result = obj.solution(new int[]{9, 3, 9, 3, 9, 7, 9});

        System.out.println(result);
    }

    private int solution(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int j : A) {
            if (map.containsKey(j)) {
                map.put(j, map.get(j) + 1);
            } else {
                map.put(j, 1);
            }
        }


        for (var i : map.keySet()) {
            if (map.get(i) == 1)  {
                return i;
            }
        }

        return -1;
    }
}


