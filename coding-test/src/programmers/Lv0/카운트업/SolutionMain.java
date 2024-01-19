package programmers.Lv0.카운트업;

public class SolutionMain {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();

        int start_num = 3;
        int end_num = 10;

        int[] res = solution.solution(start_num, end_num);

        for (int re : res) {
            System.out.println(re);
        }
    }
}
