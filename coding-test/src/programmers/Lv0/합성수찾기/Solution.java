package programmers.Lv0.합성수찾기;

public class Solution {
    public static void main(String[] args) {

        int n = 10;
        int answer = 0;

        for (int i=1; i<=n; i++) {
            int cnt = 0;
            for (int j=1; j<=i; j++) {
                if (i % j == 0) {
                    cnt += 1;
                }
            }
            if (cnt >= 3) {
                answer += 1;
            }
        }
        System.out.println(answer);
    }
}
