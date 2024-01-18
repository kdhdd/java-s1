package 수조작하기2;

public class SolutionMain {

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] numlog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
        String res = solution.solution(numlog);
        System.out.println(res);
    }
}
