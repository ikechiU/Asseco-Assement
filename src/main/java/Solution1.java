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
        //A non-empty array A consisting of N integers is given. The array contains an odd number of elements, and each
        //element of the array can be paired with another element that has the same value, except for one element that is left unpaired.
        //For example, in array A such that:
        //  A[0] = 9  A[1] = 3  A[2] = 9
        //  A[3] = 3  A[4] = 9  A[5] = 7
        //  A[6] = 9
        //the elements at indexes 0 and 2 have value 9,
        //the elements at indexes 1 and 3 have value 3,
        //the elements at indexes 4 and 6 have value 9,
        //the element at index 5 has value 7 and is unpaired.

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


