package 수열과구간쿼리4;

public class SolutionMain {

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 1}, {0, 3, 2}, {0, 3, 3}};

        int[] res = solution.solution(arr, queries);
        for (int re : res) {
            System.out.println(re);
        }
    }
}
