package programmers.Lv0.배열의길이에따라다른연산하기;

public class Solution {
    public static void main(String[] args) {

        int[] arr = {49, 12, 100, 276, 33};
        int n = 27;

        if (arr.length % 2 == 0) {
            for (int i=0; i<arr.length; i++) {
                if (i % 2 == 1)
                    arr[i] += n;
            }
        } else {
            for (int i=0; i<arr.length; i++) {
                if (i % 2 == 0)
                    arr[i] += n;
            }
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
