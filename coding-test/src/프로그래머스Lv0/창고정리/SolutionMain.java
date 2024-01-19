package programmers.Lv0.창고정리;

public class SolutionMain {

    public static void main(String[] args) {
        String[] storage = {"pencil", "pencil", "pencil", "book"};
        int[] num = {2, 4, 3, 1};

        Solution solution = new Solution();
        String result = solution.solution(storage, num);
        System.out.println(result);
    }
}
