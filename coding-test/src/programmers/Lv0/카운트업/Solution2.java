package programmers.Lv0.카운트업;

import java.util.stream.IntStream;

public class Solution2 {
    public int[] solution(int start_num, int end_num) {

        return IntStream.rangeClosed(1, 10).toArray();
    }
}
