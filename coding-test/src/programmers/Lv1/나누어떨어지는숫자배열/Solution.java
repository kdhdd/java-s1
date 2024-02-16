package programmers.Lv1.나누어떨어지는숫자배열;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {

        int[] arr = {3, 2, 6};
        int divisor = 10;

        int[] answer = Arrays.stream(arr).filter(i -> i % divisor == 0).toArray();
        if (answer.length == 0)
            answer = new int[] {-1};

/*        Arrays.sort(arr);
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0)
                count++;
        }

        int[] answer;

        if (count == 0) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = new int[count];
            int idx = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % divisor == 0)
                    answer[idx++] = arr[i];
            }
        }*/

        System.out.println(Arrays.toString(answer));


    }
}
