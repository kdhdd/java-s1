package programmers.Lv0.콜라츠수열만들기;

public class SolutionMain {

    public static void main(String[] args) {
        Solution solution = new Solution();

        int n = 10;
        int[] res = solution.solution(n);
        for (int re : res) {
            System.out.println(re);
        }
    }
}
