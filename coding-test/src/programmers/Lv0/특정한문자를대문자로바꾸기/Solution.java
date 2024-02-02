package programmers.Lv0.특정한문자를대문자로바꾸기;

public class Solution {
    public static void main(String[] args) {

        String my_string = "programmers";
        String alp = "p";

        String answer = "";
        for (char c : my_string.toCharArray()) {
            String s = Character.toString(c);
            if (s.equals(alp)) {
                answer += s.toUpperCase();
            } else {
                answer += s;
            }
        }
        System.out.println(answer);

    }
}
