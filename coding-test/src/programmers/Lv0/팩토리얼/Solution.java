package programmers.Lv0.팩토리얼;

public class Solution {
    public static void main(String[] args) {

        int n = 7;
        int answer = 0;

        int result = 1;
        int count = 0;
        while (result <= n) {
            if (n == 1) {
                answer = count + 1;
            } else if (result == n) {
                answer = count;
                break;
            } else {
                answer = count;
                count++;
                result *= count;
            }
        }
        System.out.println(answer);
    }
}
