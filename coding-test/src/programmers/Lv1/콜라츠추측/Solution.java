package programmers.Lv1.콜라츠추측;

public class Solution {
    public static void main(String[] args) {

        long n = 626331L;
        int answer = 0;

        while (n != 1) {
            if (answer == 500) {
                answer = -1;
                break;
            }

            if (n % 2 == 0) {
                n /= 2;
            }
            else {
                n *= 3;
                n += 1;
            }
            answer++;
        }

        System.out.println(answer);

    }
}
