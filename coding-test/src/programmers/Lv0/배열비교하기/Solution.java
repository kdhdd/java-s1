package programmers.Lv0.배열비교하기;

public class Solution {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 3, 3, 3, 3};

        int answer = 0;
        if (arr1.length != arr2.length) {
            if (arr1.length > arr2.length)
                answer = 1;
            else
                answer = -1;
        } else {
            int sum1 = 0, sum2 = 0;
            for (int i=0; i<arr1.length; i++) {
                sum1 += arr1[i];
                sum2 += arr2[i];
            }
            if (sum1 > sum2)
                answer = 1;
            else if (sum1 < sum2)
                answer = -1;
        }
        System.out.println(answer);
    }
}
