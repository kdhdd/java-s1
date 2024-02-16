package programmers.Lv1.음양더하기;

public class Solution {
    public static void main(String[] args) {

        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};
        int answer = 0;

        for (int i = 0; i < absolutes.length; i++) {
            if (!signs[i]) {
                absolutes[i] -= absolutes[i]*2;
            }
        }

        for (int absolute : absolutes) {
            answer += absolute;
        }
        System.out.println(answer);
    }
}
