package programmers.Lv0.부분문자열이어붙여문자열만들기;

public class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        for (int i = 0; i < my_strings.length; i++) {
            for (int j = parts[i][0]; j <= parts[i][1]; j++) {
                answer += my_strings[i].charAt(j);
            }
        }
        return answer;
    }
}

class SolutionMain {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] my_strings = {"progressive", "hamburger", "hammer", "ahocorasick"};
        int[][] parts = {{0, 4}, {1, 2}, {3, 5}, {7, 7}};

        System.out.println(solution.solution(my_strings, parts));
    }
}