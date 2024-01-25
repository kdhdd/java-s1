package programmers.Lv0.문자반복출력하기;

public class Solution {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < n; j++) {
                sb.append(my_string.charAt(i));
            }
        }
        return sb.toString();
    }
}

class SolutionMain {
    public static void main(String[] args) {
        Solution s = new Solution();
        String my_string = "hello";
        int n = 3;
        System.out.println(s.solution(my_string, n));
    }
}


