package programmers.Lv1.나머지가1이되는수찾기;

public class Solution {
    public static void main(String[] args) {

        int n = 10;
        int answer = 0;

        for (int i=n; i>0; i--) {
            if (n % i == 1)
                answer = i;
        }
        System.out.println(answer);
    }
}
