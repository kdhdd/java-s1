package programmers.못푼문제.Lv0.문자개수세기;

public class SolutionMain {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String my_string = "Programmers";

        int[] res = solution.solution(my_string);

        for (int re : res) {
            System.out.println(re);
        }
    }
}
