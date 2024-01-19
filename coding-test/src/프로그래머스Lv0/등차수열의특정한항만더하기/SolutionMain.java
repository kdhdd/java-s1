package programmers.Lv0.등차수열의특정한항만더하기;

public class SolutionMain {

    public static void main(String[] args) {
        Solution solution = new Solution();

        boolean[] included = {true, false, false, true, true};

        int result = solution.solution(3, 4, included);

        System.out.println(result);
    }
}
