package programmers.Lv0._369게임;

public class Solution {
    public static void main(String[] args) {

        int order = 29423;

        String s = ""+order;
        int answer = 0;
        for (char c : s.toCharArray()) {
            if (c == '3')
                answer += 1;
            else if (c == '6')
                answer += 1;
            else if (c == '9')
                answer += 1;
        }
        System.out.println(answer);
    }
}
