package programmers.못푼문제.Lv0.x사이의개수_못푼문제;

public class Solution {
    public static void main(String[] args) {

        String myString = "oxooxoxxox";

        String[] result = myString.split("x", myString.length());
        int[] answer = new int[result.length];

        for (int i=0; i< answer.length; i++) {
            answer[i] = result[i].length();
        }

        for (String s : result) {
            System.out.println(s);
        }
    }
}
