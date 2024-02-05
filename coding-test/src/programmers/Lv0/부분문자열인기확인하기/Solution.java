package programmers.Lv0.부분문자열인기확인하기;

public class Solution {
    public static void main(String[] args) {

        String my_string = "banana";
        String target = "wxyz";

        int answer = 0;
        if (my_string.contains(target))
            answer = 1;
        System.out.println(answer);
    }
}
