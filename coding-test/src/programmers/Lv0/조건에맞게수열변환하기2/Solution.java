package programmers.Lv0.조건에맞게수열변환하기2;

import java.util.Arrays;

public class Solution {
    public int solution(int[] arr) {
        int count = 0;
        int[] beforeArr = new int[arr.length];

        while (true) {
            beforeArr = arr.clone();
            arr = Arrays.stream(arr)
                    .map(i -> i >= 50 && i % 2 == 0 ? i/2 : i < 50 && i % 2 == 1 ? i*2+1 : i)
                    .toArray();

        }
    }
}

class SolutionMain {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 100, 99, 98};

    }
}
