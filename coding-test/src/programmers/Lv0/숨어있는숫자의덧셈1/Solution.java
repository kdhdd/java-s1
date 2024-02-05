package programmers.Lv0.숨어있는숫자의덧셈1;

public class Solution {
    public static void main(String[] args) {

        String my_string = "aAb1B2cC34oOp";
        int answer = 0;

        String num_string = my_string.replaceAll("[^0-9]", "");
        for (char c : num_string.toCharArray()) {
            answer += Character.getNumericValue(c);
        }
        System.out.println(answer);
    }
}
