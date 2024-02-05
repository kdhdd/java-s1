package programmers.못푼문제.Lv0.자릿수더하기_못푼문제;

public class Solution {
    public static void main(String[] args) {
        int answer = 0;
        int n = 1234;

        //1의 자리수를 더하고 소거해나가는 방법
        while (n > 0) {
            answer += n % 10;
            n /= 10;
        }

        System.out.println(answer);
    }
}
