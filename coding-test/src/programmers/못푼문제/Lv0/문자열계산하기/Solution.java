package programmers.못푼문제.Lv0.문자열계산하기;

public class Solution {
    public static void main(String[] args) {

        String my_string = "3 + 4";
        int answer = 0;

        String[] arr = my_string.split(" ");
        //System.out.println(Arrays.toString(arr));

        answer += Integer.parseInt(arr[0]);

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i].equals("+")) {
                answer += Integer.parseInt(arr[i + 1]);
            }
            if (arr[i].equals("-")) {
                answer -= Integer.parseInt(arr[i + 1]);
            }
        }

        System.out.println(answer);
    }
}
