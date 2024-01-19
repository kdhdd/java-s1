package programmers.Lv0.더크게합치기;

public class Solution {
    public int solution(int a, int b) {
        int answer = 0;

        //Integer.parseInt() 문자열을 정수로
        //Integer.toString() 정수를 문자열로

        String c = Integer.toString(a) + Integer.toString(b);
        String d = Integer.toString(b) + Integer.toString(a);

        if (Integer.parseInt(c) >= Integer.parseInt(d)) {
            answer = Integer.parseInt(c);
        } else {
            answer = Integer.parseInt(d);
        }

        return answer;
    }
}
