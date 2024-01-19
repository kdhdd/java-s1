package programmers.Lv0.수열과구간쿼리1;

public class SolutionMain {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {0, 1, 2, 3, 4};
        int[][] queries = {{0, 1}, {1, 2}, {2, 3}};

        int[] res = solution.solution(arr, queries);
        for (int re : res) {
            System.out.println(re);
        }
    }
}
