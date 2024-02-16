package programmers.Lv0.자릿수더하기;

public class Solution {
    public static void main(String[] args) {
        int answer = 0;
        int n = 10;

        //1의 자리수를 더하고 소거해나가는 방법
        while (n > 0) {
            answer += n % 10;
            n /= 10;
        }

        System.out.println(answer);
    }
}
