package programmers.Lv0.문자열뒤집기;

public class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder(my_string);
        sb.reverse();
        return sb.toString();
    }
}

class SolutionMain {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String my_string = "jaron";
        System.out.println(solution.solution(my_string));
    }
}
