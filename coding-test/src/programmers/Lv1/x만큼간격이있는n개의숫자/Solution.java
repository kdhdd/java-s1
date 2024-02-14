package programmers.Lv1.x만큼간격이있는n개의숫자;

public class Solution {
    public static void main(String[] args) {

        int x = -4;
        int n = 2;
        long[] answer = new long[n];

        for (int i=0; i<n; i++) {
            answer[i] = x * ((long)i + 1);
        }

        for (long i : answer) {
            System.out.println(i);
        }
    }
}
