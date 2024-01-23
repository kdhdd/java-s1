package programmers.Lv0.Stream사용.배열만들기1_Stream사용;

public class SolutionMain {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int n = 15;
        int k = 5;

        int[] res = solution.solution(n, k);
        for (int re : res) {
            System.out.println(re);
        }
    }
}
