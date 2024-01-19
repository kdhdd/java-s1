package programmers.Lv0.수열과구간쿼리4;

public class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};

        for (int i = 0; i < queries.length; i++) { //쿼리 배열을 꺼내기 위한 반복문
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (j % queries[i][2] == 0) {
                    arr[j] += 1;
                }
            }
        }

        answer = arr;

        return answer;
    }
}
