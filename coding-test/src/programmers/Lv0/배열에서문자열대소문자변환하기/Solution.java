package programmers.Lv0.배열에서문자열대소문자변환하기;

public class Solution {
    public static void main(String[] args) {

        String[] strArr = {"AAA", "BBB", "CCC", "DDD"};
        String[] answer = new String[strArr.length];

        for (int i=0; i< strArr.length; i++) {
            if (i % 2 == 0)
                answer[i] = strArr[i].toLowerCase();
            else
                answer[i] = strArr[i].toUpperCase();

        }
        for (String s : answer) {
            System.out.println(s);
        }
    }
}
