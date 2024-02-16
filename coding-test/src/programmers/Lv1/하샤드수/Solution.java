package programmers.Lv1.하샤드수;

public class Solution {
    public static void main(String[] args) {

        int x = 11;
        boolean answer = true;

        int a = x;
        int h = 0;
        while (a > 0) {
            h += a % 10;
            a /= 10;
        }

        if (x % h != 0)
            answer = false;

        System.out.println(answer);
    }
}
