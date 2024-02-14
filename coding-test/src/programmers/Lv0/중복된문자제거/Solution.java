package programmers.Lv0.중복된문자제거;

public class Solution {
    public static void main(String[] args) {

        String my_string = "We are the world";

        String answer = "";
        for (char c : my_string.toCharArray()) {
            String s = Character.toString(c);
            if (!(answer.contains(s))) {
                answer += s;
            }
        }

        System.out.println(answer);
    }
}
