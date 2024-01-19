package programmers.Lv0.머쓱이보다키큰사람_Stream사용;

import java.util.Arrays;

public class Solution {
    public int solution(int[] array, int height) {
        return (int) Arrays.stream(array)
                .filter(i -> i > height).count();
    }
}
