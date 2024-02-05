package programmers.Lv0.주사위게임1;

public class Solution {
    public static void main(String[] args) {

        int a = 2;
        int b = 4;

        int answer = 0;
        if (a%2==1 && b%2==1) {
            answer = a*a + b*b;
        } else if (a%2==1 || b%2==1) {
            answer = 2 * (a + b);
        } else
            if (a > b) {
                answer = a - b;
            } else {
                answer = b - a;
            }
        System.out.println(answer);
    }
}
