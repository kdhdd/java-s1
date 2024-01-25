package programmers.Lv0.Stream사용.짝수는싫어요_Stream사용;

import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(i % 2 == 1){
                answer.add(i);
            }
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}

class SolutionMain {
    public static void main(String[] args) {
        Solution s = new Solution();
        int n = 10;
        int[] result = s.solution(n);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
