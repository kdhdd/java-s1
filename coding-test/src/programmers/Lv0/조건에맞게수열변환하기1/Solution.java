package programmers.Lv0.조건에맞게수열변환하기1;

public class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 == 0) {
                answer[i] = arr[i] / 2;
            } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                answer[i] = arr[i] * 2;
            } else {
                answer[i] = arr[i];
            }
        }
        return answer;
    }
}

class SolutionMain {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1, 2, 3, 100, 99, 98};
        int[] res = solution.solution(arr);
        for (int re : res) {
            System.out.println(re);
        }
    }
}
