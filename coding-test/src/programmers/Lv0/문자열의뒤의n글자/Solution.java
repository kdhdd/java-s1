package programmers.Lv0.문자열의뒤의n글자;

public class Solution {
    public String solution(String my_string, int n) {
        String answer = "";

        answer += my_string.substring(my_string.length() - n);

        return answer;
    }
}

class SolutionMain {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String my_string = "ProgrammerS123";
        int n = 11;
        System.out.println(solution.solution(my_string, n));
    }
}
