package programmers.못푼문제.Lv0.제곱수판별하기_못푼문제;

public class Solution {
    public static void main(String[] args) {

        int n = 976;

        int answer = 0;
        if (Math.sqrt(n) % 1 == 0) {
            answer = 1;
        } else {
            answer = 2;
        }
        System.out.println(answer);
    }
}
