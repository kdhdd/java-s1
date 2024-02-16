package programmers.Lv1.약수의개수와덧셈;

import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {

        int left = 13;
        int right = 17;
        int answer = 0;

        int[] arr = IntStream.rangeClosed(left, right).toArray();
        //System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 1; j <= arr[i]; j++) {
                if (arr[i] % j == 0)
                    count++;
            }
            //System.out.println(count);
            if (count % 2 == 0)
                answer += arr[i];
            else
                answer -= arr[i];
        }

        System.out.println(answer);

    }
}
