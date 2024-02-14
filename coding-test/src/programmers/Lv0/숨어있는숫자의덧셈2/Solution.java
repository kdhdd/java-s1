package programmers.Lv0.숨어있는숫자의덧셈2;

public class Solution {
    public static void main(String[] args) {

        String my_string = "aAb1B2cC34oOp";
        int answer = 0;

        my_string = my_string.replaceAll("[^0-9]", " ").trim();

        String[] strArr = my_string.split("\\s+");

        for (String s : strArr) {
            if (!s.isEmpty())
                answer += Integer.parseInt(s);
        }

        System.out.println(answer);
    }
}
