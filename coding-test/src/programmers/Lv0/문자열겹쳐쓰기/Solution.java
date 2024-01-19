package programmers.Lv0.문자열겹쳐쓰기;

public class Solution {
    public String solution(String my_stirng, String overwrite_string, int s) {
        String answer = "";

        char[] charArr = my_stirng.toCharArray();
        char[] overArr = overwrite_string.toCharArray();
        for (int i = s; i < s + overArr.length; i++) {
            charArr[i] = overArr[(i - s)];
        }

        for (int i = 0; i < charArr.length; i++) {
            answer += charArr[i];
        }

        return answer;
    }
}
