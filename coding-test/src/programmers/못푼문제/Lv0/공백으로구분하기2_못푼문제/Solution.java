package programmers.못푼문제.Lv0.공백으로구분하기2_못푼문제;

public class Solution {
    public static void main(String[] args) {

        String my_string = "i  love you";
        String[] answer = my_string.trim().split("\\s+");
        System.out.println(answer.length);
    }
}
