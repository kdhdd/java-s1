package programmers.Lv0.n보다커질때까지더하기;

public class Solution {
    public static void main(String[] args) {

        int[] numbers = {34, 5, 71, 29, 100, 34};
        int n = 123;

        int answer = 0;
        for (int i=0; i<numbers.length; i++) {
            answer += numbers[i];
            if (answer > n)
                break;
        }

        System.out.println(answer);
    }
}
