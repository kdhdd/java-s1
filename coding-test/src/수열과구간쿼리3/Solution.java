package 수열과구간쿼리3;

public class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};

        for (int i = 0; i < queries.length; i++) {
            int temp = arr[queries[i][0]]; // temp = 0
            arr[queries[i][0]] = arr[queries[i][1]]; // arr[0] = 3
            arr[queries[i][1]] = temp;
        }

        answer = arr;

        return answer;
    }
}
