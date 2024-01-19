package programmers.Lv0.배열만들기1_Stream사용;

import java.util.stream.IntStream;

public class Solution {
    public int[] solution(int n, int k) {
        return IntStream.rangeClosed(k, n)
                .filter(item -> item % k == 0).toArray();

    }
}
