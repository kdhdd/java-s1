package 수열과구간쿼리3;

public class SolutionMain {

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] arr = {0, 1, 2, 3, 4};
        int[][] queries = {{0, 3}, {1, 2}, {1, 4}};

        int[] res = solution.solution(arr, queries);
        for (int re : res) {
            System.out.println(re);
        }
    }
}
