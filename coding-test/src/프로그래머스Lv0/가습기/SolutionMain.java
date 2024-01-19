package programmers.Lv0.가습기;

public class SolutionMain {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int humidity = 10;
        int val_set = 34;
        String mode_type = "minimum";

        int result = solution.solution(mode_type, humidity, val_set);
        System.out.println(result);
    }
}
