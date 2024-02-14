package programmers.Lv0.순서쌍의개수;

import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {

        int n = 20;

//        int answer = 0;
//        for (int i=1; i<=n; i++) {
//            if (n % i == 0)
//                answer++;
//        }
//        System.out.println(answer);
        int answer = (int) IntStream.rangeClosed(1, n).filter(i -> n % i == 0).count();
        System.out.println(answer);
    }
}
