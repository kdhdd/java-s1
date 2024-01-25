package programmers.Lv0.특정문자제거하기;

public class Solution {
    public String solution(String my_string, String letter) {
        return my_string.replace(letter, "");
    }
}

class SolutionMain {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String my_string = "abcdef";
        String letter = "f";
        System.out.println(solution.solution(my_string, letter));
    }
}