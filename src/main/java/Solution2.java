import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author Ikechi Ucheagwu
 * @created 14/04/2023 - 11:35
 * @project AssecoInterview
 */

public class Solution2 {

    public static void main(String[] args) {

        Solution2 obj = new Solution2();
        int result = obj.solution(9); //2 -> 1001
        int result1 = obj.solution(529); //4 -> 1000010001
        int result2 = obj.solution(20); //1 -> 10100
        int result3 = obj.solution(15); //0 -> 1111
        int result4 = obj.solution(1041); //5 -> 10000010001
        int result5 = obj.solution(32); //100000 -> 0

        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
    }

    private int solution(int N) {
        String binary = Integer.toBinaryString(N);
        List<Integer> zerosLengths = new ArrayList<>();

        int count = 0;
        boolean isOne = false;

        for (int i = 0; i < binary.length(); i++) {
            if (isOne && binary.charAt(i) == '0') {
                count++;
            } else {
                if (binary.charAt(i) == '1') {
                    if (count != 0) {
                        zerosLengths.add(count);
                        count = 0;
                    }
                    isOne = true;
                }
            }
        }

        if (!zerosLengths.isEmpty()) {
            Collections.sort(zerosLengths);
            return zerosLengths.get(zerosLengths.size() - 1);
        }

        return 0;
    }
}
