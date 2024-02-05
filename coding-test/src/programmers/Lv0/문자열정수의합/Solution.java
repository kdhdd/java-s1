package programmers.Lv0.문자열정수의합;

public class Solution {
    public static void main(String[] args) {

        String num_str = "123456789";
        int answer = 0;

        for (char c : num_str.toCharArray()) {
                String s = Character.toString(c);
                answer += Integer.parseInt(s);
        }
        System.out.println(answer);

    }
}
