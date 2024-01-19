package programmers.Lv0.등차수열의특정한항만더하기;

public class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;

        int[] ad = new int[included.length];
        ad[0] = a;
        for (int i = 1; i < included.length; i++) {
            ad[i] = ad[i - 1] + d;
        } //ad = {3, 7, 11, 15, 19}

        for (int i = 0; i < included.length; i++) {
            if (included[i]) {
                answer += ad[i];
            }
        }

        return answer;
    }
}
