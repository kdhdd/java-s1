package programmers.Lv0.구로나눈나머지;

public class Solution {
    public int solution(String number) {
        char[] charArr = number.toCharArray();

        int answer = 0;

        for (int i = 0; i < charArr.length; i++) {
            answer += (int)(charArr[i] - '0');
        }

        answer %= 9;

        return answer;
    }
}
