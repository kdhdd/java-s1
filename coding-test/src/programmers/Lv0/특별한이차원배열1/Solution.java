package programmers.Lv0.특별한이차원배열1;

public class Solution {
    public static void main(String[] args) {

        int n = 3;

        int[][] answer = new int[n][n];
        for (int i=0; i< answer.length; i++) {
            for (int j=0; j<answer[i].length; j++) {
                if (i == j)
                    answer[i][j] = 1;
                else
                    answer[i][j] = 0;
            }
        }

        for (int[] ints : answer) {
            for (int anInt : ints) {
                System.out.println(anInt);
            }
        }
    }
}
