package programmers.못푼문제.Lv0.문자열여러번뒤집기_못푼문제;

public class SolutionMain {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String my_string = "rermgorpsam";
        int[][] queries = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};

        System.out.println(solution.solution(my_string, queries));
    }
}
