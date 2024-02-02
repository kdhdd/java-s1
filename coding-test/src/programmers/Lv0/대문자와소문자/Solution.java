package programmers.Lv0.대문자와소문자;

public class Solution {
    public static void main(String[] args) {

        String my_string = "abCdEfghIJ";
        String answer = "";

        for (char c : my_string.toCharArray()) {
            String s = "";
            if (Character.isUpperCase(c)) {
                s = Character.toString(c);
                answer += s.toLowerCase();
            } else {
                s = Character.toString(c);
                answer += s.toUpperCase();
            }
        }

        System.out.println(answer);
    }
}
