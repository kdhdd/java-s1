package programmers.Lv0.문자열내p와y의개수;

public class Solution {
    public static void main(String[] args) {

        String s = "Pyy";

        s = s.toLowerCase();
        /* int p_count = 0, y_count = 0;
        for (char c : s.toCharArray()) {
            if (Character.toString(c).equals("p"))
                p_count++;
            else if (Character.toString(c).equals("y"))
                y_count++;
        }

        boolean answer = true;

        if (!(p_count == y_count))
            answer = false; */

        // chars() : 문자열을 구성하고 있는 문자들의 ASCII 코드값을 스트림 형태로 뽑아준다.
        // IntStream stream = "Hello,World".chars(); //(72, 101, 108, 108, 111, 44, 87, 111, 114, 108, 100)
        boolean answer = s.chars().filter(e -> 'p'==e).count() == s.chars().filter(e -> 'y'==e).count();

        System.out.println(answer);
    }
}
