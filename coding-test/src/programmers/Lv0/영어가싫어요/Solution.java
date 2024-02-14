package programmers.Lv0.영어가싫어요;

public class Solution {
    public static void main(String[] args) {

        String numbers = "onetwothreefourfivesixseveneightnine";
        numbers = numbers.replace("one", "1")
                .replace("two", "2")
                .replace("three", "3")
                .replace("four", "4")
                .replace("five", "5")
                .replace("six", "6")
                .replace("seven", "7")
                .replace("eight", "8")
                .replace("nine", "9")
                .replace("zero", "0");
        long answer = Long.parseLong(numbers);
        System.out.println(answer);
    }
}
