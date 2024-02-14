package programmers.Lv0.문자열정렬하기1;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {

        String my_string = "hi12393";
        my_string = my_string.replaceAll("[^0-9]", "");
        //replace는 첫번째 인자값에 문자열 -> 문자열 변환
        //replaceAll는 첫번째 인자값에 정규식 -> 문자열 변환
        int[] answer = new int[my_string.length()];
        for (int i=0; i< answer.length; i++) {
            answer[i] = my_string.charAt(i) - '0';
        }
        Arrays.sort(answer);
        for (int i : answer) {
            System.out.println(i);
        }
    }
}
