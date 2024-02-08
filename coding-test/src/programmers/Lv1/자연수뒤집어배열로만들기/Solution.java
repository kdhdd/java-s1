package programmers.Lv1.자연수뒤집어배열로만들기;

public class Solution {
    public static void main(String[] args) {

        long n = 12345l;
        int[] answer = new int[String.valueOf(n).length()];
/*        for (int i=0; i< answer.length; i++) {
            if (n > 10) {
                answer[i] = (int) n % 10;
                n /= 10;
            } else {
                answer[i] = (int) n;
            }

        }*/
        int cnt = 0;
        while (n > 0) {
            answer[cnt++] = (int)(n % 10);
            n /= 10;
        }

        for (int i : answer) {
            System.out.println(i);
        }
    }
}
