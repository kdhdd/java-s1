package programmers.Lv0.외계행성의나이;

public class Solution {
    public static void main(String[] args) {

        int age = 23;
        String answer = "";

        String s = Integer.toString(age);
        for (char c : s.toCharArray()) {
            int i = c - '0';
            char ch = (char)(i + 97);
            answer += ch;
        }
        System.out.println(answer);
    }
}
