package programmers.Lv1.문자열다루기기본;

public class Solution {
    public static void main(String[] args) {

        String s = "a234";
        boolean answer = true;

        if (s.length() != 4 && s.length() != 6)
            answer = false;

        s = s.replaceAll("[^0-9]", "a");

        for (char c : s.toCharArray()) {
            if (c == 'a') {
                answer = false;
                break;
            }
        }

        System.out.println(answer);
    }
}
