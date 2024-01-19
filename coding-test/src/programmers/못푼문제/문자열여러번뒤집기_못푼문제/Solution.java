package programmers.못푼문제.문자열여러번뒤집기_못푼문제;

public class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] charArr = my_string.toCharArray();

        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];

            while (start < end) {
                char temp = charArr[start];
                charArr[start] = charArr[end];
                charArr[end] = temp;

                start++;
                end--;
            }
        }

        String answer = String.valueOf(charArr);

        return answer;
    }
}
