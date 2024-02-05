package programmers.Lv0.꼬리문자열;

public class Solution {
    public static void main(String[] args) {

        String[] str_list = {"abc", "def", "ghi"};
        String ex = "ef";
        String answer = "";

        for (String s : str_list) {
            if (s.contains(ex))
                continue;
            else
                answer += s;
        }
        System.out.println(answer);

    }
}
