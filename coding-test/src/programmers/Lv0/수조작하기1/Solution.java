package programmers.Lv0.수조작하기1;

public class Solution {
    public int solution(int n, String control) {
        int answer = 0;

        for (int i = 0; i < control.length(); i++) {
            char con = control.charAt(i);

            if (con == 'w') {
                n++;
            } else if (con == 's') {
                n--;
            } else if (con == 'd') {
                n += 10;
            } else if (con == 'a') {
                n -= 10;
            }
        }

        answer = n;

        return answer;
    }
}
