package programmers.Lv0.가채점;

public class SoltuionMain {

    public static void main(String[] args) {
        Soltuion soltuion = new Soltuion();

        int[] numbers = {3, 4};
        int[] our_score = {85, 93};
        int[] score_list = {85, 92, 38, 93, 48, 85, 92, 56};

        String[] result = soltuion.solution(numbers, our_score, score_list);
        for (String s : result) {
            System.out.println(s);
        }
    }
}
