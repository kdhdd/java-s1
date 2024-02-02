package programmers.Lv0.접미사인지확인하기;

public class Solution {
    public static void main(String[] args) {

        String my_string = "banana";
        String is_suffix = "nan";

        int answer = 0;
        if (my_string.endsWith(is_suffix)) {
            answer = 1;
        }
        System.out.println(answer);
    }
}
