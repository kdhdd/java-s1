package programmers.못푼문제.Lv1.푸드파이트대회;

public class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < food.length; i++) {
            int count = food[i] / 2;
            while (count > 0) {
                sb.append(i);
                count--;
            }
        }

        String answer = sb.toString() + "0" + sb.reverse().toString();

        return answer;
    }
}

class SolutionMain {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] food = {1, 3, 4, 6};

        System.out.println(s.solution(food));
    }
}
