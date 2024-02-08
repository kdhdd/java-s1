package programmers.Lv1.자릿수더하기;

public class Solution {
    public static void main(String[] args) {

        int N = 123;
        int answer = 0;

        String str = Integer.toString(N);
        String[] str_num = str.split("");
        for (String s : str_num) {
            answer += Integer.parseInt(s);
        }
        System.out.println(answer);
    }
}
