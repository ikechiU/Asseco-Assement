import java.util.ArrayList;
import java.util.List;

/**
 * @author Ikechi Ucheagwu
 * @created 14/04/2023 - 11:51
 * @project AssecoInterview
 */


public class Solution3 {

    public static void main(String[] args) {
        //A non-empty array A consisting of N integers is given, write a function that returns the prime numbers in the array.
        //For example, given [3, 67, 12, 7, 11, 9], returns [3, 67, 7, 11]

        Solution3 obj = new Solution3();
        List<Integer> solution = obj.solution(new int[]{3, 67, 12, 7, 11, 9});
        System.out.println(solution);
    }

    private List<Integer> solution(int[] arr) {
        List<Integer> result = new ArrayList<>();
        for (int j : arr) {
            if (primeNum(j) != -1) {
                result.add(primeNum(j));
            }
        }
        return result;
    }

    public static int primeNum(int num) {
        if (num <= 1) return -1;
        if (num <= 3) return num;

        if (num % 2 == 0 || num % 3 == 0)
            return -1;

        for (int i = 5; i * i <= num; i = i + 6)
            if (num % i == 0 || num % (i + 2) == 0)
                return -1;

        return num;
    }
}
