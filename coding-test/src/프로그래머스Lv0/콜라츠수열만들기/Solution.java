package programmers.Lv0.콜라츠수열만들기;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(int n) {

        List<Integer> list = new ArrayList<>();

        list.add(n);
        //n이 짝수일 때는 2로 나누고
        //n이 홀수일 때는 3 * n + 1
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
                list.add(n);
            } else {
                n = (3 * n) + 1;
                list.add(n);
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).intValue();
        }

        return answer;
    }
}
